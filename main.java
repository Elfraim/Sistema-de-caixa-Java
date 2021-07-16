import javax.accessibility.AccessibleTableModelChange;
import javax.swing.JOptionPane;


import java.util.ArrayList;

public class main {
		public static void main(String[] args) {
		/*	1- Adicionar produtos: Cadastrar um produto, Validar de qual tipo ele é 
		 * (Quantidade ou Quilos), Adicionar pela unidade ou Quilos.

			2-Listar Produtos: Listar todos os produtos cadastrados

			3-Editar Produtos: Editar produto em uma posição especifica do ArrayList(); (BONUS, não é obrigado a fazer)

			4-Cadastrar Cliente: Cadastrar Nome e CPF do cliente.

			5-Editar Cliente: Editar Clientes em uma posição específica do
			 ArrayList() (BONUS, não é obrigado a fazer)

			6-Listar Clientes: Listar todos os clientes cadastrados.

			7-Lançar compra; Realizar fluxo atual de lançamento de compra, com clientes 
			e produtos previamente cadastrados, o usuário irá selecionar cliente e produto. 

			10 - Sair do programa - Encerrar o programa*/
	
 	    Produto produto= new Produto(null,0,0);
        Carrinho carrinho = new Carrinho();
			Caixa caixa = null;
			Cliente cliente=new Cliente(null, null);
			int opcao=0;
			int menu=0;
			boolean sair=false;
			String nomePesq;
	       ArrayList ListaClient=new ArrayList();
			/*	Essa e a parte de declaração de  variaveis3
			 ou seja tudo que vai ser usado no sistema*/
			JOptionPane.showMessageDialog(null, "Welcome to MERCADO DO SEU ZEH"
					);
			String nome; 
			double precoUnitario;
			double peso=0;

			
			while (sair==false) {
				
			
				for (boolean i = false; i !=true;) 
				{menu=Integer.parseInt(JOptionPane.showInputDialog("Escolha a opção desejada"
					+ "\n 1-Adicionar produtos"
					+ "\n 2-listar produtos "
					+ "\n 3-editar produtos "
					+ "\n 4-cadastrar cliente"
					+ "\n 5-listar cliente"
					+ "\n 6-Lançar compra"
					+ "\n 7-Sair do programa")); 
			switch (menu) {
				case 1:
					/* Parte do sistema em que e cadastrado o produto 
					Coloca se Nome e o preço e Quantidade ou kilos as variaveis recebem o mesmo */
					while ( menu==1) {
					 nome = JOptionPane.showInputDialog("Escreva o nome do produto");
					 precoUnitario = Double.parseDouble(JOptionPane.showInputDialog("Escreva o preço por unidade"));
					 
					boolean sair2=false; 
						/* Parte do sistema em que se pode sair */
					while(sair2==false) {
					 int op=0; 
					 op = Integer.parseInt(JOptionPane.showInputDialog("O produto e em Kg ou unidade?"
						+ "\n Digite 1 para quilos e 2 para unidade"));
					 /* Parte do sistema em que Se escolhe O PRODUTO em Quantidade ou em Kilos apos colocar isso se for valido o produto e cadastrado  */
					 if (op==1) {
						peso = Double.parseDouble(JOptionPane.showInputDialog("Escreva o peso total em (KG) do produto"));
						sair2=true;
					} else if(op==2) {
						peso = (int)Double.parseDouble(JOptionPane.showInputDialog("Escreva a quantidade de unidades"));
						sair2=true;
					}else {
						
						JOptionPane.showMessageDialog(null, "Infelizmente essa opção é invalida \n"	);	
					}
					} 
					produto.setNome(nome);
					
				
					produto.setPeso(peso);
					produto.setPrecoUnitario(precoUnitario);
					opcao = Integer.parseInt(JOptionPane.showInputDialog("Deseja adicionar mais um produto: 1 - Sim | 0 - Não"));
				 	/* Nessa Parte do sistema voce pode cadastrar mais produtos  digitando 1 ou escolhe sair digitando 0 */
					carrinho.colocarProdutoNoCarrinho(nome, precoUnitario, peso);
					if (opcao==0) {
				 		menu=0;
				 		JOptionPane.showMessageDialog(null, "Voce retornara ao  sistema");
						/* SE a escolha for não adicionar mais nada retorna se ao sistema */
				 	}else if(opcao !=0 &&opcao !=1){
				 		JOptionPane.showMessageDialog(null, "Infelizmente essa opção é invalida \n"	);
				 		
					} 
					}
					break;
				case 2:
					/* Parte do sistema em que se lista os produtos cadastrados*/
					JOptionPane.showMessageDialog(null,carrinho.listaDeProdutos());
					break;
				case 3:
					
					 nomePesq=JOptionPane.showInputDialog( "Qualo poduto deseja mudar:\n"	);
					
					 if(nomePesq==carrinho.listaDeProdutos()) {
						nome = JOptionPane.showInputDialog("Escreva o novo nome do produto");
						carrinho.listaDeProdutos();
						
					}else {
						JOptionPane.showMessageDialog(null," O produto não consta na lista");						
					}
					break;
				case 4:
					/* Parte do sistema em que e cadastrado o cliente 
					Coloca se Nome e o cpf e as variaveis recebem o mesmo */
			String nomeC = JOptionPane.showInputDialog("Escreva o nome do cliente");
			String cpf = JOptionPane.showInputDialog("Escreva o cpf do cliente");
			
			 cliente=new Cliente(nomeC, cpf);
			caixa = new Caixa(nomeC, cpf, carrinho);
			cliente.setNome(nomeC);
			cliente.setCpf(cpf);
	       	ListaClient.add(cliente);
			break;
				case 5:
					JOptionPane.showMessageDialog(null, ListaClient, "Resultado da compra", 1);			
					break;
				case 6:
						JOptionPane.showMessageDialog(null, caixa.dadosCompra(), "Resultado da compra", 1);
					break;
                  
				   case 7:
					int  num=Integer.parseInt(JOptionPane.showInputDialog("Você quer mesmo sair do sistema"
							+ "\n digite 1 para sim 0 para não:"));
					   if (num==1){
						i=true; 
						sair=true;
						JOptionPane.showMessageDialog(null, "Voce escolheu sair do sistema"
								);
						System.exit(1);
					} else {
						JOptionPane.showMessageDialog(null, "voce retornara ao menu"
								);
					
					}
					 
					break;
					
				  default:
					JOptionPane.showMessageDialog(null, "Infelizmente essa opção é invalida \n"
							+ "Digite o numero de uma das opções de 1 a 7 ou 10 para sair ");
					i=true; 
					
					break;
					
			}
		}}

				
				
				
				

			
			
			
		
			
		}

	}
	
