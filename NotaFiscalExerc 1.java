package notaFiscal;

import java.util.Scanner;

public class NotaFiscalExerc {

	public static void main(String[] args) {
		// Fa�a um programa para solicitar a quantidade de Notas Fiscais que ser�o lan�adas no Sistema.  Para cada nota, digite:
		//C�digo do fornecedor: (1) Empresa A        (2)  Empresa B         (3) Empresa C
		//Tipo do Produto: (1) Inform�tica    (2 ) Eletrodom�sticos    (3) Aparelho Celular
		//Quantidade de Produtos:
		//Valor Unit�rio do Produto: 
		//Ap�s a entrada dos dados acima, calcule e apresente:

			//a) Total de Notas Fiscais lan�adas no sistema;***
			//b) Somat�ria de todas as quantidades de produtos lan�adas no sistema;
			//c) Somat�ria em Reais (R$) de todas as notas lan�adas no sistema;
			//d)Quantidade de produtos de inform�tica lan�ados no sistema;***
			//e)Quantidade de produtos  eletrodom�sticos lan�ados no sistema;***
			//f)Quantidade de produtos  do tipo Celular lan�ados no sistema;***
			//g) Quantidade de vezes que foram lan�ados produtos do Fornecedor Empresa A***
			//h) Quantidade de vezes que foram lan�ados produtos do Fornecedor Empresa B***
			//i) Quantidade de vezes que foram lan�ados produtos do Fornecedor Empresa C ***
		
		
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
		
		System.out.println ("Quantas notas ser�o lan�adas hoje: ");
		qtVezes = sc.nextInt();
		
		
		for (contador = 0; contador < qtVezes; contador++) {
			
			System.out.println ("C�digo do fornecedor,  (1) Empresa A        (2)  Empresa B         (3) Empresa C");
			empresas = sc.nextInt();
			
			System.out.println ("Tpo do produto, (1) Inform�tica    (2 ) Eletrodom�sticos    (3) Aparelho Celular ");
			tiProdutos = sc.nextInt();
			
			
			System.out.println("Valor unit�rio do produto: ");
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
		
		
		
		System.out.println("Qual a quantidade de notas lan�adas: " + qtVezes);
		System.out.println("Quantidade total de produtos nas notas: " + qteTotal);
		System.out.println("Valor total das notas: " + valorTotal);
		System.out.println ("Quantidade de produtos de inform�tica lan�ados no sistema:" + informa);
		System.out.println ("Quantidade de eletrodom�sticos lan�ados no sistema: " + domestico);
		System.out.println ("Quantidade de aparelhos celulares lan�ados no sistema:" + celulares );
		System.out.println ("Quantidade de produtos de inform�tica lan�ados no sistema:" + informa);
		System.out.println ("Quantidade de eletrodom�sticos lan�ados no sistema: " + domestico);
		System.out.println ("Quantidade de vezes que foram lan�ados produtos do Fornecedor da Empresa A:" + empresA );
		System.out.println ("Quantidade de vezes que foram lan�ados produtos do Fornecedor da Empresa B:" + empresB );
		System.out.println ("Quantidade de vezes que foram lan�ados produtos do Fornecedor da Empresa C:" + empresC );




	}
}


