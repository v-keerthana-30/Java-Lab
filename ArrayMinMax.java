import java.util.Scanner;
public class ArrayMinMax
{
	public static void main(String args[]) {
		int size = Integer.parseInt(args[0]);
		System.out.print("\nSize of Array is: " + size);
		int[] arr = new int[size];   
		Scanner reader = new Scanner(System.in);
		System.out.print("\nEnter the elements of the array --------");
		for(int i = 0; i < size; i++  )
		{
			System.out.print("\nEnter the "+ (i+1) + " element = ");
			arr[i] = reader.nextInt();
		}
		System.out.print("\nEntered array is ----------\n");
		for (int i = 0; i < size ;i++)
		{
			System.out.print("\t"+arr[i]);
		}
		int max = arr[0];
		int min = arr[0];
		for(int i = 1; i<size; i++)
		{
			if (max<arr[i])
			{
				max = arr[i];
			}
			if (min>arr[i])
			{
				min = arr[i];
			}
		}
		System.out.print("\nMaximum of the array is: " + max);
		System.out.print("\nMinimum of the array is: " + min);
	}
}
