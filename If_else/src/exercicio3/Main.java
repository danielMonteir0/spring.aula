package exercicio3;
import  java.util.Scanner ;
public class main {

	 public static void Main(String[] args){
	        
	        Scanner s = new Scanner(System.in);
	 
	        
	        String[] perguntas = new String[5];
	            perguntas[0] = "Telefonou para a v�tima? sim ou n�o?";
	            perguntas[1] = "Esteve no local do crime? sim ou n�o?";
	            perguntas[2] = "Mora perto da v�tima? sim ou n�o?";
	            perguntas[3] = "Devia para a v�tima? sim ou n�o?";
	            perguntas[4] = "J� trabalhou com a v�tima? sim ou n�o?";
	       
	       
	        int respostasPositivas = 0;
	       
	        
	        for(int i = 0; i < perguntas.length; i++){
	            System.out.println(perguntas[i]);//exibe a pergunta
	            String respostas = s.nextLine();//captura a resposta do usu�rio
	           
	            
	            
	            if(respostas.toLowerCase().equals("sim")){ 
	                respostasPositivas++; 
	        }
	 
	        
	        switch(respostasPositivas){
	            case 2: 
	                System.out.println("Suspeito");
	                break;
	 
	            case 3:
	            case 4:
	                System.out.println("C�mplice");
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