package classeCliente1;

public class TesteHerançaCliente {

	public static void main(String[] args) {
		double CartaoLoja1 = 1200.00 ;
		double CartaoLoja2 = 1300000.00 ;
		double Faturado1 = 12.00;
		double Faturado2 = 10.00;
		int Idade = 0;
		PessoaFisica Pessoa1 = new PessoaFisica("Beatriz", 23,"R. Ekos, nº234", "13 99999-9999", CartaoLoja1, "12345678901" );
        Pessoa1.imprimirInfo();
        PessoaFisica Pessoa2 = new PessoaFisica("Leonardo", 28, "Alameda dos Amigos, nº66", "11 8888-8888", CartaoLoja2, "76890654321");
        Pessoa2.imprimirInfo();
        
        PessoaJuridica Empresa1 = new PessoaJuridica("Editora Makkuro", "Av. dos Viajantes, s/n", "11 44444-4444", Faturado1, "12345678900001");
        Empresa1.imprimirInfo();
        PessoaJuridica Empresa2 = new PessoaJuridica("Sorveteria Delicinha", "Av. Conselheiro Nébias, 675", "13 66666-4444", Faturado2, "87905678900002");
        Empresa2.imprimirInfo();
	}

}
