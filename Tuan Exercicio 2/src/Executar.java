import java.util.Scanner;

public class Executar {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String cor;
		String modelo;
		int velocidadeAtual;
		int velocidadeMaxima;
		int velocidadeAcrescentada = 0;
		int aumentarVelocidade;
		
		System.out.print("digite a cor do carro: ");
		cor = scan.next();
		System.out.print("digite o modelo do carro: ");
		modelo = scan.next();
		System.out.print("digite a velocidade máxima do carro: ");
		velocidadeMaxima = scan.nextInt();
		velocidadeAtual = 0;
		
		Carro carro1 = new Carro(cor, modelo,  velocidadeMaxima, velocidadeAtual);
		
		carro1.ligar();

					
			aumentarVelocidade = scan.nextInt();
			
			carro1.acelerar(aumentarVelocidade);
			System.out.println(carro1);		
			
		}


	
		
}




