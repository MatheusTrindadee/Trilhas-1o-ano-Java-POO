package controle;


//public: permite acesso a qualquer c�digo externo a classe.
//protected: permite acesso �s classes filhas, mas pro�be a qualquer outro acesso externo.
//private: pro�be qualquer acesso externo � pr�pria classe, inclusive das classes filhas.

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		controladora controladora = new controladora();
		controladora.exibeMenu();
		
	}

}
