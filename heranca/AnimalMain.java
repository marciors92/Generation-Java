package heranca;

public class AnimalMain {
	
	public static void mais(String[] args) {
		
		Cachorro cachorro = new Cachorro ("Biriba", 1, "Latir", "Verdadeiro!");
		Cavalo cavalo = new Cavalo ("P� de Pano", 7, "Relinchar", "Verdadeiro!");
		Preguica preguica = new Preguica ("Pregui�a", 2, "Balir", "Verdadeiro!");
		
		cachorro.emitirSom();
		cavalo.emitirSom();
		preguica.emitirSom();
		
	}

}
