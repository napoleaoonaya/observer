package observer;

import java.util.HashSet;
import java.util.Set;

public class Acao {

	// Atributos
	private String codigo;
	private double valor;

	// Construtor
	public Acao(String codigo, double valor) {
		this.codigo = codigo;
		this.valor = valor;
	}

	private Set<AcaoDoObserver> interessados = new HashSet<AcaoDoObserver>();

	public void registraInteressado(AcaoDoObserver interessado) {
		this.interessados.add(interessado);
	}

	public void cancelaInteresse(AcaoDoObserver interessado) {
		this.interessados.remove(interessado);
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
		for(AcaoDoObserver interessado : this.interessados){
			interessado.notificacaoDeAlteracao(this);
		}
	}

}
