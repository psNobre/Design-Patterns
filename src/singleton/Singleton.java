package singleton;

public class Singleton {

	public static void main(String[] args) {
		Janela janelaGlobal = Janela.getInstance();
		System.out.println(janelaGlobal.getId());
		
		Janela janelaLocal = new Janela(20);
		System.out.println(janelaLocal.getId());
		
		Janela.abrir();
		Janela.fechar();

	}

}
