import java.util.*;
class Replace
{
public static void main(String[] args)
 {
 Scanner sc= new Scanner(System.in); //System.in is a standard inputstream
 System.out.print("Enter a string: ");
 String str= sc.nextLine(); //reads string
 System.out.print("The string after replacing vowels: ");
 str = str.replaceAll("[aeiou]", "*");
 System.out.println(str);
 }
}