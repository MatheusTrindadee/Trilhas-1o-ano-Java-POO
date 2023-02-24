import javax.swing.JOptionPane;

//public: permite acesso a qualquer código externo a classe.
//protected: permite acesso às classes filhas, mas proíbe a qualquer outro acesso externo.
//private: proíbe qualquer acesso externo à própria classe, inclusive das classes filhas.

public class Principal {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int continuar;
		double resultado = 0;

		do {
			double num1 = EntradaSaida.solicitaNumero("1º");
			double num2 = EntradaSaida.solicitaNumero("2º");
			int operacao = EntradaSaida.solicitaOperacao();

			switch (operacao) {
			case 1:
				Soma soma = new Soma();
				soma.setNum1(num1);
				soma.setNum2(num2);
				resultado = soma.calcula();
				break;
			case 2:
				Subtração sub = new Subtração();
				sub.setNum1(num1);
				sub.setNum2(num2);
				resultado = sub.calcula();
				break;
			case 3:
				Multiplicação mult = new Multiplicação();
				mult.setNum1(num1);
				mult.setNum2(num2);
				resultado = mult.calcula();
				break;
			case 4:
				while (num2 == 0) {
					num2 = EntradaSaida.solicitaNumero("2º");
				}
				Divisão div = new Divisão ();
				div.setNum1(num1);
				div.setNum2(num2);
				resultado = div.calcula();
				break;
			default:
				JOptionPane.showMessageDialog(null, "Operação inválida! A calculadora será encerrada.");
				System.exit(0);
			}

			EntradaSaida.mostrarResultado(resultado, operacao);
			continuar = Integer.parseInt(JOptionPane.showInputDialog("Deseja continuar calculando? 1 - Sim | 2 - Não"));

		} while (continuar == 1);

	}

}
