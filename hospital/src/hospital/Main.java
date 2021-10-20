package hospital;

public class Main {	
	
	public static void main(String[] args) {
		
		Endereco end1 = new Endereco("Rua boa esperança","383","Viamao","BH","RS","00000");
		Paciente pac1 = new Paciente("Daniel","9999","98888",end1);
		Medico med1 = new Medico("000-RS","Maria","0000");
		Medico med2 = new Medico("111-RS","Julia","1111");
		Internacao inter1 = new Internacao(pac1,med1);
		med1.setEndereco(end1);
		
		
		System.out.println(inter1.toString());
	}

}
