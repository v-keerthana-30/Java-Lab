public class TwoNumber
{
int num1, num2;
void TwoNumber(int x, int y)
{
this.num1 = x;
this.num2 = y;
}
public class Sum2object
{
public static void main()
{
Scanner reader = new Scanner(System.in);
System.out.print("\nenter the first number=");
int n1=reader.nextInt();
System.out.print("\nenter the second number=");
int n2=reader.nextInt();
TwoNumber obj2 = new TwoNumber(n1,n2);
obj2.sum2number();
}
}

