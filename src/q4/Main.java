package q4;

public class Main {

	public static void main(String[] args) {
		
		Computador c = new Computador();
		
		c.setMarca("zz");
		c.setModelo("zz1x");
		c.setTensao(110);
		c.setConsumo(1);
		c.mouse.setMarca("razer");
		c.mouse.setTipo("rznx21");
		c.teclado.setMarca("razer");
		c.teclado.setTipo("rznnn1");
		c.monitor.setMarca("LG");
		c.monitor.setTipo("LGn1");
		c.monitor.setResolucao("1920x1200");
		c.gabinete.setModelo("a12");
		c.gabinete.setTipo("a12bb");
		c.gabinete.setBaias(4);
		c.gabinete.placamae.setMarca("AM4");
		c.gabinete.placamae.setModelo("AM4a1");
		c.gabinete.placamae.hd.setMarca("ttttt");
		c.gabinete.placamae.hd.setModelo("ttttt3z");
		c.gabinete.placamae.hd.setCapacidade(8);
		c.gabinete.placamae.hd.setRpm(10000);
		c.gabinete.placamae.memoria.setMarca("ddrs4");
		c.gabinete.placamae.memoria.setModelo("ddrs4i1");
		c.gabinete.placamae.memoria.setCapacidade(32);
		c.gabinete.placamae.memoria.setVelocidade(5000);
		c.gabinete.placamae.processador.setMarca("Intel");
		c.gabinete.placamae.processador.setModelo("i15");
		c.gabinete.placamae.processador.setClock(12);
		c.gabinete.placamae.processador.setCache(24);
		
		System.out.println(c);
		
		

	}

}
