package POO;

public class Eletronico {
	
	private String nome, modelo, cor, anoFab;
	private int tensao;
	public Eletronico(String nome, String modelo, String cor, String anoFab, int tensao) {
		super();
		this.nome = nome;
		this.modelo = modelo;
		this.cor = cor;
		this.anoFab = anoFab;
		this.tensao = tensao;
	}
	
	public void exibirEletronico() {
		System.out.println("\nNome: " +this.nome+ "\nModelo: " +this.modelo+ "\nCor: " +this.cor+ 
				"\nAno de Fabricação: " +this.anoFab+ "\nTensão: " +this.tensao);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getAnoFab() {
		return anoFab;
	}
	public void setAnoFab(String anoFab) {
		this.anoFab = anoFab;
	}
	public int getTensao() {
		return tensao;
	}
	public void setTensao(int tensao) {
		this.tensao = tensao;
	}
	
	

}
