package chapter10;

import model.Employee;

import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;

public class ComparatorExample {


    Comparator<Integer> intReverseComparator = Comparator.reverseOrder();

    Comparator<Map.Entry<String, Integer>> mapValueComparator = (e1, e2)-> e2.getValue() - e1.getValue();

    Comparator<Employee> employeeSalaryComparator = Comparator.comparing(Employee::getSalary);

    Comparator<Employee> employeeNameComparator = Comparator.comparing(Employee::getName);

    Comparator<Employee>  nameAndSalaryComparator =  Comparator.comparing(Employee::getSalary)
            .thenComparing(Employee::getName);

    Comparator<Map.Entry<String, Integer>> valueAndKeyCom = Comparator.comparing(Map.Entry<String, Integer>::getValue)
            .thenComparing(Map.Entry<String, Integer> ::getKey).reversed();


    public void testMapValueComparator(){
        Map<String, Integer> map = new HashMap<>();
        map.put("A" , 5);
        map.put("B" , 3);
        map.put("C" , 1);
        map.put("D" , 2);

        List<Map.Entry<String, Integer>> toSort = new ArrayList<>();
        for(Map.Entry<String, Integer> e: map.entrySet())
            toSort.add(e);

        toSort.sort(mapValueComparator);

        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();

        for(Map.Entry<String , Integer> entry: toSort)
            linkedHashMap.put(entry.getKey(), entry.getValue());

        for(Map.Entry<String, Integer> entry: linkedHashMap.entrySet())
            System.out.println(entry.getKey() + " - " + entry.getValue());


    }

    public  int stringsComparator(String s1 , String s2){
        return s2.compareTo(s1);
    }

    public String []  lexicolGraphiCalSort(String [] array) {

        Arrays.sort(array);
        PriorityQueue<String> pq = new PriorityQueue<>(Arrays.asList(array));
        String [] result = new String [2];
        for(int i = 0; i < result.length; i++ ){
            result[i] = pq.poll();
        }

        return result;
    }

    public Integer [] intComparator(Integer [] array){
        Arrays.sort(array, intReverseComparator);
        return array;
    }


    public List<Employee> sortBySalary(List<Employee> employees){
        Collections.sort(employees, employeeSalaryComparator);
        return employees;
    }

    public List<Employee> sortByName(List<Employee> employees){
        Collections.sort(employees , employeeNameComparator);
        return  employees;
    }


    public List<Employee> sortBySalaryAndName(List<Employee> employees){
            Collections.sort(employees, nameAndSalaryComparator);
            return employees;
    }


    public List<Employee> priorityQueueCustomComaprator(List<Employee> employees , int k){
        List<Employee> resultList = new ArrayList<>();
        PriorityQueue<Employee> pq = new PriorityQueue<>(nameAndSalaryComparator);
        for(Employee e: employees){
            pq.offer(e);
            if(pq.size() > k){
               pq.poll();
            }
        }

        while (!pq.isEmpty()){
            resultList.add(pq.poll());
        }
      return   resultList;
    }

    public List<Map.Entry<String , Integer>> mapComparator(List<Map.Entry<String, Integer>> entryList) {


        return entryList;
    }

}

