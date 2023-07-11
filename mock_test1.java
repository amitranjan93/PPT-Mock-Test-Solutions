
class Animals {
    public void makeSound() {
        System.out.println("Sound Made by Animal");
    }
}

class Dog extends Animals {
    public void makeSound() {
        System.out.println("Sound made by Dog");
    }
}

class Cat extends Animals {
    public void makeSound() {
        System.out.println("Sound made by Cat");
    }
}

class Cow extends Animals {
    public void makeSound() {
        System.out.println("Sound made by Cow");
    }
}

public class mock_test1 {
    public static void main(String[] args) {
        Animals a = new Dog();
        a.makeSound();
        Animals b = new Cat();
        b.makeSound();
        Animals c = new Cow();
        c.makeSound();
    }
}
