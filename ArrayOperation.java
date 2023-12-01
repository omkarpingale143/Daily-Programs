import java.util.*;
public class ArrayOperation
{
	public static void accept() 
	{
		int size,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of Array : ");
		size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter Array Element : ");
		for(i=0;i<size;i++) 
		{
			arr[i]=sc.nextInt();
		}
		display(arr);
		greatest(arr);
		smallest(arr);
		ascending(arr);
		descending(arr);
		sc.close();
	}
	public static void display(int arr[]) 
	{
		int i;
		for(i=0;i<arr.length;i++) 
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void greatest(int arr[]) 
	{
		int i,max=arr[0];
		for(i=0;i<arr.length;i++)
		{
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		System.out.println("The Gretest Number Is : "+max);
	}
	public static void smallest(int arr[]) 
	{
		int i,min=arr[0];
		for(i=0;i<arr.length;i++)
		{
			if(min>arr[i])
			{
				min=arr[i];
			}
		}
		System.out.println("The Smallest Number Is : "+min);
	}
	public static void ascending(int arr[]) 
	{
		int i,temp;
		for(i=0;i<arr.length-1;i++)
		{
		 if(arr[i]>arr[i+1])
		 {
			 temp=arr[i];
			 arr[i]=arr[i+1];
			 arr[i+1]=temp;
		 }
		}
		System.out.println(" The Numbers In Ascending order");
		display(arr);
	}
	public static void descending(int arr[])
	{
		int i,temp;
		for(i=0;i<arr.length-1;i++) 
		{
		 if(arr[i]<arr[i+1])
		 {
			 temp=arr[i];
			 arr[i]=arr[i+1];
			 arr[i+1]=temp;
		 }
		}
		System.out.println("The Numbers IN Descending order");
		display(arr);
	}
}
