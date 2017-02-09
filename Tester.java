import java.util.ArrayList;

public class Tester {
    public static void main(String[] args) {
        GNode I  = new GNodeObject("I");
        GNode G  = new GNodeObject("G");
        GNode H  = new GNodeObject("H");
        GNode E  = new GNodeObject("E");
        GNode F  = new GNodeObject("F");
        GNode J  = new GNodeObject("J");
        GNode D  = new GNodeObject("D", J);
        GNode B  = new GNodeObject("B", E, F);
        GNode C  = new GNodeObject("C", H, I, G);
        GNode A  = new GNodeObject("A", B, C, D);
        GNode root = A;
        GraphMethod test = new GraphMethod();
        ArrayList<GNode> path = new ArrayList<>();
        path = test.walkGraph(root);
        System.out.print("Return all nodes in the graph : ");
        System.out.println(path);
        System.out.println("---------------------------------------------------------------");
        ArrayList<ArrayList<GNode>> sPath = new ArrayList<>();
        System.out.print("Return all paths starting at node A : ");
        sPath = test.paths(root);
        System.out.println(sPath);
    }
}