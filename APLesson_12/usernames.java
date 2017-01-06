public class usernames
{
	//instance variables
   String username, firstName, lastName;	
   
   //Default Constructor
   public usernames()
   {
	   username = "";
	   firstName = "";
	   lastName = "";
   }
   public usernames(String uName, String fName, String lName)
   {
	   username = uName;
	   firstName = fName;
	   lastName = lName;
   }
   
   public void setUserName(String uName)
   {
	   username = uName;
   }
   public String getUserName()
   {
	   return username;
   }
    public String getFirstName()
   {
	   return firstName;
   }
    public String getLastName()
   {
	   return lastName;
   }
   public static void main (String[]args)
   {
	   usernames object = new usernames("proHndsm","Professor","Handsome");
       object.setUserName("pHandsome");
	   System.out.println("<<<<<<<<<< USER INFO >>>>>>>>>");
	   System.out.println("Name: " + object.getFirstName()+ "" + object.getLastName());
	   System.out.println("User Name: " + object.getUserName());
   }
}