package q3;

public class Main {

	public static void main(String[] args) {
		
		ContaEspecial ce = new ContaEspecial();
		ce.setDiasSemJuros(5);
		ce.setLimite(1000);
		ce.setAgencia(345);
		ce.setNumeroDaConta(987);
		ce.setSaldo(10000);
		ce.cartao.setNumero(555);
		ce.cartao.setOperadora("zzzz");
		ce.cartao.setLimite(800);
		ce.cartao.setTipoDeCartao("B");
		ce.banco.setCodigo(999);
		ce.banco.setNome("Bradesco");
		ce.banco.setNumeroAgencias(543);
		ce.correntista.setNome("Gustavo");
		ce.correntista.setEndereco("Rua aaabc");
		
		System.out.println(ce);
		System.out.println(ce.saque(5000));
		System.out.println(ce.saque(5500));
		System.out.println(ce.saque(500));
		System.out.println(ce);
		
	}

}
