import java.io.*;
import java.util.*;
class inttostring
{
public static void main(String[] args)
 {
 int n, temp,res,i,j=0;
 Scanner s = new Scanner(System.in);
 System.out.println("Enter number of elements in the array:");
 n = s.nextInt();
 int array[] = new int[n];
 System.out.println("Enter "+n+" elements ");
 for( i=0; i < n; i++)
 {
 array[i] = s.nextInt();
 }
 System.out.println("Integer Array to String representation is:"+Arrays.toString(array));
 }
}