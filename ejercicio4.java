import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
 
        System.out.print("Ingrese el valor de numA: ");
        double numA = scanner.nextDouble();
       

        System.out.print("Ingrese el valor de numB: ");
        double numB = scanner.nextDouble();

        if (numA > 0 && numB > 0) 
            System.out.println("true"); 
        else 
            System.out.println("false");
        

	}
}
