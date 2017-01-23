import java.util.Scanner;
public class userdriver
{
	public static void main(String[]args)
   {
   Scanner kb = new Scanner(System.in);
   user pH;
   System.out.println("first name");
   String first = kb.next();
   System.out.println("last name");
   String last = kb.next();
   System.out.println("Would you like to use a public avatar (y or n)");
   String avatar = kb.next();
   if(avatar.equals("n"))
      {
	   pH = new user(first, last);
      }
   else
     {
     System.out.println("please enter your avatar ");
     avatar = kb.next();
     pH	= new user(first, last, avatar); 
     }
     System.out.println(pH);
   }
 
}