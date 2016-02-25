
public class Carro {
	
	private String cor;
	private String modelo;
	private int velocidadeMaxima;
	private int velocidadeAtual;
	
	public Carro(String cor, String modelo, int velocidadeMaxima, int velocidadeAtual) {
		super();
		this.cor = cor;
		this.modelo = modelo;
		this.velocidadeMaxima = velocidadeMaxima;
		this.velocidadeAtual = velocidadeAtual;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(int velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public int getVelocidadeAtual() {
		return velocidadeAtual;
	}

	public void setVelocidadeAtual(int velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}

	public void ligar(){
		System.out.println("carro ligado");
	}
	
	public void acelerar(int velocidadeAcrescentada){
		
		if (velocidadeAcrescentada > velocidadeMaxima){
			System.out.println("velocidade excedida");	
		}else{
			System.out.print("Digite a velocidade a se acrescentar: ");	
				this.velocidadeAtual = this.velocidadeAtual + velocidadeAcrescentada; 	
		}
	}

	@Override
	public String toString() {
		return "Carro [cor=" + cor + ", modelo=" + modelo + ", velocidadeMaxima=" + velocidadeMaxima
				+ ", velocidadeAtual=" + velocidadeAtual + "]";
	}
	
	

}
