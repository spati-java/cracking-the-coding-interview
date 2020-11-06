package chapter10;

import model.Employee;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ComparatorExampleTest {

    ComparatorExample ce;

    @BeforeEach
    public void init(){
        ce = new ComparatorExample();
    }

    @Test
    void stringsComparator() {
        String s1 = "zingo";
        String s2 = "i";
        assertEquals(1, ce.stringsComparator(s1,s2));
    }


    @Test
    void lexicolGraphiCalSort() {

        String [] array = {"Stephan" , "Zong" , "Ajay"};
        String [] sortedArray = ce.lexicolGraphiCalSort(array);
        System.out.println(Arrays.toString(sortedArray));
    }

    @Test
    void intComparator() {

        Integer [] array = {1,5,6,3};
        Integer [] sortedArray = ce.intComparator(array);
        System.out.println(Arrays.toString(sortedArray));
    }

    @Test
    void salaryComparator() {

        List<Employee> employeeList = Arrays.asList(
                new Employee("Ajay" , 4.00),
                new Employee("Zong" ,3.00),
                new Employee("Stephan" ,3.00));;

        List<Employee> sortedEmployees = ce.sortBySalary(employeeList);
        System.out.println(sortedEmployees);
    }

    @Test
    void sortByName() {
        List<Employee> employeeList = Arrays.asList(
                new Employee("A" , 100.00) ,
                new Employee("love" , 100.00 ),
                new Employee("zingo" , 200.0)
        );

        List<Employee> sortedEmployees = ce.sortByName(employeeList);
        System.out.println(sortedEmployees);
    }

    @Test
    void sortBySalaryAndName() {
        List<Employee> employeeList = Arrays.asList(
                new Employee("Ajay" , 4.00),
                new Employee("Bomain" , 5.00),
                new Employee("Zong" ,3.00),
                new Employee("Stephan" ,3.00),
                new Employee("a" ,1.00)
        );
        List<Employee> sortedEmployees = ce.sortBySalaryAndName(employeeList);
        System.out.println(sortedEmployees);
    }

    @Test
    void priorityQueueCustomComaprator() {
        List<Employee> employeeList = Arrays.asList(
                new Employee("Ajay" , 4.00),
                new Employee("Bomain" , 5.00),
                new Employee("Zong" ,3.00),
                new Employee("Stephan" ,3.00),
                new Employee("a" ,1.00));
        List<Employee> sortedEmployees  = ce.priorityQueueCustomComaprator(employeeList, 4);
        System.out.println(sortedEmployees);
    }

    @Test
    void mapComparator() {

        Map<String , Integer> map = new HashMap<>();
        map.put("a" , 4);
        map.put("b" , 2);
        map.put("c" , 3);
        map.put("d" , 3);

    }

    @Test
    void testMapValueComparator() {
        ce.testMapValueComparator();
    }

    
}