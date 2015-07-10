package state;

public class EmAprovacao implements iState {
	
	public void aplicaDescontoExtra(Orcamento orcamento){
		orcamento.valor -= orcamento.valor * 0.05;
	}

	@Override
	public void aprova(Orcamento orcamento) {
		// TODO Auto-generated method stub
		orcamento.estadoAtual = new Aprovado();
		
		
	}

	@Override
	public void reprova(Orcamento orcamento) {
		// TODO Auto-generated method stub
		orcamento.estadoAtual = new Reprovado();
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		// TODO Auto-generated method stub
		throw new RuntimeException("Oracamento em aprovacao");
		
	}

}
