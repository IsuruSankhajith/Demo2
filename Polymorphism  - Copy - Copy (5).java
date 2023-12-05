# Base class
class Animal:
    def __init__(self, name):
        self.name = name

    def speak(self):
        raise NotImplementedError("Subclasses must implement the speak method")

# Derived class 1
class Dog(Animal):
    def speak(self):
        return f"{self.name} says Woof!"

# Derived class 2
class Cat(Animal):
    def speak(self):
        return f"{self.name} says Meow!"

# Example usage
dog_instance = Dog("Buddy")
cat_instance = Cat("Whiskers")

print(dog_instance.speak())  # Output: Buddy says Woof!
print(cat_instance.speak())  # Output: Whiskers says Meow!
