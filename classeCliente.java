package classeCliente1;

import java.text.NumberFormat;

public class classeCliente {
private String Nome;
private int Idade;
private String Endereco;
private String Tel;
private double saldoCompra;
private int pontinhos;

public classeCliente (String Nome, int Idade, String Endereco, String Tel, double saldoCompra, int pontinhos, int i, int j) {
	this.Nome = Nome;
	this.Idade = Idade;
	this.Endereco = Endereco;
	this.Tel = Tel;
	this.saldoCompra = saldoCompra;
	this.pontinhos = pontinhos;
	
}



public String getNome() {
	return Nome;
}

public void setNome(String nome) {
	Nome = nome;
}

public int getIdade() {
	return Idade;
}

public void setIdade(int idade) {
	Idade = idade;
}

public String getEndereco() {
	return Endereco;
}

public void setEndereco(String endereco) {
	Endereco = endereco;
}

public String getTel() {
	return Tel;
}

public void setTel(String tel) {
	Tel = tel;
}

public double getSaldoCompra() {
	return saldoCompra;
}

public void setSaldoCompra(double saldoCompra) {
	this.saldoCompra = saldoCompra;
}

public int getPontinhos() {
	return pontinhos;
}

public void setPontinhos(int pontinhos) {
	this.pontinhos = pontinhos;
}
public String formatarMoeda () {
	NumberFormat nf = NumberFormat.getCurrencyInstance();
	nf.setMinimumFractionDigits(2);
	String totalSaldo = nf.format(saldoCompra);
	return totalSaldo;
}
	
public int convertPontinhos () {
	int valorCompra = (int) saldoCompra;
	int pontinhosConvertidos = valorCompra/100*10;
	return pontinhosConvertidos;
	
	
	
}
public void imprimir() {
	System.out.println(Nome+" ,"+Idade+"  anos, que reside na região: "+Endereco+" , telefone para contato: "+Tel);
	System.out.println("Seu saldo de compras é de: "+formatarMoeda());
	System.out.println(" portanto, juntou os seguintes pontinhos: "+convertPontinhos());		
			}
	
	
}



