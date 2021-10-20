package hospital;

public class Internacao_lista {
	private ArrayList<Internacao> internacao = new ArrayList<Internacao>();

	public void cadastrar(Internacao internacao){
		if (internacao != null) {
			internacao.add(internacao);
		}
	}

	public void remover(Internacao internacao) {
		Internacao.removeIf((elemento) -> elemento.getCpf().equals(internacao.getCpf()));
	}

	public Paciente buscar(Internacao internacao) {
		for (Paciente elemento : this.paciente) {
			if (elemento.getCpf().equals(cliente.getCpf())) {
				return elemento;
			}
		}
		return null;
	}

	public void editar(Internacao internacao) {
		int indice = internacao.indexOf(this.buscar(internacao));
		if (indice != -1) {
			internacao.set(indice, internacao);
		}
	}

	public String listar() {
		StringBuilder builder = new StringBuilder();
		for (Internacao cliente : this.internacao) {
			builder.append(cliente.toString());
		}
		return builder.toString();
	}

}
