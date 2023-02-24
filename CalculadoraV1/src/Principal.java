import javax.swing.JOptionPane;

//public: permite acesso a qualquer código externo a classe.
//protected: permite acesso às classes filhas, mas proíbe a qualquer outro acesso externo.
//private: proíbe qualquer acesso externo à própria classe, inclusive das classes filhas.

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int continuar;
		double resultado=0;

		do {
			double num1 = solicitaNumero("1º");
			double num2 = solicitaNumero("2º");
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
					num2 = solicitaNumero("2º");
				}
				resultado = calculaDiv(num1, num2);
				break;
			default:
				JOptionPane.showMessageDialog(null, "Operação inválida! A calculadora será encerrada.");
				System.exit(0);
			}

			mostrarResultado(resultado, operacao);
			continuar = Integer.parseInt(JOptionPane.showInputDialog("Deseja continuar calculando? 1 - Sim | 2 - Não"));

		} while (continuar == 1);

	}

	protected static int solicitaOperacao() {
		int operacao = Integer.parseInt(JOptionPane.showInputDialog("Escolha a operação desejada: \n" + "1 - Soma\n"
				+ "2 - Subtração\n" + "3 - Multiplicação\n" + "4 - Divisão\n"));
		return operacao;

	}

	protected static double solicitaNumero(String ordem) {
		double num = Double.parseDouble(JOptionPane.showInputDialog("Informe o " + ordem + " número"));
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
			op = "subtração";
		} else if (operacao == 3) {
			op = "multiplicação";
		} else {
			op = "divisão";
		}
		JOptionPane.showMessageDialog(null, "O resultado da " + op + " é: " + resultado);
	}
}
