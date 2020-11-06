package chapter3;

import java.util.LinkedList;

public class AnimalShelter {

    LinkedList<Dog> dogs = new LinkedList<>();
    LinkedList<Cat> cats = new LinkedList<>();

    private int order = 0;

    public void enqueue(Animal a) {

        a.setOrder(order);
        if(a instanceof  Dog) {
            dogs.addLast( (Dog) a );
        }else if(a instanceof Cat){
            cats.addLast((Cat)a);
        }

    }

    public void printAllAnimal(){
        this.dogs.forEach(d-> System.out.println(d.name));
    }

}



abstract class Animal {

    private int order;
    protected String name;

    public Animal(String name){
        this.name = name;
    }

    public void setOrder(int oder){
        this.order = order;
    }

    public  int getOrder(){
        return this.order;
    }

    public boolean isOlderAnimal(Animal a){
        return this.order < a.getOrder();
    }
}

class Cat extends Animal {
    public Cat(String n) {
        super(n);
    }
}

class Dog extends Animal {
    public Dog(String n) {
        super(n);
    }
}





