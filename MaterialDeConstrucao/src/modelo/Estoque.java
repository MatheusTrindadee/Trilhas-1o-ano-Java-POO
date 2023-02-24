package modelo;

import java.util.ArrayList;



import java.text.DecimalFormat;

public class Estoque {
	private ArrayList<Produtos> listaDeProdutos = new ArrayList<Produtos>();
	private ArrayList<Produtos> listaDeEstoque = new ArrayList<Produtos>();
	private ArrayList<Cupom> listaDeCupom = new ArrayList<Cupom>();
	private int codigo;
	private double preco;
	private String descricao;
	private int quantidade;

	DecimalFormat df = new DecimalFormat("0.00");

	// LISTAS

	public String montarListaCadastro() {
		String lista = "";

		for (Produtos estoque : listaDeProdutos) {
			lista += "\n C�digo: " + estoque.getCodigo() + "\n Descri��o: " + estoque.getDescricao() + "\n Pre�o: "
					+ estoque.getPreco();
		}
		return lista;
	}

	public String montarListaEstoque() {
		String lista = "";

		for (Produtos estoque : listaDeEstoque) {
			lista += "\n C�digo: " + estoque.getCodigo() + "\n Descri��o: " + estoque.getDescricao() + "\n Pre�o: "
					+ estoque.getPreco() + "\n Quantidade: " + estoque.getQuantidade();
		}
		return lista;
	}

	public String montarListaCupons() {
		String lista = "";

		for (Cupom cupom : listaDeCupom) {
			lista += "\n Data: " + cupom.getData() + "\n Descri��o: " + cupom.getDescricao() + "\n Quantidade Vendida: "
					+ cupom.getQuantidade() + "\n Valor: " + cupom.getValor();
		}
		return lista;
	}

	// LISTAS

	public void adicionarProduto(Produtos produto) {
		listaDeProdutos.add(produto);

	}

	public boolean validaCodigo(String codigo) {
		for (int i = 0; i < listaDeProdutos.size(); i++) {
			Produtos produto = listaDeProdutos.get(i);
			if (produto.getCodigo().equals(codigo)) {
				return true;
			}
		}

		return false;
	}
	
	public boolean validaExiste (String codigo) {
		for (int i = 0; i < listaDeProdutos.size(); i++) {
			Produtos produto = listaDeProdutos.get(i);
			if (produto.getCodigo().equals(codigo)) {
				return true;
			}
		}

		return false;
	}

	public void entradaEstoque(String codigo, int quantidade) {
		for (int i = 0; i < listaDeProdutos.size(); i++) {
			Produtos produto = listaDeProdutos.get(i);
			if (produto.getCodigo().contains(codigo) && produto.getQuantidade() == 0) {
				produto.setQuantidade(quantidade);
				listaDeEstoque.add(produto);

			} else if (produto.getCodigo().contains(codigo) && produto.getQuantidade() != 0) {
				int estoqueQuantidade = produto.getQuantidade();
				estoqueQuantidade += quantidade;
				produto.setQuantidade(estoqueQuantidade);
			}
		}
	}

	public void vendeProduto(String codigo, int quantidade) {
		for (int i = 0; i < listaDeEstoque.size(); i++) {
			Produtos produto = listaDeEstoque.get(i);
			if (produto.getCodigo().contains(codigo)) {
				int quantidadeEstoque = produto.getQuantidade();
				quantidadeEstoque -= quantidade;
				produto.setQuantidade(quantidadeEstoque);
			}
		}
		
	}

	public void removeProduto(String codigo) {
		for (int i = 0; i < listaDeEstoque.size(); i++) {
			Produtos produto = listaDeEstoque.get(i);
			if (produto.getCodigo().contains(codigo) && (produto.getQuantidade() == 0)) {
				listaDeEstoque.remove(produto);
			}
		}
	}

	public double calculoCupons(String codigo, int quantidade) {
		double valorTotal = 0;

		for (int i = 0; i < listaDeEstoque.size(); i++) {
			Produtos produto = listaDeEstoque.get(i);
			if (produto.getCodigo().contains(codigo)) {
				valorTotal = produto.getPreco();
				valorTotal = valorTotal * quantidade;
			}
		}

		return valorTotal;
	}

	public void cadastrarCupom(Cupom cupom) {
		listaDeCupom.add(cupom);
	}

	public String gerarValorTotal() {
		String valor = "";
		double total = 0;

		for (int i = 0; i < listaDeCupom.size(); i++) {
			Cupom cupom = this.listaDeCupom.get(i);
			total += cupom.getValor();
			valor = df.format(total);
		}
		return valor;
	}
	
	public int retornaQuantidade(String codigo) {
		int quantidade = 0;
		
		for (int i = 0; i < listaDeEstoque.size(); i++) {
			Produtos produto = listaDeEstoque.get(i);
			if (produto.getCodigo().contains(codigo)) {
				quantidade = produto.getQuantidade();
			}
		}
		return quantidade;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
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

}
