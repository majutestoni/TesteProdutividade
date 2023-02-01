package teste;

import java.util.ArrayList;

public class Caminhao {
	private int id;
	private double ocupacao;
	ArrayList<AdicionarProduti> produtis = new ArrayList<>();

	public Caminhao() {
		// TODO Auto-generated constructor stub
	}

	public Caminhao(int id, double ocupacao, AdicionarProduti produti) {

		setId(id);
		setOcupacao(ocupacao);
		produtis.add(produti);
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getOcupacao() {
		return ocupacao;
	}

	public void setOcupacao(double ocupacao) {
		this.ocupacao = ocupacao;
	}

	public void setProdutos(int quantidade, String nome) {
		produtis.add(new AdicionarProduti(quantidade, nome));
	}
	

}
