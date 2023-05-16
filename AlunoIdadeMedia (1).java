import java.util.Scanner;



public class AlunoIdadeMedia {

    public static void main(String[] args) throws Exception {
       
        // faça um programa para receber a entrada da idade e da media escolar de 20 alunos
		// apos as repectivas entradas, calcule e apresente;
		//a)total de alunos com idade > = 18anos
		//b)total de alunos com idade <18 anos
		//c)total de alunos com media >= 7
		//d) total de alunos com media <7
		//e)total de alunos com idade maior que 18 anos e media > =7
		//f) total de alunos com idade menor que 18 anos e media <7
       
        Scanner sc = new Scanner (System.in);


		//Se estiver tudo ok quero meu CD kkkk
		//declarnado variaveis 
		
		int contador;
		int idadeAluno;
		int maiorIdade = 0;
		int menorIdade = 0;
		double mediaAlunoMaior = 0;
		double mediaAlunoMenor = 0;
		double mediaAluno;
		int idadeEmedia = 0;
		int idadeEmedia2 = 0 ;
		//inicio
		
		for ( contador = 0; contador <20; contador++) {	
			System.out.println ("digite a idade: ");
			idadeAluno = sc.nextInt();
			System.out.println ("Digite a média: ");
			mediaAluno = sc.nextDouble();

			if (idadeAluno >= 18){
				maiorIdade = maiorIdade+1;

			} else {
				menorIdade = menorIdade+1;
			} if (mediaAluno >=7) {
				mediaAlunoMaior = mediaAlunoMaior+1;
			} else {
				mediaAlunoMenor = mediaAlunoMenor+1;
			} 

		if (mediaAluno >=7 && idadeAluno >=18) {
			idadeEmedia = idadeEmedia+1;
		} else if (mediaAluno < 7 && idadeAluno <18) {
			idadeEmedia2 = idadeEmedia2+1;
		}

			
    	}  
		System.out.println ("O total de alunos com idade >= 18 é:  " + maiorIdade);
		System.out.println ("O total de alunos com idade < 18 é: " + menorIdade);
		System.out.println ("O total de alunos com media >= 7 é: " + mediaAlunoMaior);
		System.out.println ("O total de alunos com media < 7 é: " + mediaAlunoMenor);
		System.out.println ("O total de alunos com idade >= 18 anos e com media >=7 é:  " + idadeEmedia);
		System.out.println ("O total de alunos com idade < 18 anos e com media <7 é:  " + idadeEmedia2);













 	}

}
