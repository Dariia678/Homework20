public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();

        // Додавання вершин
        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);
        graph.addVertex(4);

        // Додавання ребер
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);

        // Виведення графу
        System.out.println("Graph:");
        graph.printGraph();

        // Перевірка існування вершин
        System.out.println("\nHas vertex 3: " + graph.hasVertex(3)); // true
        System.out.println("Has vertex 5: " + graph.hasVertex(5)); // false

        // Перевірка існування ребер
        System.out.println("\nHas edge between 1 and 3: " + graph.hasEdge(1, 3)); // true
        System.out.println("Has edge between 3 and 4: " + graph.hasEdge(3, 4)); // false

        // Видалення ребра і вершини
        graph.removeEdge(1, 3);
        System.out.println("\nGraph after removing edge between 1 and 3:");
        graph.printGraph();

        graph.removeVertex(4);
        System.out.println("\nGraph after removing vertex 4:");
        graph.printGraph();
    }
}
