package chapter4;

import java.util.*;

public class GrapghWithAdjacencyListExample {

    public static void main(String[] args) {

        Graph graph = new Graph(new HashMap<>());

       Vertex A =  graph.addVertex("A");
       Vertex B = graph.addVertex("B");
       Vertex C = graph.addVertex("C");
       Vertex D =  graph.addVertex("D");
       Vertex E = graph.addVertex("E");

       graph.addEdge(A, B);
       graph.addEdge(A, C);
       graph.addEdge(A, D);
       graph.addEdge(D, E);


        System.out.println("Result of breadth first search");
        graph.breadFirstSearch(A);

        System.out.println("Result of  depth first search");
        graph.depthFirstSearch(A);

    }
}

class Graph {

    private Map<Vertex, List<Vertex>> map;

    public Graph(Map<Vertex, List<Vertex>> map) {
        this.map = new HashMap<>();
    }

    Vertex addVertex(String label) {

        Vertex v = new Vertex(label);
        this.map.putIfAbsent(v, new ArrayList<>());
        return v;
    }

    void addEdge(Vertex source, Vertex destination) {
        List<Vertex> edges = this.map.get(source);
        edges.add(destination);
        //System.out.println(this.map.containsKey(source));

    }

    public List<Vertex> getAllConnections(Vertex source) {
        return this.map.get(source);
    }

    Set<Vertex> breadFirstSearch(Vertex start) {

        Queue<Vertex> queue = new LinkedList<>();
        LinkedHashSet<Vertex> visited = new LinkedHashSet<>();

        queue.offer(start);
        visited.add(start);

        while (!queue.isEmpty()) {
            Vertex temp = queue.poll();
            System.out.println("Visiting neighbors of " + temp.label);
                for (Vertex v : this.map.get(temp)) {
                    if(!visited.contains(v)){
                        queue.add(v);
                        visited.add(v);
                    }
                }
            }
        visited.removeIf(e-> e.label.equals(start.label));
        System.out.println(visited);
        return visited;
    }

    Set<Vertex> depthFirstSearch(Vertex start){

        Stack <Vertex> stack = new Stack<>();
        LinkedHashSet<Vertex> visited = new LinkedHashSet<>();

        stack.push(start);
        visited.add(start);

        while (!stack.isEmpty()){

            Vertex temp = stack.pop();
            System.out.println("Visiting neighbors of " + temp.label);
            for (Vertex v : this.map.get(temp)){
                if(!visited.contains(v)){

                    stack.push(v);
                    visited.add(v);
                }
            }
        }
        visited.removeIf(e-> e.label.equals(start.label));
        System.out.println(visited);
    return  visited;
    }

}


class Vertex{
    String label;
    public Vertex(String label){
        this.label = label;
    }

    @Override
    public String toString(){
        return "( "+this.label+" )";
    }
}

