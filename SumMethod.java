import java.util.Scanner;
public class SumMethod
{
public static void main(String args[])
{
Scanner reader=new Scanner(System.in);
System.out.print("enter the first number=");
int num1=reader.nextInt();
System.out.print("\n enter the second number=");
int num2 = reader.nextInt();
//int sum=num1+num2;
int sum=sum2numbers(num1, num2);
System.out.print("\nSum= "+sum);
}
public static int sum2numbers(int n1,int n2)
{
return n1+n2;
}
}