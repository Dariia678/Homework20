public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();

        // ��������� ������
        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);
        graph.addVertex(4);

        // ��������� �����
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);

        // ��������� �����
        System.out.println("Graph:");
        graph.printGraph();

        // �������� ��������� ������
        System.out.println("\nHas vertex 3: " + graph.hasVertex(3)); // true
        System.out.println("Has vertex 5: " + graph.hasVertex(5)); // false

        // �������� ��������� �����
        System.out.println("\nHas edge between 1 and 3: " + graph.hasEdge(1, 3)); // true
        System.out.println("Has edge between 3 and 4: " + graph.hasEdge(3, 4)); // false

        // ��������� ����� � �������
        graph.removeEdge(1, 3);
        System.out.println("\nGraph after removing edge between 1 and 3:");
        graph.printGraph();

        graph.removeVertex(4);
        System.out.println("\nGraph after removing vertex 4:");
        graph.printGraph();
    }
}
