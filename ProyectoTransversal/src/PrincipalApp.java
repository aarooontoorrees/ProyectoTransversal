import java.util.*;

public class PrincipalApp {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);

	        System.out.println("=== CALCULADORA BÁSICA ===");

	        System.out.print("Ingrese el primer número: ");
	        double num1 = sc.nextDouble();

	        System.out.print("Ingrese el segundo número: ");
	        double num2 = sc.nextDouble();

	        System.out.println("Seleccione la operación:");
	        System.out.println("1. Sumar");
	        System.out.println("2. Restar");
	        System.out.println("3. Multiplicar");
	        System.out.println("4. Dividir");

	        System.out.print("Opción: ");
	        int opcion = sc.nextInt();

	}
}
