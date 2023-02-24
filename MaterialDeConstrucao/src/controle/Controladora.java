package controle;

import visualizacao.EntradaSaida;
import modelo.*;

public class Controladora {

	Produtos produto = null;
	Estoque estoque = new Estoque();
	Cupom cupom = null;

	public void exibeMenu() {
		int opcao;
		String inserirDescricao = "";
		

		do {
			opcao = EntradaSaida.solicitaOpcao();

			switch (opcao) {
			case 0:
				// CADASTRO DE PRODUTO

				String inserirCodigo = EntradaSaida.inserirCodigo();
				boolean valida = estoque.validaCodigo(inserirCodigo);
				while (valida == true) {
					EntradaSaida.msgErro();
					inserirCodigo = EntradaSaida.inserirCodigo();
					valida = estoque.validaCodigo(inserirCodigo);
				}

				inserirDescricao = EntradaSaida.inserirDescricao();
				while (inserirDescricao.isBlank()) {
					EntradaSaida.msgErro();
					inserirDescricao = EntradaSaida.inserirDescricao();
				}

				double inserirPreco = EntradaSaida.inserirPreco();
				while (inserirPreco <= 0) {
					EntradaSaida.msgErro();
					inserirPreco = EntradaSaida.inserirPreco();
				}

				produto = new Produtos();

				produto.setCodigo(inserirCodigo);
				produto.setDescricao(inserirDescricao);
				produto.setPreco(inserirPreco);
				produto.setQuantidade(0);
				estoque.adicionarProduto(produto);
				break;

			case 1:
				// LISTA DE CADASTRADOS

				String listarCadastrados = estoque.montarListaCadastro();
				EntradaSaida.exibirListaCadastrados(listarCadastrados);
				break;

			case 2:
				// ENTRADA ESTOQUE

				inserirCodigo = EntradaSaida.solicitaCodigo();
				valida = estoque.validaExiste(inserirCodigo);
				while (valida == false) {
					EntradaSaida.msgErro();
					inserirCodigo = EntradaSaida.inserirCodigo();
					valida = estoque.validaExiste(inserirCodigo);
				}

				int quantidade = EntradaSaida.solicitaQuantidade();
				while (quantidade <= 0) {
					EntradaSaida.msgErro();
					quantidade = EntradaSaida.solicitaQuantidade();
				}

				estoque.entradaEstoque(inserirCodigo, quantidade);
				break;

			case 3:
				// VENDER PRODUTO

				inserirCodigo = EntradaSaida.solicitaCodigo();
				valida = estoque.validaExiste(inserirCodigo);
				while(valida == false) {
					EntradaSaida.msgErro();
					inserirCodigo = EntradaSaida.solicitaCodigo();
					valida = estoque.validaExiste(inserirCodigo);
				}

				quantidade = EntradaSaida.solicitaQuantidadeVendida();
				int quantidadeEst = estoque.retornaQuantidade(inserirCodigo);
				while (quantidade <= 0 || quantidade > quantidadeEst) {
					EntradaSaida.msgErro();
					quantidade = EntradaSaida.solicitaQuantidadeVendida();
				}

				estoque.vendeProduto(inserirCodigo, quantidade);
                estoque.removeProduto(inserirCodigo);

				cupom = new Cupom();

				cupom.setData(EntradaSaida.data());
				cupom.setDescricao(inserirDescricao);
				cupom.setQuantidade(quantidade);
				cupom.setValor(estoque.calculoCupons(inserirCodigo, quantidade));
				estoque.cadastrarCupom(cupom);

				break;

			case 4:
				// EXIBE A LISTA DE ESTOQUE

				String listarEstoque = estoque.montarListaEstoque();
				EntradaSaida.exibirListaEstoque(listarEstoque);
				break;

			case 5:
				// MONTAR LISTA DE CUPONS

				String listarCupons = estoque.montarListaCupons();
				EntradaSaida.exibirListaCupons(listarCupons);
				break;

			case 6:
				// EXIBE O VALOR TOTAL DOS CUPONS

				String calculoCupons = estoque.gerarValorTotal();
				EntradaSaida.exibeValorTotal(calculoCupons);
			}
		} while (opcao != 7);
		EntradaSaida.exibeMsgEncerrar();
		System.exit(0);
	}
}
