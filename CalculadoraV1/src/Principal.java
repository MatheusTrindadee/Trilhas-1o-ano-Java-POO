import javax.swing.JOptionPane;

//public: permite acesso a qualquer c�digo externo a classe.
//protected: permite acesso �s classes filhas, mas pro�be a qualquer outro acesso externo.
//private: pro�be qualquer acesso externo � pr�pria classe, inclusive das classes filhas.

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int continuar;
		double resultado=0;

		do {
			double num1 = solicitaNumero("1�");
			double num2 = solicitaNumero("2�");
			int operacao = solicitaOperacao();

			switch (operacao) {
			case 1:
				resultado = calculaSoma(num1, num2);
				break;
			case 2:
				resultado = calculaSub(num1, num2);
				break;
			case 3:
				resultado = calculaMult(num1, num2);
				break;
			case 4:
				while (num2 == 0) {
					num2 = solicitaNumero("2�");
				}
				resultado = calculaDiv(num1, num2);
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opera��o inv�lida! A calculadora ser� encerrada.");
				System.exit(0);
			}

			mostrarResultado(resultado, operacao);
			continuar = Integer.parseInt(JOptionPane.showInputDialog("Deseja continuar calculando? 1 - Sim | 2 - N�o"));

		} while (continuar == 1);

	}

	protected static int solicitaOperacao() {
		int operacao = Integer.parseInt(JOptionPane.showInputDialog("Escolha a opera��o desejada: \n" + "1 - Soma\n"
				+ "2 - Subtra��o\n" + "3 - Multiplica��o\n" + "4 - Divis�o\n"));
		return operacao;

	}

	protected static double solicitaNumero(String ordem) {
		double num = Double.parseDouble(JOptionPane.showInputDialog("Informe o " + ordem + " n�mero"));
		return num;
	}

	private static double calculaSoma(double num1, double num2) {
		double soma = num1 + num2;
		return soma;
	}

	private static double calculaSub(double num1, double num2) {
		double sub = num1 - num2;
		return sub;
	}

	private static double calculaMult(double num1, double num2) {
		double mult = num1 * num2;
		return mult;
	}

	private static double calculaDiv(double num1, double num2) {
		double div = num1 / num2;
		return div;
	}

	private static void mostrarResultado(double resultado, int operacao) {
		String op = "";
		if (operacao == 1) {
			op = "soma";
		} else if (operacao == 2) {
			op = "subtra��o";
		} else if (operacao == 3) {
			op = "multiplica��o";
		} else {
			op = "divis�o";
		}
		JOptionPane.showMessageDialog(null, "O resultado da " + op + " �: " + resultado);
	}
}
