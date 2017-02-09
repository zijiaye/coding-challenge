
public class GNodeObject implements GNode {
	String name;
	GNode[] children;
	
	public GNodeObject (String name, GNode ...children) {
		this.name = name;
		this.children = children;
	}
	
	public String getName() {
		return name;
	}
	
	public GNode[] getChildren() {
		return children;
	}
}
