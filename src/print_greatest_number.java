import java.util.Scanner;

public class print_greatest_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
@SuppressWarnings("unused")
int a,b,c,largest;

@SuppressWarnings("resource")
Scanner s=new Scanner(System.in);
System.out.println("Enter any three numbers: ");
a=s.nextInt();
b=s.nextInt();
c=s.nextInt();

if(a>=b && a>=c)
{
	System.out.println("Largest number: "+a);
}
if(b>=a && b>=c)
{
	System.out.println("Largest number: "+b);
}
if(c>=a && c>=b)
{
	System.out.println("Largest number: "+c);
}
	}

}
