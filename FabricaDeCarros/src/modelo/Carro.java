package modelo;

public class Carro {

	private String modelo;
	private String cor;
	private String motor;
	private String aro;

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	public String getAro() {
		return aro;
	}

	public void setAro(String aro) {
		this.aro = aro;
	}

	public Carro() {
		setModelo(modelo);
		setCor(cor);
		setMotor(motor);
		setAro(aro);
	}

}
