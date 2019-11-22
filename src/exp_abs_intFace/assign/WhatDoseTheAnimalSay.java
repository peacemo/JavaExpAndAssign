package exp_abs_intFace.assign;


abstract class Animal implements Swimmable{
    private String name;
    private String color;
    private String sort;

    public Animal(String _name, String _color, String _sort){
        this.name = _name;
        this.color = _color;
        this.sort = _sort;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getSort() {
        return sort;
    }

    abstract void eat();
    abstract void say();
}

interface Swimmable{
    void swim();
}

class Rabbit extends Animal {
    public Rabbit(String _name, String _color, String _sort) {
        super(_name, _color, _sort);
    }

    @Override
    public void eat(){
        System.out.println("Rabbits eat grass!");
    }

    @Override
    public void say(){
        System.out.println("Rabbits say nothing!");
    }

    @Override
    public void swim() {
        System.out.println("Rabbits cannot swim!");
    }
}

class Frog extends Animal {
    public Frog(String _name, String _color, String _sort) {
        super(_name, _color, _sort);
    }

    @Override
    void eat() {
        System.out.println("Frogs eat bugs!");
    }

    @Override
    void say() {
        System.out.println("Gooah gooah!");
    }

    @Override
    public void swim() {
        System.out.println("Frogs can swim!");
    }
}
public class WhatDoseTheAnimalSay {
    public static void showInfo(Animal animal){
        System.out.println("Name: " + animal.getName());
        System.out.println("Color: " + animal.getColor());
        System.out.println("Sort: " + animal.getSort());

    }

    public static void main(String[] args){
        Animal animal1 = new Rabbit("Tommy", "white", "mammal");
        showInfo(animal1);
        animal1.eat();
        animal1.say();
        animal1.swim();
        System.out.println("*****************************");
        Animal animal2 = new Frog("Karl", "green", "non-mammal");
        showInfo(animal2);
        animal2.eat();
        animal2.say();
        animal2.swim();
    }


}
