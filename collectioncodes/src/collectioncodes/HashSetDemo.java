package collectioncodes;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class HashSetDemo
{
public static void main(String[] args)
{
	HashSet<String> hs=new HashSet<String>();
	hs.add("MUMBAI");
	hs.add("PUNE");
	hs.add("PUNE");
	hs.add("go");
	System.out.println(hs);
	System.out.println(hs.contains("PUNE"));
	Set s =Collections.singleton(hs);
	System.out.println(s);
}
}
