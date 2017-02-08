import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;


public class TrackNode() {
	GNode node;
	ArrayList<GNode> sPath;
    public TrackNode (GNode node, ArrayList<GNode> sPath) {
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
public ArrayList<ArrayList<GNode>> paths(GNode node){
    Deque<TrackNode> temp = new LinkedList<>();
    temp.add(node, new ArrayList<GNode>());
    ArrayList<ArrayList<GNode>> res = new ArrayList<ArrayList<GNode>>();
    while(temp.size()!= 0) {
    	TrackNode next = temp.removeFirst();
    	next.sPath.add(next.node);
    	if((next.node.getChildren().length) != 0) {
    		for (GNode kids : (next.node.getChildren()) {
    			temp.add(kids, new ArrayList<GNode>(next.sPath));
    		}
    	} else {
    		res.add(next.sPath);
    	}
    }
    return res;
}