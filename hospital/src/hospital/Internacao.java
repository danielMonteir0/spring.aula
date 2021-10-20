package hospital;

public class Internacao {
	import java.time.LocalDate;
	import java.time.format.DateTimeFormatter;

	public class Internacao {
		private Medico medico;
		private Paciente paciente;
		private String observacoes;
		private LocalDate dataInternacao;
		private LocalDate dataAlta;

		public Internacao(Paciente paciente, Medico medico) {
			this.paciente = paciente;
			this.medico = medico;
			this.dataInternacao = LocalDate.now();
		}

		public Internacao(Paciente paciente, Medico medico, LocalDate dataInternacao) {
			this.paciente = paciente;
			this.medico = medico;
			this.dataInternacao = dataInternacao;
		}


		public String getObservacoes() {
			return this.observacoes;
		}

		public LocalDate getDataInternacao() {
			return this.dataInternacao;
		}

		public LocalDate getDataAlta() {
			return this.dataAlta;
		}

		
		public void setMedico(Medico medico) {
			this.medico = medico;
		}

		public void setObservacoes(String observacoes) {
			this.observacoes = observacoes;
		}

		public void setDataAlta(LocalDate dataAlta) {
			this.dataAlta = dataAlta;
		}
		
		private String formatarData(LocalDate data) {
			if(data != null) {
				var formato = DateTimeFormatter.ofPattern("dd/MM/YYYY");
				return formato.format(data);
			}
			return "Data n�o informada!!!";
		}
		
		@Override
		public String toString() {
			return String.format("Dados do m�dico:\n%s\nDados do paciente:\n%s\nData da interna��o: %s\nData da alta: %s\nObserva��es:\n%s", this.medico.toString(),this.paciente.toString(),this.formatarData(this.dataInternacao),this.formatarData(this.dataAlta),this.observacoes);
		}
}
