import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Graph {
    private Map<Integer, Set<Integer>> adjacencyList;

    public Graph() {
        this.adjacencyList = new HashMap<>();
    }

    // ����� ��� ��������� ������� �� �����
    public void addVertex(int vertex) {
        adjacencyList.putIfAbsent(vertex, new HashSet<>());
    }

    // ����� ��� ��������� ����� �� ����� ���������
    public void addEdge(int source, int destination) {
        adjacencyList.putIfAbsent(source, new HashSet<>());
        adjacencyList.putIfAbsent(destination, new HashSet<>());
        adjacencyList.get(source).add(destination);
        adjacencyList.get(destination).add(source); // ��� ������������� �����
    }

    // ����� ��� ��������� ������� � �����
    public void removeVertex(int vertex) {
        adjacencyList.values().forEach(e -> e.remove(vertex));
        adjacencyList.remove(vertex);
    }

    // ����� ��� ��������� ����� �� ����� ���������
    public void removeEdge(int source, int destination) {
        Set<Integer> eV1 = adjacencyList.get(source);
        Set<Integer> eV2 = adjacencyList.get(destination);
        if (eV1 != null) eV1.remove(destination);
        if (eV2 != null) eV2.remove(source);
    }

    // ����� ��� �������� �� ���� ������� � �����
    public boolean hasVertex(int vertex) {
        return adjacencyList.containsKey(vertex);
    }

    // ����� ��� �������� �� ���� ����� �� ����� ���������
    public boolean hasEdge(int source, int destination) {
        return adjacencyList.containsKey(source) && adjacencyList.get(source).contains(destination);
    }

    // ����� ��� ��������� �����
    public void printGraph() {
        for (Map.Entry<Integer, Set<Integer>> entry : adjacencyList.entrySet()) {
            System.out.print("Vertex " + entry.getKey() + " is connected to: ");
            System.out.println(entry.getValue());
        }
    }
}
