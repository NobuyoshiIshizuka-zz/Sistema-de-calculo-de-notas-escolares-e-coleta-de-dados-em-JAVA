<<<<<<< HEAD
package cursojava;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import desenvolvimentoJava.classes.Aluno;
import desenvolvimentoJava.classes.Disciplina;

public class PrimeiraClasse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Aluno> alunos = new ArrayList<Aluno>();
		
		for (int qtd = 0; qtd <= 1; qtd++) {
		/* New Aluno() � uma inst�ncia (Cria��o de Objeto) */
		/* aluno1 � uma ref�rencia para o objeto aluno */

		String nome = JOptionPane.showInputDialog("Qual o nome do aluno?" +qtd +"?");
		/*String idade = JOptionPane.showInputDialog("Qual a idade?");
		String dataNascimento = JOptionPane.showInputDialog("Qual a data de nascimento?");
		String rg = JOptionPane.showInputDialog("Qual o n�mero do RG?");
		String cpf = JOptionPane.showInputDialog("Qual o numero do cpf?");
		String nomeMae = JOptionPane.showInputDialog("Qual o nome da m�e?");
		String nomePai = JOptionPane.showInputDialog("Qual o nome do pai?");
		String dataMatricula = JOptionPane.showInputDialog("Qual a data da matr�cula?");
		String serie = JOptionPane.showInputDialog("Qual a serie matriculado?");
		String escola = JOptionPane.showInputDialog("nome da escola");
		*/

		/* dados aluno */
		Aluno aluno1 = new Aluno();// Aqui ser� o Jo�o
		
		aluno1.setNome(nome);
		/*aluno1.setIdade(Integer.parseInt(idade));
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(rg);
		aluno1.setNumeroCpf(cpf);
		aluno1.setNomeMae(nomeMae);
		aluno1.setNomePai(nomePai);
		aluno1.setDataMatricula(dataMatricula);
		aluno1.setSerieMatriculado(serie);
		aluno1.setNomeEscola(escola);
		*/

		for (int pos = 1; pos <= 4; pos++) {
			String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina" +pos+"?");
			String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina" +pos+"?");
			
			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(Double.valueOf(notaDisciplina));
			
			aluno1.getDisciplinas().add(disciplina);
		}
		
		int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");
		
		if (escolha == 0) {      //op�ao sim e zero
			
			int continuarRemover = 0;
			int posicao = 1;
			while (continuarRemover == 0) {
				
			String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplia 1, 2, 3 ou 4");
			aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
			posicao ++;
			continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a Remover?");
			}
		}
		alunos.add(aluno1);
		}
		
		for (Aluno aluno1 : alunos) {
			System.out.println(aluno1.toString());/* Descri��o do objeto na memoria */
			System.out.println("M�dia do aluno = " + aluno1.getMediaNota());
			System.out.println("Resultado = " + aluno1.getAlunoAprovado2());
			System.out.println("===============================================");

		}
		
		
	
	}
}
=======
package cursojava;

import javax.swing.JOptionPane;

import desenvolvimentoJava.classes.Aluno;
import desenvolvimentoJava.classes.Disciplina;

public class PrimeiraClasse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* New Aluno() � uma inst�ncia (Cria��o de Objeto) */
		/* aluno1 � uma ref�rencia para o objeto aluno */

		String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
		/*String idade = JOptionPane.showInputDialog("Qual a idade?");
		String dataNascimento = JOptionPane.showInputDialog("Qual a data de nascimento?");
		String rg = JOptionPane.showInputDialog("Qual o n�mero do RG?");
		String cpf = JOptionPane.showInputDialog("Qual o numero do cpf?");
		String nomeMae = JOptionPane.showInputDialog("Qual o nome da m�e?");
		String nomePai = JOptionPane.showInputDialog("Qual o nome do pai?");
		String dataMatricula = JOptionPane.showInputDialog("Qual a data da matr�cula?");
		String serie = JOptionPane.showInputDialog("Qual a serie matriculado?");
		String escola = JOptionPane.showInputDialog("nome da escola");
		*/

		/* dados aluno */
		Aluno aluno1 = new Aluno();// Aqui ser� o Jo�o
		
		aluno1.setNome(nome);
		/*aluno1.setIdade(Integer.parseInt(idade));
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(rg);
		aluno1.setNumeroCpf(cpf);
		aluno1.setNomeMae(nomeMae);
		aluno1.setNomePai(nomePai);
		aluno1.setDataMatricula(dataMatricula);
		aluno1.setSerieMatriculado(serie);
		aluno1.setNomeEscola(escola);
		*/

		for (int pos = 1; pos <= 4; pos++) {
			String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina" +pos+"?");
			String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina" +pos+"?");
			
			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(Double.valueOf(notaDisciplina));
			
			aluno1.getDisciplinas().add(disciplina);
		}
		
		int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");
		
		if (escolha == 0) {      //op�ao sim e zero
			
			int continuarRemover = 0;
			int posicao = 1;
			while (continuarRemover == 0) {
				
			String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplia 1, 2, 3 ou 4");
			aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
			posicao ++;
			continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a Remover?");
			}
		}

		System.out.println(aluno1.toString());/* Descri��o do objeto na memoria */
		System.out.println("M�dia do aluno = " + aluno1.getMediaNota());
		System.out.println("Resultado = " + aluno1.getAlunoAprovado2());

	}
}
>>>>>>> 39e214ba65736a979c0b8b299f70d6dfc6d92a53
