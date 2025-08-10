package Assignmnet6;

class Animal {
    void makeSound() {
        System.out.println("animal Sound");
    }
}

class Dog extends Animal {

    void makeSound() {
        System.out.println("bark");
    }

    void fetch() {
        System.out.println("Dog fetches");
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

