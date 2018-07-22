package graph;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Graph Tests")
public class GraphTest {
    @Test
    @DisplayName("Test Single Edge")
    public void testSingleEgde() {
        Graph g = new Graph(3);
        g.addEdge(0, 1);
        List<String> r = g.getRepr();
        assertEquals(1, r.size());
        assertEquals("0 -> 1", r.get(0));
    }
}

