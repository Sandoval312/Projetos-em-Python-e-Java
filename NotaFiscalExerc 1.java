package notaFiscal;

import java.util.Scanner;

public class NotaFiscalExerc {

	public static void main(String[] args) {
		// Faça um programa para solicitar a quantidade de Notas Fiscais que serão lançadas no Sistema.  Para cada nota, digite:
		//Código do fornecedor: (1) Empresa A        (2)  Empresa B         (3) Empresa C
		//Tipo do Produto: (1) Informática    (2 ) Eletrodomésticos    (3) Aparelho Celular
		//Quantidade de Produtos:
		//Valor Unitário do Produto: 
		//Após a entrada dos dados acima, calcule e apresente:

			//a) Total de Notas Fiscais lançadas no sistema;***
			//b) Somatória de todas as quantidades de produtos lançadas no sistema;
			//c) Somatória em Reais (R$) de todas as notas lançadas no sistema;
			//d)Quantidade de produtos de informática lançados no sistema;***
			//e)Quantidade de produtos  eletrodomésticos lançados no sistema;***
			//f)Quantidade de produtos  do tipo Celular lançados no sistema;***
			//g) Quantidade de vezes que foram lançados produtos do Fornecedor Empresa A***
			//h) Quantidade de vezes que foram lançados produtos do Fornecedor Empresa B***
			//i) Quantidade de vezes que foram lançados produtos do Fornecedor Empresa C ***
		
		
			//Instanciando Scanner
		Scanner sc = new Scanner (System.in);
		
			//Declarando variaveis
		
		int contador;
		int qtVezes;
		int empresas = 0;
		int tiProdutos = 0; 
		int qtProdutos = 0;
		double valorUnit = 0;
		double valorTotal = 0;
		int nvProduto = 0;
		int informa = 0;
		int domestico = 0;
		int celulares = 0;
		int empresA = 0;
		int empresB = 0;
		int empresC = 0;
		int qteTotal = 0;
		
		System.out.println ("Quantas notas serão lançadas hoje: ");
		qtVezes = sc.nextInt();
		
		
		for (contador = 0; contador < qtVezes; contador++) {
			
			System.out.println ("Código do fornecedor,  (1) Empresa A        (2)  Empresa B         (3) Empresa C");
			empresas = sc.nextInt();
			
			System.out.println ("Tpo do produto, (1) Informática    (2 ) Eletrodomésticos    (3) Aparelho Celular ");
			tiProdutos = sc.nextInt();
			
			
			System.out.println("Valor unitário do produto: ");
			valorUnit = sc.nextDouble();
			

			System.out.println("Quantidade de Produtos: ");
			qtProdutos = sc.nextInt();
			
			
			qteTotal = (qtProdutos + qteTotal);
			
			valorTotal =(valorUnit * valorTotal) + valorTotal;
			
			
			
			
			
			if (tiProdutos == 1) {
				informa = informa +1;
				
			}else if (tiProdutos == 2) {
				domestico = domestico +1;
			}else {
				celulares = celulares +1;
			} 
			
			if (empresas == 1 ) {
				empresA = empresA +1;
			}else if (empresas == 2) {
			    empresB = empresB +1;	
			} else {
				empresC = empresC +1;
			}
			
				
			
				
				
		}
		
		
		
		System.out.println("Qual a quantidade de notas lançadas: " + qtVezes);
		System.out.println("Quantidade total de produtos nas notas: " + qteTotal);
		System.out.println("Valor total das notas: " + valorTotal);
		System.out.println ("Quantidade de produtos de informática lançados no sistema:" + informa);
		System.out.println ("Quantidade de eletrodomésticos lançados no sistema: " + domestico);
		System.out.println ("Quantidade de aparelhos celulares lançados no sistema:" + celulares );
		System.out.println ("Quantidade de produtos de informática lançados no sistema:" + informa);
		System.out.println ("Quantidade de eletrodomésticos lançados no sistema: " + domestico);
		System.out.println ("Quantidade de vezes que foram lançados produtos do Fornecedor da Empresa A:" + empresA );
		System.out.println ("Quantidade de vezes que foram lançados produtos do Fornecedor da Empresa B:" + empresB );
		System.out.println ("Quantidade de vezes que foram lançados produtos do Fornecedor da Empresa C:" + empresC );




	}
}


