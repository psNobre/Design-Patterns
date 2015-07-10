package state;

public class Reprovado implements iState {
	public void aplicaDescontoExtra(Orcamento orcamento){
		throw new RuntimeException("Somente orçamento em aprovaçã ou aprovados");
	}

	@Override
	public void aprova(Orcamento orcamento) {
		// TODO Auto-generated method stub
		throw new RuntimeException("não pode voltar para aprovado");
		
	}

	@Override
	public void reprova(Orcamento orcamento) {
		// TODO Auto-generated method stub
		throw new RuntimeException("Oracamento já está reprovado");
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		// TODO Auto-generated method stub
		orcamento.estadoAtual = new Finalizado();
		
	}
}
