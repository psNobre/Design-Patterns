package builder;

public class mainBuilder {
	
	public static void main(String[] args) {
		BuildNotaFiscal buildNotaFiscal = new BuildNotaFiscal();
		
		buildNotaFiscal.paraEmpresa("LOL")
			.comCnpj("12.345.678/0001-12")
			.comItens(new ItemDaNota("item 1", 200.0))
			.comItens(new ItemDaNota("item 2", 250.0))
			.comItens(new ItemDaNota("item 3", 400.0))
			.comObservacoes("ta show")
			.naDataAtual();
		
		
		NotaFiscal notaFiscal = buildNotaFiscal.build();
		
		System.out.println(notaFiscal.getValorBruto());
	}

}
