import java.util.ArrayList;
public class Caixa {
	
	public Cliente cliente;
	private Carrinho carrinho;
	public ArrayList listaClient;
	
	public Caixa(String nomeCliente, String cpfCliente, Carrinho novoCarrinho) {
		this.cliente = new Cliente(nomeCliente, cpfCliente);
		this.carrinho = novoCarrinho;
			
		
	}
	
	
	
	
	public ArrayList getListaClient() {
		return listaClient;
	}

	private void listaClient() {
		// TODO Auto-generated method stub
		
		this.listaClient.add(cliente);
	}

	public void setListaClient(ArrayList listaClient) {
		this.listaClient = new ArrayList();
		listaClient.add(cliente);
	}









	public String dadosCompra() {
		String saida = "";
		
		saida += "Cliente: " + cliente.getNome() + "\n\n" +
				"********* Lista de compras ********* \n\n" +
				carrinho.listaDeProdutos();
		
		return saida;
	}
}