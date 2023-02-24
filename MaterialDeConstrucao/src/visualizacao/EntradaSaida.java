package visualizacao;

import java.util.Calendar;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class EntradaSaida {

	public static int solicitaOpcao() {
		String[] opcoes = { "Cadastrar Produtos", "Listar produtos cadastrados", "Dar Entrada nos Produtos",
				"Vender Produtos", "Listar produtos no estoque", "Exibir cupons gerados", "Calcular todos os cupons",
				"Sair" };
		JComboBox<String> menu = new JComboBox<String>(opcoes);
		JOptionPane.showConfirmDialog(null, menu, "Selecione a op��o desejada", JOptionPane.OK_CANCEL_OPTION);

		return menu.getSelectedIndex();
	}

	public static String inserirCodigo() {
		String codigo = JOptionPane.showInputDialog("Informe o c�digo do produto: ");
		return codigo;
	}

	public static String inserirDescricao() {
		String descricao = JOptionPane.showInputDialog("Informe a descri��o do produto: ");
		return descricao;
	}

	public static double inserirPreco() {
		double preco = Double.parseDouble(JOptionPane.showInputDialog("Informe o pre�o do produto: "));
		return preco;
	}

	public static void exibirListaCadastrados(String listarCadastrados) {
		JOptionPane.showMessageDialog(null, listarCadastrados);
	}

	public static void exibirListaEstoque(String listarEstoque) {
		JOptionPane.showMessageDialog(null, listarEstoque);
	}

	public static void exibirListaCupons(String listarCupons) {
		JOptionPane.showMessageDialog(null, listarCupons);
	}

	public static String solicitaCodigo() {
		String codigo = JOptionPane.showInputDialog(null, "Digite o c�digo do produto: ");
		return codigo;
	}

	public static int solicitaQuantidade() {
		int quantidade = 0;
		String solicita = "";
		while (true) {

			solicita = (JOptionPane.showInputDialog(null, "Digite a quantidade de produtos: "));
			try {
				quantidade = Integer.parseInt(solicita);
				break;

			} catch (NumberFormatException erro) {
				JOptionPane.showMessageDialog(null, "Erro");
			}
		}
		return quantidade;
	}
	
	public static int solicitaQuantidadeVendida() {
		int quantidade = 0;
		String solicita = "";
		while (true) {

			solicita = (JOptionPane.showInputDialog(null, "Digite a quantidade de produtos que ir� ser vendido: "));
			try {
				quantidade = Integer.parseInt(solicita);
				break;

			} catch (NumberFormatException erro) {
				JOptionPane.showMessageDialog(null, "Erro");
			}
		}
		return quantidade;
	}

	public static String data() {
		Calendar calendario = Calendar.getInstance();
		String data = "";
		data += calendario.get(Calendar.DATE) + "/" + calendario.get(Calendar.MONTH) + "/"
				+ calendario.get(Calendar.YEAR);

		return data;
	}

	public static void exibeValorTotal(String calculoCupons) {
		JOptionPane.showMessageDialog(null, calculoCupons);
	}

	public static void msgErro() {
		JOptionPane.showMessageDialog(null, "Deu erro");
	}

	public static void exibeMsgEncerrar() {
		JOptionPane.showMessageDialog(null, "O programa ser� encerrado");
	}
}
