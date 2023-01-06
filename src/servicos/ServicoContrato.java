package servicos;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

import entidades.Contrato;
import entidades.Parcela;


public class ServicoContrato {

	private ServicoPagamentoOnline servicoPagamentoOnline;
	
	public ServicoContrato(ServicoPagamentoOnline servicoPagamentoOnline) {
		this.servicoPagamentoOnline = servicoPagamentoOnline;
	}
	
	public void ProcessaContrato(Contrato contrato, int mes) {
		double valorParcelado = contrato.getvalorTotal() / mes;
		
        for (int i = 1; i <= mes; i++) {
            LocalDate dataVencimento = contrato.getData().plusMonths(i);
			
            double valorJuros = servicoPagamentoOnline.juros(valorParcelado, i);
			
            double valorTaxa = servicoPagamentoOnline.taxa(valorParcelado + valorJuros);
			
            double quota = valorParcelado + valorJuros + valorTaxa;
			
            contrato.getParcelas().add(new Parcela(dataVencimento, quota));         
        }
	}
}