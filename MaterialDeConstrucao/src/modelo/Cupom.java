package modelo;

public class Cupom {

	private String data;
	private String descricao;
	private int quantidade;
	private double valor;
	
	
	
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public Cupom () {
		setData(data);
		setDescricao(descricao);
		setQuantidade(quantidade);
		setValor(valor);
	}
	
}
