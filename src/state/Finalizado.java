package state;

public class Finalizado implements iState {
	public void aplicaDescontoExtra(Orcamento orcamento){
		throw new RuntimeException("N�o pode aplicar desconto");
	}

	@Override
	public void aprova(Orcamento orcamento) {
		// TODO Auto-generated method stub
		throw new RuntimeException("j� finalizado");
		
	}

	@Override
	public void reprova(Orcamento orcamento) {
		// TODO Auto-generated method stub
		throw new RuntimeException("j� finalizado");
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		// TODO Auto-generated method stub
		throw new RuntimeException("j� finalizado");
	}
}

