import java.util.Queue;
import java.util.Deque;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Set;

public ArrayList<GNode> walkGraph(GNode root) {
    Deque<GNode> temp = new LinkedList<>();
    Set<GNode> setVer = new HashSet<>();
    temp.add(root);
    while(temp.size()!= 0) {
    	GNode next = temp.removeFirst();
    	setVer.add(next);
    	if ((next.getChildren().length) != 0) {
            for (GNode kids : next.node.getChildren()) {
    		temp.add(kids);
    	    }
    	} 
    }
    ArrayList<GNode> path = new ArrayList<>(setVer);
    return path;
}