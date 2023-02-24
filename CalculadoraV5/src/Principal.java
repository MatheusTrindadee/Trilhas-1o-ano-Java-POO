import javax.swing.JOptionPane;

//public: permite acesso a qualquer c�digo externo a classe.
//protected: permite acesso �s classes filhas, mas pro�be a qualquer outro acesso externo.
//private: pro�be qualquer acesso externo � pr�pria classe, inclusive das classes filhas.

public class Principal {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int continuar;
		double resultado = 0;

		do {
			double num1 = EntradaSaida.solicitaNumero("1�");
			double num2 = EntradaSaida.solicitaNumero("2�");
			int operacao = EntradaSaida.solicitaOperacao();

			switch (operacao) {
			case 1:
				Soma soma = new Soma();
				soma.setNum1(num1);
				soma.setNum2(num2);
				resultado = soma.calcula();
				break;
			case 2:
				Subtra��o sub = new Subtra��o();
				sub.setNum1(num1);
				sub.setNum2(num2);
				resultado = sub.calcula();
				break;
			case 3:
				Multiplica��o mult = new Multiplica��o();
				mult.setNum1(num1);
				mult.setNum2(num2);
				resultado = mult.calcula();
				break;
			case 4:
				while (num2 == 0) {
					num2 = EntradaSaida.solicitaNumero("2�");
				}
				Divis�o div = new Divis�o ();
				div.setNum1(num1);
				div.setNum2(num2);
				resultado = div.calcula();
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opera��o inv�lida! A calculadora ser� encerrada.");
				System.exit(0);
			}

			EntradaSaida.mostrarResultado(resultado, operacao);
			continuar = Integer.parseInt(JOptionPane.showInputDialog("Deseja continuar calculando? 1 - Sim | 2 - N�o"));

		} while (continuar == 1);

	}

}
