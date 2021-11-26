package q1;

public class Main {

	public static void main(String[] args) {

//		SistemaDeSom ss =  new SistemaDeSom();
//		ss.setTensao(220);
//		ss.setPotencia(1500);
//		ss.setModelo("J-45");
//		ss.setMarca("JBL");
//		ss.setConsumo(550);
//		
//		SistemaDeVideo sv = new SistemaDeVideo();
//		sv.setTipo("LED");
//		sv.setTensao(110);
//		sv.setResolucao("4K");
//		sv.setModelo("L500");
//		sv.setMarca("LG");
//		sv.setConsumo(500);
//
//		HomeTheater ht = new HomeTheater();
//		ht.som = ss;
//		ht.video = sv;
//		System.out.println(ht);
		
		
		HomeTheater ht = new HomeTheater();
		
		ht.som.setTensao(110);
		ht.som.setPotencia(1200);
		ht.som.setModelo("J-50");
		ht.som.setMarca("JBLi");
		ht.som.setConsumo(570);
		
		ht.video.setTipo("LEDi");
		ht.video.setTensao(220);
		ht.video.setResolucao("8K");
		ht.video.setModelo("L600");
		ht.video.setMarca("LGi");
		ht.video.setConsumo(600);
		
		System.out.println(ht);
		
		
	}
}