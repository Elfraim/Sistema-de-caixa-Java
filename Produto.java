import java.text.DecimalFormat; 


public class Produto {
	
	private String nome;
	private double precoTotal;
	private double peso;
	private double precoUnitario;
	
	public Produto(String nome, double precoUnitario, double peso) {
		this.nome = nome;
		this.peso = peso;
		this.precoUnitario = precoUnitario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPrecoTotal() {
		this.precoTotal = this.peso*this.precoUnitario;
		return precoTotal;
	}

	public void setPrecoTotal(double precoTotal) {
		this.precoTotal = precoTotal;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if(peso < 0) {
			this.peso = 1.0;
		} else {
			this.peso = peso;
		}
	}

	public double getPrecoUnitario() {
		return precoUnitario;
	}

	public void setPrecoUnitario(double precoUnitario) {
		if(precoUnitario < 0) {
			this.precoUnitario = 1.0;
		} else {
			this.precoUnitario = precoUnitario;
		}
	}
	
	public String getGastoComProduto() {
		DecimalFormat duascasas = new DecimalFormat("0.00");
		return "Produto: " + this.nome + " " +
				" Preço Unitário: R$" + duascasas.format(this.precoUnitario) + " / KG " +
				"Peso: " + duascasas.format(this.peso) + " KG " +
				"Total: R$" + duascasas.format(getPrecoTotal()) + " \n";
	}
	
}


