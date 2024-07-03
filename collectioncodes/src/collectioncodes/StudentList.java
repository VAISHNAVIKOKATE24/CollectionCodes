package collectioncodes;
import java.util.ArrayList;
import java.util.Iterator;

public class StudentList {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
ArrayList<Student> sl = new ArrayList<Student>();
Student s1=new Student(101,"Raj",89.78f);
Student s2=new Student(102,"Rajashree",99.78f);
Student s3=new Student(103,"vishal",95.78f);
Student s4=new Student(104,"shree",9.78f);
sl.add(s1);
sl.add(s2);
sl.add(s3);
sl.add(s4);
System.out.println(s1);
System.out.println(s2);
System.out.println(s3);
System.out.println(s4);
Iterator<Student>it=sl.iterator();
while(it.hasNext())
{
Student s=it.next();	
System.out.println(s.getSid()+" "+s.getName()+" "+s.getMarks());
}

}

}
