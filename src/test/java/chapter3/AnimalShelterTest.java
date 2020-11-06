package chapter3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class AnimalShelterTest {

    AnimalShelter as;
    @BeforeEach
    public void init(){
        as = new AnimalShelter();
        as.enqueue(new Dog("Watson"));
        as.enqueue(new Dog("Olive"));
        as.enqueue(new Dog("Molly"));
        as.enqueue(new Dog("Yoshi"));
        as.enqueue(new Dog("Yuri"));
        as.enqueue(new Dog("Snowee"));





    }

    @Test
    void enqueue() {
        as.printAllAnimal();
    }

    @Test
    void dequeueDog() {



    }

    @Test
    void dequeueCat() {

    }

    @Test
    void dequeueAny() {

    }
}