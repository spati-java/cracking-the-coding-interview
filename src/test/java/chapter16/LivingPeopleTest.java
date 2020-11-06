package chapter16;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LivingPeopleTest {

    LivingPeople people;
    List<Person> personList;
    @BeforeEach
    public void  init() {
        people = new LivingPeople();
        personList = Arrays.asList(
                new Person(1900, 1948),
                new Person(1901, 1991),
                new Person(1900, 1930),
                new Person(1910, 1980),
                new Person(1930, 1980),
                new Person(1931, 1980)
                );

    }

    @Test
    void maxAliveYear() {

        int result = people.maxAliveYear(personList);
        System.out.println(result);

        int optimalRes = people.maxAliveUsingOptimalSolution(personList, 1900 , 2000);
        System.out.println("Optimal Solution " + optimalRes);

    }
}