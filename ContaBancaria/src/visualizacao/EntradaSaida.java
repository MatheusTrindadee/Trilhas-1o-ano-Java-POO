package visualizacao;

import javax.swing.JOptionPane;

import java.util.Calendar;

import javax.swing.JComboBox;



public class EntradaSaida {

	public static String solicitaTitularDaConta() {
		String nome = JOptionPane.showInputDialog(null, "Infome seu nome");
		return nome;
	}

	public static String solicitaTipoDaConta() {
		String tipo = "";
		String[] opcoes = { "Corrente", "Poupança" };
		JComboBox<String> menu = new JComboBox<String>(opcoes);
		JOptionPane.showConfirmDialog(null, menu, "Selecione a opção desejada", JOptionPane.OK_CANCEL_OPTION);

		for (int i = 0; i < 2; i++) {
			if (i == menu.getSelectedIndex()) {
				tipo = opcoes[i];
			}
		}
		return tipo;
	}

	public static int solicitaOpcao() {
		String[] opcoes = { "Depositar", "Sacar", "Gerar Saldo", "Gerar Dados da Conta", "Gerar Extrato",
				"Gerar Extrato dos Depósitos", "Gerar Extrato dos Saques", "Sair" };
		JComboBox<String> menu = new JComboBox<String>(opcoes);
		JOptionPane.showConfirmDialog(null, menu, "Selecione a opção desejada", JOptionPane.OK_CANCEL_OPTION);

		return menu.getSelectedIndex();
	}

	public static double solicitarInformacoesDeposito() {
		double deposito = Integer
				.parseInt(JOptionPane.showInputDialog("Informe quanto de dinheiro você quer depositar:"));
		while (deposito <= 0) {
			JOptionPane.showMessageDialog(null, "Você não pode depositar esta quantia");
			deposito = Integer.parseInt(JOptionPane.showInputDialog("Informe quanto de dinheiro você quer depositar:"));
		}

		return deposito;

	}

	public static double solicitarInformacoesSaque() {
		double saque = Integer.parseInt(JOptionPane.showInputDialog("Informe quanto de dinheiro você quer sacar:"));
		while (saque <= 0)  {
			JOptionPane.showMessageDialog(null, "Você não pode sacar esta quantia");
			saque = Integer.parseInt(JOptionPane.showInputDialog("Informe quanto de dinheiro você quer sacar:"));
		}

		return saque;
	}

	public static void exibirSaldo(String saldo) {

		JOptionPane.showMessageDialog(null, saldo);
	}

	public static void exibirDadosDaConta(String dados) {

		JOptionPane.showMessageDialog(null, dados);
	}

	public static void exibirExtratoCompleto(String extrato) {
		JOptionPane.showMessageDialog(null, extrato);
	}

	public static void exibirExtratoDeDepositos(String extratoDepositos) {
		JOptionPane.showMessageDialog(null, extratoDepositos);
	}

	public static void exibirExtratoDeSaques(String extratoSaque) {
		JOptionPane.showMessageDialog(null, extratoSaque);
	}

	public static String data() {
		Calendar calendario = Calendar.getInstance();
		String data = "";
		data += calendario.get(Calendar.DATE) + "/" + calendario.get(Calendar.MONTH) + "/"
				+ calendario.get(Calendar.YEAR);

		return data;
	}

	public static void exibeMsgEncerrar() {
		JOptionPane.showMessageDialog(null, "O programa será encerrado");
	}

	public static void exibeMsgErro() {
		JOptionPane.showMessageDialog(null, "Faça uma movimentação primeiro");
	}

	public static void exibeMsgErro2() {
		JOptionPane.showMessageDialog(null, "Sua conta não pode estar tão negativa");
	}

}
