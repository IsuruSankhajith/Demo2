class Animal:
    def speak(self):
        pass

class Dog(Animal):
    def speak(self):
        return "Woof!"

class Cat(Animal):
    def speak(self):
        return "Meow!"

class Cow(Animal):
    def speak(self):
        return "Moo!"

# Function demonstrating polymorphism
def animal_sound(animal):
    return animal.speak()

# Creating instances of different animals
dog = Dog()
cat = Cat()
cow = Cow()

# Using the function with different types of animals
print(animal_sound(dog))  # Output: Woof!
print(animal_sound(cat))  # Output: Meow!
print(animal_sound(cow))  # Output: Moo!
