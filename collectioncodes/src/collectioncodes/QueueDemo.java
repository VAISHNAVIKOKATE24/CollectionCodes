package collectioncodes;
import java.util.PriorityQueue;
public class QueueDemo 
{
public static void main(String[] args)
{
	PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
	pq.add(101);
	pq.add(102);
	pq.add(103);
	pq.add(104);
	System.out.println(pq);
	pq.remove();//0th index will be removed
	System.out.println(pq);
	System.out.println(pq.peek());//it will show 1st index value
}
}
