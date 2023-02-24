import controle.*;

public class Principal {

	public static void main(String[] args) {

		Controladora controladora = new Controladora();
		controladora.exibeMenu();

	}

}
//JComboBox: caixa de dialogo para o usario selecionar alguma ação, de acordo com o que ele quer fazer.
//index: ele irá retornar a posição de acordo com o que foi selecionado [0,1,2,3,4]
//item: ele retornará a frase sobre a posição selecionada.