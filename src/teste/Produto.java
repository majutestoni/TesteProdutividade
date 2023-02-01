package teste;

public class Produto {
	private int caixas;
	private double m3;

	public Produto() {
	}

	public Produto(int caixas, double m3) {
		setCaixas(caixas);
		setM3(m3);
	}


	public int getCaixas() {
		return caixas;
	}

	public void setCaixas(int caixas) {
		this.caixas = caixas;
	}

	public double getM3() {
		return m3;
	}

	public void setM3(double m3) {
		this.m3 = m3;
	}

}
