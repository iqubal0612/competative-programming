import java.util.LinkedList;
public class LinkedListJCF{
	public static void main(String[] args){
		//create..
		LinkedList<Integer> ll = new LinkedList<>();
		//add elements
		ll.addLast(1);
		ll.addLast(2);
		ll.addFirst(0);
		System.out.println(ll);
		ll.removeLast();
		ll.removeFirst();
		System.out.println(ll);
	}
}
