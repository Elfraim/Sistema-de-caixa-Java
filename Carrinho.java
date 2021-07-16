import java.util.ArrayList;
	import java.util.Iterator;

	public class Carrinho {
		
		private ArrayList produtosEscolhidos;
		private double peso = 0.0;
		private double totalPagar = 0.0;
		private double desconto = 0.0;
		
		public Carrinho() {
			produtosEscolhidos = new ArrayList();
		}
		
		public void colocarProdutoNoCarrinho(String nomeProduto, double precoProduto, double pesoProduto) {
			Produto novoProduto = new Produto(nomeProduto, precoProduto, pesoProduto);
			produtosEscolhidos.add(novoProduto);
			
			this.peso += pesoProduto;
			this.totalPagar += novoProduto.getPrecoTotal();
			
			if(this.totalPagar > 50) {
				this.totalPagar *= 0.90;
				
			}
			
		}
		
		public String listaDeProdutos() {
			Iterator achaProdutosNaLista = produtosEscolhidos.iterator();
			Produto produto;
			String saida = "";
			double total = 0.0;
			
			while(achaProdutosNaLista.hasNext()) {
				produto = (Produto)achaProdutosNaLista.next();
				saida += produto.getGastoComProduto();
				total += produto.getPrecoTotal();
				
			}
			
			saida += "\n\nPeso Total: " + this.peso;
			saida += "Preco Total: R$" + total;
			
			return saida;
		}
		
	}
