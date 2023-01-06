package servicos;

public interface ServicoPagamentoOnline {

	double taxa(double montante);
	double juros(double montante, int mes);
}