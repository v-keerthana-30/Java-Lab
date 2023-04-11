class StringEquals
{
 public static void main(String a[])
 {
 String s1=new String("Hello");
 String s2="Hi";
 boolean b=s1.equals(s2);
 System.out.println("Value stored in b"+b);
 if(b)
 System.out.println("Strings are equal");
 else
 System.out.println("Strings are not equal");
 }
}