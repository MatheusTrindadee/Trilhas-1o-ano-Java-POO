package modelo;



public class Produtos {

	private String codigo;
	private String descricao;
	private double preco;
	private int quantidade;
	

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Produtos() {
		setCodigo(codigo);
		setDescricao(descricao);
		setPreco(preco);
		setQuantidade(quantidade);
	}
}