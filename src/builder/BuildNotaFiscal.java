package builder;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class BuildNotaFiscal {
	
	private String razaoSocial;
	private String cnpj;
	private Calendar dataEmissao;
	private double valorBruto;
	private double impostos;
	public List<ItemDaNota> itens = new ArrayList<ItemDaNota>();
	public String observacoes;
	
	public BuildNotaFiscal paraEmpresa(String razaoSocial){
		this.razaoSocial = razaoSocial;
		return this;
		
	}
	
	public BuildNotaFiscal comCnpj(String cnpj) {
		this.cnpj = cnpj;
		return this;
	}
	
	public BuildNotaFiscal naDataAtual() {
		this.dataEmissao = Calendar.getInstance();
		return this;
	}
	
	public BuildNotaFiscal comItens(ItemDaNota item) {		
		itens.add(item);
		valorBruto +=item.getValor();
		impostos += item.getValor() * 0.05;
		return this;
		
	}
	
	public BuildNotaFiscal comObservacoes(String observacoes) {
		this.observacoes = observacoes;
		return this;
	}
	
	public NotaFiscal build(){
		return new NotaFiscal(razaoSocial, cnpj, dataEmissao, valorBruto, impostos, itens, observacoes);
	}
	

}
