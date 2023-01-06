package servicos;

public class ServicoPaypal implements ServicoPagamentoOnline {

	private static final double TAXA_PERCENTUAL = 0.02;
	private static final double JUROS_MENSAIS = 0.01;

	@Override
	public double taxa(double montante) {
		return montante * TAXA_PERCENTUAL;
	}

	@Override
	public double juros(double montante, int months) {
		return montante * JUROS_MENSAIS * months;
	}
}