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
		String idade = JOptionPane.showInputDialog("Qual a idade?");
		String dataNascimento = JOptionPane.showInputDialog("Qual a data de nascimento?");
		String rg = JOptionPane.showInputDialog("Qual o n�mero do RG?");
		String cpf = JOptionPane.showInputDialog("Qual o numero do cpf?");
		String nomeMae = JOptionPane.showInputDialog("Qual o nome da m�e?");
		String nomePai = JOptionPane.showInputDialog("Qual o nome do pai?");
		String dataMatricula = JOptionPane.showInputDialog("Qual a data da matr�cula?");
		String serie = JOptionPane.showInputDialog("Qual a serie matriculado?");
		String nomeEscola = JOptionPane.showInputDialog("nome da escola");

		/* dados aluno */
		Aluno aluno1 = new Aluno();// Aqui ser� o Jo�o
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.parseInt(idade));
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(rg);
		aluno1.setNumeroCpf(cpf);
		aluno1.setNomeMae(nomeMae);
		aluno1.setNomePai(nomePai);
		aluno1.setDataMatricula(dataMatricula);
		aluno1.setSerieMatriculado(serie);
		aluno1.setNomeEscola(nomeEscola);

		Disciplina disciplina1 = new Disciplina();
		disciplina1.setDisciplina("Banco de dados");
		disciplina1.setNota(90);

		aluno1.getDisciplinas().add(disciplina1);

		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Matematica");
		disciplina2.setNota(80);

		aluno1.getDisciplinas().add(disciplina2);

		Disciplina disciplina3 = new Disciplina();
		disciplina3.setDisciplina("Geografia");
		disciplina3.setNota(97);

		aluno1.getDisciplinas().add(disciplina3);

		Disciplina disciplina4 = new Disciplina();
		disciplina4.setDisciplina("Java Web");
		disciplina4.setNota(70);

		aluno1.getDisciplinas().add(disciplina4);

		System.out.println(aluno1.toString());/* Descri��o do objeto na memoria */
		System.out.println("M�dia do aluno = " + aluno1.getMediaNota());
		System.out.println("Resultado = " + aluno1.getAlunoAprovado2());

	}
}
