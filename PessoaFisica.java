package classeCliente1;

public class PessoaFisica extends classeCliente {
	
	private double cartaoLoja;
	private String CPF;

	public PessoaFisica(String Nome, int Idade, String Endereco, String Tel, double cartaoLoja, String CPF) {
		super (Nome, Idade, Endereco, Tel, cartaoLoja, 0, Idade, Idade);
		this.cartaoLoja = cartaoLoja;
		this.CPF = CPF;
		
		
	
	}

	public double getCartaoLoja() {
		return cartaoLoja;
	}

	public void setCartaoLoja(double cartaoLoja) {
		this.cartaoLoja = cartaoLoja;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public void validarCPF() {
		if(getCPF().length() !=11) {
			System.out.println("\nO número de CPF apresentado é válido.");
		}else {
			System.out.println("\nO número fornecido não corresponde a um CPF válido");
		}
		
	}
	public boolean confSaldo() {
		if(getCPF().length()!=14) {
			return true;
			
		}else {
		return false;
		}
	
		
	}
		

public void imprimirInfo() {
	System.out.println("Nome: "+getNome());
	System.out.println("Idade: "+getIdade());
	System.out.println("Endereço: "+getEndereco());
	System.out.println("Telefone: "+getTel());
	System.out.println("CPF: "+getCPF());
	System.out.println("Possuí cartão da loja?  "+getCartaoLoja());
	
}
}


