package vizualizacao;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;


public class EntradaSaida {

	public static int solicitaOperacao() {
		String[] opcoes = { "Construir casa", "Movimentar portas ou janelas", "Ver informa??es da casa",
				"Sair do programa" };
		JComboBox<String> menu = new JComboBox<String>(opcoes);
		JOptionPane.showConfirmDialog(null, menu, "Selecione a op??o desejada", JOptionPane.OK_CANCEL_OPTION);

		return menu.getSelectedIndex();
	}

	public static void exibeMsgEncerrarPrograma() {
		JOptionPane.showMessageDialog(null, "O programa ser? encerrado");
	}

}
