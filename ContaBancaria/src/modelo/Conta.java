package modelo;

import java.util.ArrayList;

public class Conta {
	
	private String titularDaConta;
	private String tipo;
	private double saldo;
	private ArrayList<Movimentacao> listaDeMovimentacao = new ArrayList<Movimentacao>();

	public void depositar(double valor) {

		saldo += valor;
	}

	public void sacar(double valor) {

		saldo -= valor;

	}

	public String gerarSaldo() {
		String saldo;

		saldo = "Saldo da sua conta é de: R$ " + this.getSaldo();
		return saldo;
	}

	public String gerarDadosDaConta() {
		String dados = "";

		dados = "Titular Da Conta: " + this.getTitularDaConta() + "\nTipo: " + this.getTipo() + "\nSaldo: "
				+ this.getSaldo();
		return dados;
	}

	public String gerarExtrato() {
		String extrato = "";

		for (Movimentacao movimentacao : listaDeMovimentacao) {
			extrato += "\nData : " + movimentacao.getData() + "\nTipo: " + movimentacao.getTipo() + "\nValor: "
					+ movimentacao.getValor();
		}
		return extrato;
	}

	public String gerarExtratoDepositos() {
		String tipo = "Deposito";
		String extratoDeposito = "";

		for (int i = 0; i < listaDeMovimentacao.size(); i++) {
			Movimentacao movimentacao = listaDeMovimentacao.get(i);

			if (movimentacao.getTipo().contains(tipo)) {
				extratoDeposito += "\nData : " + movimentacao.getData() + "\nTipo: " + movimentacao.getTipo()
						+ "\nValor: " + movimentacao.getValor();
			}
		}
		return extratoDeposito;
	}

	public String gerarExtratoSaques() {
		String tipo = "Saque";
		String extratoSaque = "";

		for (int i = 0; i < listaDeMovimentacao.size(); i++) {
			Movimentacao movimentacao = listaDeMovimentacao.get(i);

			if (movimentacao.getTipo().contains(tipo)) {
				extratoSaque += "\nData : " + movimentacao.getData() + "\nTipo: " + movimentacao.getTipo() + "\nValor: "
						+ movimentacao.getValor();
			}
		}
		return extratoSaque;
	}

	public void adicionarMovimentacao(Movimentacao movimentacao) {
		listaDeMovimentacao.add(movimentacao);
	}

	public String getTitularDaConta() {
		return titularDaConta;
	}

	public void setTitularDaConta(String titularDaConta) {
		this.titularDaConta = titularDaConta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Conta() {
		setTitularDaConta(titularDaConta);
		setTipo(tipo);
		setSaldo(saldo);
	}

}
