package chapter16;

import java.util.Arrays;
import java.util.List;

public class LivingPeople {


    int maxAliveUsingOptimalSolution(List<Person> persons,  int min , int max) {
        int maxAlive = 0;
        int maxAliveYear = min;

        int [] births = getALlBirthYears(persons , true);
        int [] deaths = getALlBirthYears(persons , false);

        int birthIndex = 0;
        int deathIndex = 0;
        int currentlyAlive = 0;

        while(birthIndex < births.length ){

            if(births[birthIndex] <= deaths[deathIndex]) {
                currentlyAlive++;
                if(currentlyAlive > maxAlive){
                    maxAlive = currentlyAlive;
                    maxAliveYear = births[birthIndex];
                }
                birthIndex++;
            }
            else if (deaths[deathIndex]  < births[birthIndex]){
                currentlyAlive--;
                deathIndex++;
            }
        }

        return maxAliveYear;
    }

    public  int [] getALlBirthYears(List<Person> persons , boolean copyBirth ){

        int [] years = new int [persons.size()];

        int index = 0;
        for(Person p: persons ) {
            years[index++] = copyBirth ? p.birthYear : p.deathYear;
        }
        Arrays.sort(years);

        return years;
    }


    int maxAliveYear(List<Person> personList){
        int maxAlive = 0;
        int maxAliveYear = 1900;

        for(int currentYear = 1900; currentYear <= 2000; currentYear++ ) {

            int alive = 0;

            for(Person p : personList) {

                if( p.birthYear <= currentYear && p.deathYear  >= currentYear) {
                    alive++;
                }

            }
            if(maxAlive < alive) {
                maxAlive = alive;
                maxAliveYear = currentYear;
            }


        }
        return maxAliveYear;

    }
}


class Person{

    int birthYear;
    int deathYear;

    public Person(int birthYear , int deathYear){
        this.birthYear = birthYear;
        this.deathYear = deathYear;
    }
}
