import java.util.ArrayList;
import java.util.Arrays;
public class toystore
{
   private ArrayList<toy> ToyList;
   public toystore()
   {
	   ToyList = new ArrayList<toy>();
   }
   public toystore(String t)
   {
	   ToyList = new ArrayList<toy>();
	   loadToys(t);
   }
   public void loadToys(String t)
   {
	   ArrayList<String>toys = new ArrayList<> (Arrays.asList(t.split(", ")));
	   for(int i = 0; i < toys.size(); i+=2)
	   {
		   String name = toys.get(i);
		   String type = toys.get(i+1);
		   toy object = getThatToy(name);
		   if(object == null)
		   {
			   if(type.equals("Car"))
			   {
			      ToyList.add(new car(name));
			   }
			   else
			   {
				   ToyList.add(new afigure(name));
			   }
		   }
		   else
			   object.setCount(1);
	   }
   }
   public toy getThatToy(String nm)
   {
	   for(toy ty : ToyList)
	   {
		   if(ty.getName().equals(nm))
		   {
			   return ty;
		   }
	   }
	   return null;
   }
   public String getMostFrequentToy()
   {
	   String name = "";
	   int max = Integer.MIN_VALUE;
	   for(toy ty : ToyList)
	   {
		   if(max < ty.getCount())
		   {
			   max = ty.getCount();
			   name = ty.getName();
		   }
	   }
	   return name;
   }
   public String getMostFrequentType()
   {
	   int cars = 0;
	   int figures = 0;
	   for(toy ty : ToyList)
	   {
		   if(ty.getType().equals("car"))
		   {
			   cars += 1;
		   }
		   else
			   figures += 1;
	   }
	   if(cars > figures)
	   {
		   return "cars";
	   }
	   if(figures > cars)
	   {
		   return "action figures";
	   }
	   else
		   return "equal amounts of action figures and cars!";
   }
   public String toString()
   {
	   return " " + ToyList;
   }
}