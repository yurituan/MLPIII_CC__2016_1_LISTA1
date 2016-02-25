import java.util.Scanner;

public class Executavel {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	 
	 String numero;
	 String descricao;	
	 int qntitem;
	 double preco;
	
	System.out.println("digite o preço do produto");
	preco = scan.nextDouble();
	System.out.println("digite a quantidade do produto");
	qntitem = scan.nextInt();
	System.out.println("digite o numero do produto");
	numero = scan.next();
	System.out.println("digite a descrição do produto");
	descricao = scan.next();
	
	Fatura fatura1 = new Fatura(numero,descricao, qntitem, preco);
	
	fatura1.getValorFatura(qntitem, preco);
	
	System.out.println(fatura1);
	

	}

}
