package projeto_n1;

import java.util.Random;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		
		Random gerador = new Random();
		Scanner teclado = new Scanner(System.in);
		
		int usuarioNumero;
		int escolhaCpu;
		
		usuarioNumero = teclado.nextInt();
		escolhaCpu = gerador.nextInt(3)+1;
		
		System.out.println("Escolha um número");
		System.out.println("1= Pedra");
		System.out.println("2= Papel");
		System.out.println("3= Tesoura");
		
		
	
		
		
		switch(escolhaCpu) {
		case 1: 
			System.out.printf("CPU escolheu pedra");
			break;
			
		case 2:
			System.out.printf("CPU escolheu papel");
			break;
			
		case 3:
			System.out.printf("CPU escolheu tesoura");
			break;
			
		}	
		
			if(usuarioNumero == escolhaCpu){
				System.out.printf("Empate.");
			}else if((usuarioNumero - escolhaCpu)== -1 ||
			(usuarioNumero - escolhaCpu) == 2){
				System.out.printf("Usuario vencedor.");
			}else {
				System.out.printf("computador vencedor.");
		
		
			}
			
		}
		
	}
		
