package heranca;

public class Preguica extends Animal {
	
	private String subirArvore;
	
	public Preguica(String nome, int idade, String som, String subirArvore) {
		super(nome, idade, som);
		this.subirArvore = subirArvore;
	}

	public void exibirPreguica() {
	System.out.println("\nNome: " +getNome()+ "\nIdade: " +getIdade()+ "\nSom: "+getSom()
	+"\nSubir em árvore: " +this.subirArvore);
	}

	public String getSubirArvore() {
		return subirArvore;
	}

	public void setSubirArvore(String subirArvore) {
		this.subirArvore = subirArvore;
	}



}
