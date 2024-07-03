package collectioncodes;
import java.util.*;
public class TwoDArrayDemo 
{
public static void main(String[] args)
{
	int arr[]=new int[5];
	Scanner sn=new Scanner(System.in);
	for(int i=0;i<arr.length;i++)
	{
		System.out.println("Enter"+(i+1)+"number:");
				arr[i]=sn.nextInt();
	}
	for(int i=0;i<arr.length;i++)
	{
		for(int j=i+1;j<arr.length;j++)
		{
	    if(arr[i]>arr[j])
	     {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	}
	}

	for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]);
	}
}
}
