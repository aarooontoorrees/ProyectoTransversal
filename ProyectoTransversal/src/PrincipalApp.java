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
	        
	        double resultado = 0;

	        switch (opcion) {
	            case 1:
	                resultado = sumar(num1, num2);
	                break;
	            case 2:
	            	resultado = restar(num1, num2);
	                break;
	            case 3:
	            	resultado = multiplicar(num1, num2);
	                break;
	            case 4:
	            	resultado = dividir(num1, num2);
	                break;
	            default:
	                System.out.println("Opción no válida.");
	                return;
	        }

	        System.out.println("Resultado: " + resultado);

	}
	
	public static double sumar(double a, double b) {
        return a + b;
	}
    public static double restar(double a, double b) {
        return a - b;
    }
    public static double multiplicar(double a, double b) {
        return a * b;
    }
    public static double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Error: No se puede dividir entre cero.");
            return 0;
        }
        return a / b;
    }
}
