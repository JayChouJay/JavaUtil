package algorithm.a6tree.plus;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FHuffmanTreeTest {
    @Test
    public void huffmanTree() {
        List<FHuffmanTree.Node> nodes = new LinkedList<>();
        nodes.add(new FHuffmanTree.Node('A', 2));
        nodes.add(new FHuffmanTree.Node('B', 3));
        nodes.add(new FHuffmanTree.Node('C', 7));
        nodes.add(new FHuffmanTree.Node('D', 9));
        nodes.add(new FHuffmanTree.Node('E', 18));
        nodes.add(new FHuffmanTree.Node('F', 25));

        FHuffmanTree.createTree(nodes);
        System.out.println(nodes);
    }
}
