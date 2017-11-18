import java.util.Scanner;

public class Farenheit_to_celsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
float temperature;
@SuppressWarnings("resource")
Scanner in = new Scanner(System.in);

System.out.println("Enter temperature in Farenheit");
temperature = in.nextInt();

temperature = ((temperature - 32)*5)/9;

System.out.println("Temperature in celsius = " + temperature);



	}

}
