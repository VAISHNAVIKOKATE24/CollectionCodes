package collectioncodes;
import java.util.*;
import java.util.ArrayDeque;
public class ArrayDequeDemo 
{
	public static void main(String[] args)
	{
		ArrayDeque<Integer> as=new ArrayDeque<Integer>();
		as.push(101);
		as.push(102);
		as.push(103);
		as.push(104);
		as.push(105);
		as.pop();
		System.out.println(as);
		System.out.println(as.peek());
		System.out.println(as.peekFirst());
		System.out.println(as.peekLast());
		System.out.println(as.poll());
		System.out.println(as.pollFirst());
	}
	}


