package entidades;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Parcela {

	private static DateTimeFormatter dataFormatada = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	private LocalDate dataVencimento;
	private Double montante;
	
	public Parcela(LocalDate dataVencimento, Double montante) {
		this.dataVencimento = dataVencimento;
		this.montante = montante;
	}

	public LocalDate getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(LocalDate dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public Double getMontante() {
		return montante;
	}

	public void setMontante(Double montante) {
		this.montante = montante;
	}

	@Override
	public String toString() {
		return dataVencimento.format(dataFormatada) + " - " + String.format("%.2f", montante);
 	}
}