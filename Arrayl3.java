import java.util.*;
class Arrayl3
{
public static void main(String args[])
{
	ArrayList<String>animals= new ArrayList<>();
	animals.add("cat");
	animals.add("dog");
	animals.add("hourse");
	System.out.println("ArrayList:"+animals);
	String str=animals.remove(2);
	System.out.println("updated ArrayList:"+animals);
	System.out.println("removed elements:"+str);
}
}
	