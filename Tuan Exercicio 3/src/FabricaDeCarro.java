public class FabricaDeCarro {

	private static FabricaDeCarro exemplo;

	private FabricaDeCarro() {
	}

	public static synchronized FabricaDeCarro getInstance() {
		if (exemplo == null)
			exemplo = new FabricaDeCarro();

		return exemplo;
	}
}


/*O Padr�o Singleton � utilizado quando necessita-se de um ponto �nico para cria��o 
 * de uma inst�ncia de classe e quando precisamos de apenas uma inst�ncia de uma 
 * classe */






