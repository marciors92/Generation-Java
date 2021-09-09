package POO;

public class Aviao {
	
	private String nome,modelo,cor,anoFab;
	private double qtdeAssentos,veloMax,pesoMax;
	public Aviao(String nome, String modelo, String cor, String anoFab, double qtdeAssentos, double veloMax,
			double pesoMax) {
		super();
		this.nome = nome;
		this.modelo = modelo;
		this.cor = cor;
		this.anoFab = anoFab;
		this.qtdeAssentos = qtdeAssentos;
		this.veloMax = veloMax;
		this.pesoMax = pesoMax;
	}
	
	public void exibirAviao() {
		System.out.println("\nNome: " +this.nome+ "\nModelo: " +this.modelo+ "\nCor: " +this.cor+ 
				"\nAno de Fabricação: " +this.anoFab+ "\nQuantidade de Assentos: " +this.qtdeAssentos+ 
				"\nVelocidade Máxima: " +this.veloMax+ "\nVPeso Máximo: " +this.pesoMax);
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
	public double getQtdeAssentos() {
		return qtdeAssentos;
	}
	public void setQtdeAssentos(double qtdeAssentos) {
		this.qtdeAssentos = qtdeAssentos;
	}
	public double getVeloMax() {
		return veloMax;
	}
	public void setVeloMax(double veloMax) {
		this.veloMax = veloMax;
	}
	public double getPesoMax() {
		return pesoMax;
	}
	public void setPesoMax(double pesoMax) {
		this.pesoMax = pesoMax;
	}
	
}
