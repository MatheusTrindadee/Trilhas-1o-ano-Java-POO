package controle;

import java.util.ArrayList;

import javax.swing.JOptionPane;
import vizualizacao.EntradaSaida;
import modelo.*;

public class Controladora {

	private Casa casa = null;

	public void exibeMenu() {
		int opcao;
		do {
			opcao = EntradaSaida.solicitaOperacao();

			switch (opcao) {
			case 0:
				this.casa = new Casa();
				String descricao = EntradaSaida.solicitaDescricao("casa", 0);
				String cor = EntradaSaida.solicitaCor();
				int qntdPortas = EntradaSaida.solicitaQntdAberturas ("portas");
				int qntdJanelas = EntradaSaida.solicitaQntdAberturas ("portas");
				ArrayList<Aberturas> listaDePortas = new ArrayList<Aberturas>();
				
				for (int i=0; i<qntdPortas; i++) {
					Porta porta = new Porta();
					porta.setDescricao(EntradaSaida.solicitaDescricao("porta", (i+1)));
					porta.setEstado(EntradaSaida.solicitaEstado("porta"));
					listaDePortas.add(porta);
				}
				
				ArrayList<Aberturas> listaDeJanelas = new ArrayList<Aberturas>();
				
				for (int i=0; i<qntdJanelas; i++) {
					Janela janela = new Janela();
					janela.setDescricao(EntradaSaida.solicitaDescricao("janela", (i+1)));
					janela.setEstado(EntradaSaida.solicitaEstado("janela"));
					listaDeJanelas.add(janela);
				}
				
				
				JOptionPane.showMessageDialog(null, "Construir Casa");
				this.casa.constroiCasa(descricao, cor, listaDePortas, listaDeJanelas);
				
				System.out.println("Descrição da casa: "+ casa.getDescricao()+"\n");
				System.out.println("Cor da casa: "+casa.getCor()+"\n");
				
				for (Aberturas porta : casa.getListaDePortas()) {
					System.out.println("Descrição da porta: "+porta.getDescricao()+"\n");
					System.out.println("Estado da porta: "+porta.getEstado()+"\n");
				}
				
				for (Aberturas janela : casa.getListaDeJanelas()) {
					System.out.println("Descrição da porta: "+janela.getDescricao()+"\n");
					System.out.println("Estado da porta: "+janela.getEstado()+"\n");
				}
				break;

			case 1:
				JOptionPane.showMessageDialog(null, "Movimentar portas ou janelas");
				break;

			case 2:
				JOptionPane.showMessageDialog(null, "Ver informações da casa");
				break;
			}
		} while (opcao != 3);
		
		EntradaSaida.exibeMsgEncerrarPrograma();
		
		System.exit(0);
		
	}

}
