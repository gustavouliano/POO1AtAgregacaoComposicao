package q2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Carro c = new Carro();
		
		c.setAno(2020);
		c.setCor("Azul");
		c.setModelo("gol");
		c.setFabricante("sla");
		c.dono.setNome("Gustavo");
		c.dono.setEndereco("Rua adssad");
		c.motor.setCilindros(50);
		c.motor.setCombustivel("Diesel");
		c.motor.setMarca("asdasz");
		c.motor.setPotencia(500);
		
		System.out.println(c);

	}

}
