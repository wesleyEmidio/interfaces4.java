package entidades;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contrato {

	private Integer numero;
	private LocalDate data;
	private Double valorTotal;
	
	private List<Parcela> parcelas = new ArrayList<>();
	
	public Contrato(Integer numero, LocalDate data, Double valorTotal) {
		this.numero = numero;
		this.data = data;
		this.valorTotal = valorTotal;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Double getvalorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public List<Parcela> getParcelas() {
		return parcelas;
	}
}