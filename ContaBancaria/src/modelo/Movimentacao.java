package modelo;

public class Movimentacao {

	private String tipo;
	private double valor;
	private String data;

	public Movimentacao() {
		setTipo(tipo);
		setValor(valor);
		setData(data);
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

}
