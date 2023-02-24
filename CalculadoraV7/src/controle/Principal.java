package controle;


//public: permite acesso a qualquer código externo a classe.
//protected: permite acesso às classes filhas, mas proíbe a qualquer outro acesso externo.
//private: proíbe qualquer acesso externo à própria classe, inclusive das classes filhas.

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		controladora controladora = new controladora();
		controladora.exibeMenu();
		
	}

}
