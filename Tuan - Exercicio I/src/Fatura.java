public class Fatura {
	
	private String numero;
	private String descricao;
	private int qntItem;
	private double preco;
	
	
	
	public Fatura(String numero, String descricao, int qntitem, double preco) {
		super();
		this.numero = numero;
		this.descricao = descricao;
		this.qntItem = qntitem;
		this.preco = preco;
	}
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getQntItem() {
		return qntItem;
	}
	public void setQntItem(int qntItem) {
		this.qntItem = qntItem;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public double getValorFatura ( int qntItem, double preco){
		if (qntItem < 0){
			qntItem = 0;
		}
		
		if (preco < 0){
			preco = 0.0;
		}
		
		double valortotal = qntItem * preco;
		return valortotal;

		
	}
	
	public String toString() {
		return "Fatura [numero=" + numero + ", descricao=" + descricao + ", qntItem=" + qntItem + ", preco=" + preco
				+ "]";
	}
	
	
	

}
