package classeCliente1;

public class TesteCliente {

	public static void main(String[] args) {
		int pontinhos = 0;
		double saldoCompra=0;
		classeCliente cliente1 = new classeCliente ("Amélia", 19, "R.Cornélia, 23 apto.1989", "13 99999-9999", saldoCompra=12000.00, pontinhos );
		cliente1.imprimir();
		classeCliente cliente2 = new classeCliente ("José", 27, "R.Alves Cunha, 45, Casa", "13 88888-8888", saldoCompra= 850.50, pontinhos );
		cliente2.imprimir();
		classeCliente cliente3 = new classeCliente ("Anna", 22, "R. Zacarias Justo, 18 apto.89", "13 77777-7777", saldoCompra=12.00, pontinhos );
		cliente3.imprimir();
		classeCliente cliente4 = new classeCliente ("Roberta", 67, "Av Penha, 24, casa ", "13 66666-6666", saldoCompra=3000.00, pontinhos );
		cliente4.imprimir();
		classeCliente cliente5 = new classeCliente ("Nicholas", 18, "Av. Ana Costa, 497, casa", "13 55555-5555", saldoCompra=100.00, pontinhos );
		cliente5.imprimir();
		classeCliente cliente6 = new classeCliente ("Carlos", 21, "R.Carlos Grande, 312, casa", "13 44444-4444", saldoCompra=2000.00, pontinhos );
		cliente6.imprimir();
	}

}
