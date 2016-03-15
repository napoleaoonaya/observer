package observer;

public class Corretora implements AcaoDoObserver {

	private String nome;

	public Corretora(String nome) {
		this.nome = nome;
	}

	public void notificacaoDeAlteracao(Acao acao) {
		System.out.println("Corretora " + this.nome + " sendo notificada: ");
		System.out.println("A ação " + acao.getCodigo() + "teve o seu valor alterado para: " + acao.getValor());
	}

}
