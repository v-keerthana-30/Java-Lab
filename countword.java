import java.io.*;
import java.util.*;
class countword {
static int countOccurrences(String str, String word)
{
String a[] = str.split(" ");
 int count = 0;
 for (int i = 0; i < a.length; i++)
 {
 if (word.equals(a[i]))
 count++;
 }
 return count;
}
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
 System.out.println("Enter a string:");
 String str = sc.nextLine();
 System.out.println("Enter a word to check for occurences:");
 String word = sc.nextLine();
 System.out.println(countOccurrences(str, word));
}
} 
