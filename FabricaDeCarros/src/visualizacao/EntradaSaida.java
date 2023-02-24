package visualizacao;

import javax.swing.JOptionPane;
import javax.swing.JComboBox;

public class EntradaSaida {

	public static int solicitaOpcao() {
		String[] opcoes = { "Fabricar carro", "Vender carro", "Ver informa��es", "Sair" };
		JComboBox<String> menu = new JComboBox<String>(opcoes);
		JOptionPane.showConfirmDialog(null, menu, "Selecione a op��o desejada", JOptionPane.OK_CANCEL_OPTION);

		return menu.getSelectedIndex();
	}

	public static void exibeMsgEncerrar() {
		JOptionPane.showMessageDialog(null, "O programa ser� encerrado");
	}

	public static String solicitaModelo() {
		String[] opcoes = { "Sedan", "Palio", "Renegade", "Batmovel" };
		JComboBox<String> menu = new JComboBox<String>(opcoes);
		JOptionPane.showConfirmDialog(null, menu, "Selecione a op��o desejada", JOptionPane.OK_CANCEL_OPTION);

		return (String) menu.getSelectedItem();
	}

	public static String solicitaCor() {
		String[] opcoes = { "Preto", "Branco", "Cinza", "Vermelho" };
		JComboBox<String> menu = new JComboBox<String>(opcoes);
		JOptionPane.showConfirmDialog(null, menu, "Selecione a op��o desejada", JOptionPane.OK_CANCEL_OPTION);

		return (String) menu.getSelectedItem();
	}

	public static String solicitaMotor() {
		String[] opcoes = { "1.0", "1.4", "1.6" };
		JComboBox<String> menu = new JComboBox<String>(opcoes);
		JOptionPane.showConfirmDialog(null, menu, "Selecione a op��o desejada", JOptionPane.OK_CANCEL_OPTION);

		return (String) menu.getSelectedItem();
	}

	public static String solicitaAro() {
		String[] opcoes = { "13", "14", "15" };
		JComboBox<String> menu = new JComboBox<String>(opcoes);
		JOptionPane.showConfirmDialog(null, menu, "Selecione a op��o desejada", JOptionPane.OK_CANCEL_OPTION);

		return (String) menu.getSelectedItem();
	}

	public static void exibeInfoCarro(String informacoes) {
		JOptionPane.showMessageDialog(null, informacoes, "Informa��es do carro", JOptionPane.INFORMATION_MESSAGE);
	}

	public static void exibeMsgErro() {
		JOptionPane.showMessageDialog(null, "Fabrique o carro primeiro!");
	}
	
	public static void exibeMsgErro2() {
		JOptionPane.showMessageDialog(null, "Este carro n�o esta na lista.");
	}
	
	
		

}
