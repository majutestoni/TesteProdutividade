package teste;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Produto papelHigienico = new Produto(741, 0.01);
		Produto Detergente = new Produto(890, 0.025);
		Produto Luva = new Produto(6000, 0.0125);
		ArrayList<Caminhao> caminhaos = new ArrayList<>();

		int id = 0;
		int tamanho = papelHigienico.getCaixas() + Detergente.getCaixas() + Luva.getCaixas();

		for (int i = 0; i <= tamanho; i++) {

			// Luva
			double contador3 = 0;
			boolean contou = false;
			for (int j = 0; j < Luva.getCaixas(); j++) {
				contador3 += Luva.getM3();
				if (contador3 > 40 && contador3 < 50) {
					if (caminhaos.get(id).getOcupacao() >= 50 || caminhaos.get(id) == null) {

						Caminhao caminhao = new Caminhao(id, contador3, new AdicionarProduti(j, "Luva"));
						caminhaos.add(caminhao);
						id++;
					} else {
						caminhaos.get(id).setProdutos(j, "Luva");
					}

				}
				if (!contou) {
					if (caminhaos.get(id).getOcupacao() >= 50 || caminhaos.get(id) == null) {
						id++;
						Caminhao caminhao = new Caminhao(id, contador3, new AdicionarProduti(Luva.getCaixas(), "Luva"));
					} else {
						caminhaos.get(id).setProdutos(Luva.getCaixas(), "Luva");
					}
				}
			}

			// papel higienico
			double contador = 0;
			contou = false;
			for (int j = 0; j <= papelHigienico.getCaixas(); j++) {
				contador += papelHigienico.getM3();
				if (contador > 40 && contador < 50) {
					if (caminhaos.get(id).getOcupacao() >= 50 || caminhaos.get(id) == null) {
						id++;
						Caminhao caminhao = new Caminhao(id, contador, new AdicionarProduti(j, "papel higienico"));
						caminhaos.add(caminhao);
					} else {
						caminhaos.get(id).setProdutos(i, "papel higienico");
					}
					contou = true;
					contador = 0;
				}
			}

			if (!contou) {
				if (caminhaos.get(id).getOcupacao() >= 50 || caminhaos.get(id) == null) {
					id++;
					Caminhao caminhao = new Caminhao(id, contador,
							new AdicionarProduti(papelHigienico.getCaixas(), "papel higienico"));
					caminhaos.add(caminhao);
				} else {
					caminhaos.get(id).setProdutos(papelHigienico.getCaixas(), "papel higienico");
				}
			}

			// detergente
			double contador2 = 0;
			contou = false;
			for (int j = 0; j < Detergente.getCaixas(); j++) {
				contador2 += Detergente.getM3();
				if (contador2 > 40 && contador2 < 50) {
					if (caminhaos.get(id).getOcupacao() >= 50 || caminhaos.get(id) == null) {
						id++;
						Caminhao caminhao = new Caminhao(id, contador2, new AdicionarProduti(j, "detergente"));
						caminhaos.add(caminhao);
					} else {
						caminhaos.get(id).setProdutos(i, "detergente");
					}
					contou = true;
					contador = 0;
				}
			}

			if (!contou) {
				if (caminhaos.get(id).getOcupacao() >= 50 || caminhaos.get(id) == null) {
					id++;
					Caminhao caminhao = new Caminhao(id, contador2,
							new AdicionarProduti(Detergente.getCaixas(), "detergente"));
					caminhaos.add(caminhao);
				} else {
					caminhaos.get(id).setProdutos(Detergente.getCaixas(), "detergente");
				}
			}

		}

		for (Caminhao caminhao2 : caminhaos) {
			System.out.println("Caminhao " + caminhao2.getId());
			System.out.println("ocupação " + caminhao2.getOcupacao());
			for (AdicionarProduti produti : caminhao2.produtis) {
				System.out.println("nome do produto " + produti.nome);
				System.out.println("quantidade " + produti.quantidade);

			}

		}

	}

}
