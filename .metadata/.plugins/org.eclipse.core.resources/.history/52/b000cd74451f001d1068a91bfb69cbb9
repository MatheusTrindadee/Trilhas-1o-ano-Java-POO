import javax.swing.JOptionPane;

//public: permite acesso a qualquer código externo a classe.
//protected: permite acesso às classes filhas, mas proíbe a qualquer outro acesso externo.
//private: proíbe qualquer acesso externo à própria classe, inclusive das classes filhas.

public class Principal {

	private static Operacoes oper = new Operacoes();
	
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
				resultado = oper.calculaSoma(num1, num2);
				break;
			case 2:
				resultado = oper.calculaSub(num1, num2);
				break;
			case 3:
				resultado = oper.calculaMult(num1, num2);
				break;
			case 4:
				while (num2 == 0) {
					num2 = EntradaSaida.solicitaNumero("2º");
				}
				resultado = oper.calculaDiv(num1, num2);
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
