package exercicio1;
import java.util.Scanner;
public class Main {
	public static void Main(String[] args) {

	    int lado1, lado2, lado3;
	    int opcao = 1;

	    while (opcao == 1) {
	        Scanner teclado = new Scanner(System.in);

	        System.out.println("Entre com o lado 1:");
	        lado1 = teclado.nextInt();
	        System.out.println("------------------------------------------------");
	        System.out.println("Entre com lado 2:");
	        lado2 = teclado.nextInt();
	        System.out.println("------------------------------------------------");
	        System.out.println("Entre com lado 3:");
	        lado3 = teclado.nextInt();
	        System.out.println("------------------------------------------------");

	        if ((lado1 < lado2 + lado3) && (lado2 < lado1 + lado3) && (lado3 < lado1 + lado2)) {
	            if (lado1 == lado2 && lado1 == lado3) {
	                System.out.println("Triangulo Equilatero");
	            } else if ((lado1 == lado2) || (lado1 == lado3)) {
	                System.out.println("Triangulo Isosceles");
	            } else
	                System.out.println("Tri�ngulo Escaleno");
	        } else {
	            System.out.println("N�o � um triangulo!");
	        }
	        System.out.println("------------------------------------------------");
	        System.out.println("Deseja continuar? 1 = sim, 2 = n�o");
	        opcao = teclado.nextInt();
	        System.out.println("------------------------------------------------");
	    }
	    	System.out.printf("Tchau!");
		}

}
