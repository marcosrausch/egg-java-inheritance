package domain;

public class Animal {
    protected String name;
    protected String food;
    protected byte age;
    protected String breed;
    
    public void hello() {
        System.out.println("Hi! I'm " + name + " and I love to eat " + food +".");
    }
    
    // constructors
    public Animal(String name, String food, byte age, String breed) {
        this.name = name;
        this.food = food;
        this.age = age;
        this.breed = breed;
    }

    public Animal() {
    }
    
    
}
