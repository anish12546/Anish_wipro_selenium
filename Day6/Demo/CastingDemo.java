package Assignmnet6;

class Animal {
    void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {

    void makeSound() {
        System.out.println("Woof!");
    }

    void fetch() {
        System.out.println("Dog fetches the ball!");
    }
}

public class CastingDemo {
    public static void main(String[] args) {
        Dog d = new Dog();   
        Animal a = d;        

        a.makeSound();      

        // a.fetch();        
        
        
        Dog dd=(Dog)a;
        dd.fetch();
    }
}
