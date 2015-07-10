package singleton;


public final class Janela {
	
	private static final Janela INSTANCE = new Janela(10);
	private int id;
	
	public Janela(int id) {
		this.id = id;		
	}
	
	public static Janela getInstance(){
		return INSTANCE;
	}
	
	public int getId() {
		return id;
	}
	
	public static void abrir(){
		System.out.println("Abri");
	}
	public static void fechar(){
		System.out.println("Fechei");
	}
	
	

}
