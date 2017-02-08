import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;


public class Tester{
	public static void main(String[] args) {
	   ArrayList list = new ArrayList();
       list.add(2);
       list.add(2); 
       list.add(2); 
       ArrayList list2 = new ArrayList(list);
       list2.add(3);
       System.out.println(list2);
	}
}