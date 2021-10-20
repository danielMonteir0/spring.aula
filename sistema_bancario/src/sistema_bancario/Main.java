package sistema_bancario;

public class Main {
	public static void main(String[] args) {
		Contas banco = new Contas();

		Conta conta1 = new Conta(1, 200);
		Conta conta2 = new Conta(2, 1000);

		Conta contaEditada = new Conta(1, 500);

		
		banco.cadastrar(conta1);
		banco.cadastrar(conta2);

	
		System.out.println(banco.listar());

		banco.editar(contaEditada);

		
		System.out.println(banco.listar());
	}

}
