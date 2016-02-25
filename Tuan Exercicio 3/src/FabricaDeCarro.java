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


/*O Padrão Singleton é utilizado quando necessita-se de um ponto único para criação 
 * de uma instância de classe e quando precisamos de apenas uma instância de uma 
 * classe */






