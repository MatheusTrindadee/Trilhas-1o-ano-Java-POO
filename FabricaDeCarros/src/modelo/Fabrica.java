package modelo;

import java.util.ArrayList;

import visualizacao.EntradaSaida;

public class Fabrica {

	ArrayList<Carro> listaDeCarros = new ArrayList<Carro>();

	public void vendeCarro(String corDeVenda, String modelo) {
		boolean validadora = false;
		for (int i = 0; i < listaDeCarros.size(); i++) {
			Carro carro = listaDeCarros.get(i);
			if (carro.getCor().contains(corDeVenda) && carro.getModelo().contains(modelo)) {
				listaDeCarros.remove(carro);
				validadora = true;
			}
		}
		if (validadora == false) {
			EntradaSaida.exibeMsgErro2();
		}
	}

	public void fabricaCarro(Carro carro) {

		listaDeCarros.add(carro);
	}

	public void mostrarLista() {
		for (Carro carro : listaDeCarros) {
			System.out.println(carro.getModelo());
			System.out.println(carro.getCor());
			System.out.println(carro);
		}
	}

	public String geraInfoCarro() {
		String informacoes = "";
		for (Carro carro : listaDeCarros) {
			informacoes += "Modelo: " + carro.getModelo() + "\nCor: " + carro.getCor() + "\nMotor: " + carro.getMotor()
					+ "\nAro: " + carro.getAro() + "\n";
		}
		if (informacoes.isBlank()) {
			return informacoes = "A lista esta vazia!";
		}
		return informacoes;

	}

	public boolean verificaLista() {
		if (listaDeCarros.isEmpty()) {
			return false;
		}
		return true;
	}
}
