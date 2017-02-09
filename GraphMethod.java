import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Set;
import java.util.HashSet;

public class GraphMethod {

    public ArrayList<GNode> walkGraph(GNode root) {
        Deque<GNode> temp = new LinkedList<>();
        Set<GNode> setVer = new HashSet<>();
        temp.add(root);
        while (temp.size() != 0) {
            GNode next = temp.removeFirst();
            setVer.add(next);
            if ((next.getChildren().length) != 0) {
                for (GNode kids : next.getChildren()) {
                    temp.add(kids);
                }
            }
        }
        ArrayList<GNode> path = new ArrayList<>(setVer);
        return path;
    }

    public class TrackNode {
        private GNode node;
        private ArrayList<GNode> sPath;
        public TrackNode(GNode node, ArrayList<GNode> sPath) {
            this.node = node;
            this.sPath = sPath;
        }
        public GNode getNode() {
            return node;
        }
        public ArrayList<GNode> getsPath() {
            return sPath;
        }
    }

    public ArrayList<ArrayList<GNode>> paths(GNode node) {
        Deque<TrackNode> temp = new LinkedList<>();
        temp.add(new TrackNode(node, new ArrayList<GNode>()));
        ArrayList<ArrayList<GNode>> res = new ArrayList<ArrayList<GNode>>();
        while (temp.size() != 0) {
            TrackNode next = temp.removeFirst();
            next.sPath.add(next.node);
            if ((next.node.getChildren().length) != 0) {
                for (GNode kids : (next.node.getChildren())) {
                    temp.add(new TrackNode(kids, new ArrayList<GNode>(next.sPath)));
                }
            } else {
                res.add(next.sPath);
            }
        }
        return res;
    }
}

