package exercicio3;
import  java.util.Scanner ;
public class main {

	 public static void Main(String[] args){
	        
	        Scanner s = new Scanner(System.in);
	 
	        
	        String[] perguntas = new String[5];
	            perguntas[0] = "Telefonou para a vítima? sim ou não?";
	            perguntas[1] = "Esteve no local do crime? sim ou não?";
	            perguntas[2] = "Mora perto da vítima? sim ou não?";
	            perguntas[3] = "Devia para a vítima? sim ou não?";
	            perguntas[4] = "Já trabalhou com a vítima? sim ou não?";
	       
	       
	        int respostasPositivas = 0;
	       
	        
	        for(int i = 0; i < perguntas.length; i++){
	            System.out.println(perguntas[i]);//exibe a pergunta
	            String respostas = s.nextLine();//captura a resposta do usuário
	           
	            
	            
	            if(respostas.toLowerCase().equals("sim")){ 
	                respostasPositivas++; 
	        }
	 
	        
	        switch(respostasPositivas){
	            case 2: 
	                System.out.println("Suspeito");
	                break;
	 
	            case 3:
	            case 4:
	                System.out.println("Cúmplice");
	                break;
	 
	            case 5:
	                System.out.println("Assassino");
	                break;
	 
	            default:
	                System.out.println("Inocente");
	                break;
	        }
	    }
}