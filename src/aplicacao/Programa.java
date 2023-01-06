package aplicacao;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entidades.Contrato;
import entidades.Parcela;
import servicos.ServicoContrato;
import servicos.ServicoPaypal;

public class Programa {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter dataFormatada = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Entre os dados do contrato:");
		System.out.print("Numero: ");
		int number = sc.nextInt();
		
		System.out.print("Data (dd/MM/yyyy): ");
		LocalDate date = LocalDate.parse(sc.next(), dataFormatada);
		
		System.out.print("Valor do contrato: ");
		double totalValue = sc.nextDouble();
		
		Contrato obj = new Contrato(number, date, totalValue);
		
		System.out.print("Entre com o numero de parcelas: ");
		int n = sc.nextInt();
		
		ServicoContrato servicoContrato = new ServicoContrato(new ServicoPaypal());
		
		servicoContrato.ProcessaContrato(obj, n);
		
		System.out.println("Parcelas:");
		for (Parcela parcela : obj.getParcelas()) {
			System.out.println(parcela);
		}
		
		sc.close();
	}
}