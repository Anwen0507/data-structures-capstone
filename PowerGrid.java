import java.util.Comparator;
import java.util.List;

public class PowerGrid {
    private class Edge {
        private int start, end, weight;
        private String name;

        private Edge(int start, int end, int weight, String name) {
            this.start = start;
            this.end = end;
            this.weight = weight;
            this.name = name;
        }
    }

    public List<Edge> mst(List<List<Edge>> graph) {
        Comparator<Edge> comparator = (x, y) -> {
            return x.weight != y.weight
                ? x.weight - y.weight
                : x.start - y.start;
        };
    }
}
