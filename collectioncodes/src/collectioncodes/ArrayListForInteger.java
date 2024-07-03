package collectioncodes;
import java.util.ArrayList;
public class ArrayListForInteger 
{
public static void main(String[] args)
{
ArrayList<Integer> a1=new ArrayList <Integer>();
a1.add(101);
a1.add(102);
a1.add(103);
a1.add(104);
System.out.println(a1);
a1.add(4,54);//will be at 4th position
a1.remove(4);
System.out.println(a1);
}
}
