import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Graph {
    private Map<Integer, Set<Integer>> adjacencyList;

    public Graph() {
        this.adjacencyList = new HashMap<>();
    }

    // Метод для додавання вершини до графу
    public void addVertex(int vertex) {
        adjacencyList.putIfAbsent(vertex, new HashSet<>());
    }

    // Метод для додавання ребра між двома вершинами
    public void addEdge(int source, int destination) {
        adjacencyList.putIfAbsent(source, new HashSet<>());
        adjacencyList.putIfAbsent(destination, new HashSet<>());
        adjacencyList.get(source).add(destination);
        adjacencyList.get(destination).add(source); // для неорієнтованого графу
    }

    // Метод для видалення вершини з графу
    public void removeVertex(int vertex) {
        adjacencyList.values().forEach(e -> e.remove(vertex));
        adjacencyList.remove(vertex);
    }

    // Метод для видалення ребра між двома вершинами
    public void removeEdge(int source, int destination) {
        Set<Integer> eV1 = adjacencyList.get(source);
        Set<Integer> eV2 = adjacencyList.get(destination);
        if (eV1 != null) eV1.remove(destination);
        if (eV2 != null) eV2.remove(source);
    }

    // Метод для перевірки чи існує вершина у графі
    public boolean hasVertex(int vertex) {
        return adjacencyList.containsKey(vertex);
    }

    // Метод для перевірки чи існує ребро між двома вершинами
    public boolean hasEdge(int source, int destination) {
        return adjacencyList.containsKey(source) && adjacencyList.get(source).contains(destination);
    }

    // Метод для виведення графу
    public void printGraph() {
        for (Map.Entry<Integer, Set<Integer>> entry : adjacencyList.entrySet()) {
            System.out.print("Vertex " + entry.getKey() + " is connected to: ");
            System.out.println(entry.getValue());
        }
    }
}
