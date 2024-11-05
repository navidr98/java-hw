package hw1;

public class welcome {

	public static void main(String[] args) {
		String name = "mamad";
		  System.out.println(switch (name) {
		   case "mamad" -> "HI" + name;
		   case "ali" -> "HI" + name;
		   case "hasan" -> "HI" + name;
		   default -> throw new IllegalStateException("Unexpected value: " + name);
		  });
	}
		
}
