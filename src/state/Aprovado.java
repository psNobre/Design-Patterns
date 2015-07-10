package state;

public class Aprovado implements iState {
	public void aplicaDescontoExtra(Orcamento orcamento){
		orcamento.valor -= orcamento.valor * 0.02;
	}

	@Override
	public void aprova(Orcamento orcamento) {
		// TODO Auto-generated method stub
		throw new RuntimeException("Oracamento já aprovado");
		
	}

	@Override
	public void reprova(Orcamento orcamento) {
		// TODO Auto-generated method stub
		throw new RuntimeException("Oracamento não pode ser reprovado, já foi aprovado");
		
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		// TODO Auto-generated method stub
		orcamento.estadoAtual = new Finalizado();
		
	}
}
