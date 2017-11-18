import java.util.Scanner;

public class inches_to_meter {
	public static void main(String[] String) {
	@SuppressWarnings("resource")
	Scanner input = new Scanner(System.in);
	
	System.out.print("Input a value for inch: ");
	
	double inch = input.nextDouble();
	double meters = inch * 0.0254;
	
	System.out.println(inch + "inch is " + meters + "meters");
}
}
