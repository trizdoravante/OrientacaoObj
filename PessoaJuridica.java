package classeCliente1;

public class PessoaJuridica extends classeCliente{
	public double Faturado;
	public String CNPJ;

	public PessoaJuridica(String Nome, String Endereco, String Tel, double Faturado,String CNPJ) {
		super(Nome,0, Endereco, Tel, Faturado, 0, 0, 0);
		this.Faturado = Faturado;
		this.CNPJ = CNPJ;
		
	}



	public double getFaturado() {
		return Faturado;
	}

	public void setFaturado(double faturado) {
		Faturado = faturado;
	}

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}
	public void validarCNPJ() {
		if(getCNPJ().length() !=14) {
			System.out.println("\nO número de CNPJ apresentado é válido.");
		}else {
			System.out.println("\nO número fornecido não corresponde a um CNPJ válido");
		}
		
	}
	public boolean confValor() {
		if(getFaturado()>0) {
			return true;
		}else {
			System.out.println("\nEste usuário ainda não possuí a permissão de realizar pagamento por boletos.");
		}
		return false;
	}
	public void imprimirInfo() {
		System.out.println("Nome: "+getNome());
		System.out.println("Endereço: "+getEndereco());
		System.out.println("Telefone: "+getTel());
		System.out.println("CNPJ: "+getCNPJ());
		System.out.println("Poussuí faturado? "+getFaturado());
}
}