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
			double num1 = EntradaSaida.solicitaNumero("1�");
			double num2 = EntradaSaida.solicitaNumero("2�");
			int operacao = EntradaSaida.solicitaOperacao();

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
					num2 = EntradaSaida.solicitaNumero("2�");
				}
				resultado = calculaDiv(num1, num2);
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opera��o inv�lida! A calculadora ser� encerrada.");
				System.exit(0);
			}

			EntradaSaida.mostrarResultado(resultado, operacao);
			continuar = Integer.parseInt(JOptionPane.showInputDialog("Deseja continuar calculando? 1 - Sim | 2 - N�o"));

		} while (continuar == 1);

	}

	public static double calculaSoma(double num1, double num2) {
		double soma = num1 + num2;
		return soma;
	}

	public static double calculaSub(double num1, double num2) {
		double sub = num1 - num2;
		return sub;
	}

	public static double calculaMult(double num1, double num2) {
		double mult = num1 * num2;
		return mult;
	}

	public static double calculaDiv(double num1, double num2) {
		double div = num1 / num2;
		return div;
	}

	
}
