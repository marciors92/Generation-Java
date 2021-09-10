package heranca;

public class AnimalMain {
	
	public static void mais(String[] args) {
		
		Cachorro cachorro = new Cachorro ("Biriba", 1, "Latir", "Verdadeiro!");
		Cavalo cavalo = new Cavalo ("Pé de Pano", 7, "Relinchar", "Verdadeiro!");
		Preguica preguica = new Preguica ("Preguiça", 2, "Balir", "Verdadeiro!");
		
		cachorro.emitirSom();
		cavalo.emitirSom();
		preguica.emitirSom();
		
	}

}
