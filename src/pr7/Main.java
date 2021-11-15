package pr7;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph(10);
        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(1,5);
        graph.addEdge(2,3);
        graph.addEdge(5,6);
        graph.addEdge(5,3);
        graph.addEdge(3,4);
        graph.addEdge(3,7);
        graph.addEdge(7,8);
        graph.addEdge(8,9);

        graph.addEdge(4,9);

        int start = 6;
        int end = 9;
        BreadthFirstPaths bfp = new BreadthFirstPaths(graph, start);
        LinkedList<Integer> path = bfp.pathTo(end);
        System.out.println("Путь из " + start + " в " + end + ": " + path + " Длина пути: " + path.size());

    }
}
