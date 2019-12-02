package cursojava;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.constantes.StatusAluno;
import desenvolvimentoJava.classes.Aluno;
import desenvolvimentoJava.classes.Disciplina;

public class PrimeiraClasse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String login = JOptionPane.showInputDialog("Informe o Login");
		String senha = JOptionPane.showInputDialog("Informe a Senha");
		
		if(login.equalsIgnoreCase("admin") && senha.equalsIgnoreCase("admin")) {

		List<Aluno> alunos = new ArrayList<Aluno>();

		List<Aluno> alunosAprovados = new ArrayList<Aluno>();
		List<Aluno> alunosRecuperacao = new ArrayList<Aluno>();
		List<Aluno> alunosReprovados = new ArrayList<Aluno>();

		for (int qtd = 0; qtd <= 5; qtd++) {
			/* New Aluno() é uma instância (Criação de Objeto) */
			/* aluno1 é uma refêrencia para o objeto aluno */

			String nome = JOptionPane.showInputDialog("Qual o nome do aluno?" + qtd + "?");
			/*
			 * String idade = JOptionPane.showInputDialog("Qual a idade?"); String
			 * dataNascimento = JOptionPane.showInputDialog("Qual a data de nascimento?");
			 * String rg = JOptionPane.showInputDialog("Qual o número do RG?"); String cpf =
			 * JOptionPane.showInputDialog("Qual o numero do cpf?"); String nomeMae =
			 * JOptionPane.showInputDialog("Qual o nome da mãe?"); String nomePai =
			 * JOptionPane.showInputDialog("Qual o nome do pai?"); String dataMatricula =
			 * JOptionPane.showInputDialog("Qual a data da matrícula?"); String serie =
			 * JOptionPane.showInputDialog("Qual a serie matriculado?"); String escola =
			 * JOptionPane.showInputDialog("nome da escola");
			 */

			/* dados aluno */
			Aluno aluno1 = new Aluno();// Aqui será o João

			aluno1.setNome(nome);
			/*
			 * aluno1.setIdade(Integer.parseInt(idade));
			 * aluno1.setDataNascimento(dataNascimento); aluno1.setRegistroGeral(rg);
			 * aluno1.setNumeroCpf(cpf); aluno1.setNomeMae(nomeMae);
			 * aluno1.setNomePai(nomePai); aluno1.setDataMatricula(dataMatricula);
			 * aluno1.setSerieMatriculado(serie); aluno1.setNomeEscola(escola);
			 */

			for (int pos = 1; pos <= 1; pos++) {
				String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina" + pos + "?");
				String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina" + pos + "?");

				Disciplina disciplina = new Disciplina();
				disciplina.setDisciplina(nomeDisciplina);
				disciplina.setNota(Double.valueOf(notaDisciplina));

				aluno1.getDisciplinas().add(disciplina);
			}

			int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");

			if (escolha == 0) { // opçao sim e zero

				int continuarRemover = 0;
				int posicao = 1;
				while (continuarRemover == 0) {

					String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplia 1, 2, 3 ou 4");
					aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
					posicao++;
					continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a Remover?");
				}
			}
			alunos.add(aluno1);

		}
		for (Aluno aluno : alunos) {/*Separei em listas*/
			if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
				alunosAprovados.add(aluno);
			} else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
				alunosRecuperacao.add(aluno);
			} else {
				alunosReprovados.add(aluno);
			}
		}
		System.out.println("======================Lista dos Aprovados=============================");
		for (Aluno aluno : alunosAprovados) {
			System.out.println("Resultado = " + aluno.getAlunoAprovado2() + "com média de: " + aluno.getMediaNota());
		}
		
		System.out.println("======================Lista dos Reprovados=============================");
		for (Aluno aluno : alunosReprovados) {
			System.out.println("Resultado = " + aluno.getAlunoAprovado2() + "com média de: " + aluno.getMediaNota());
		}
		
		System.out.println("======================Lista dos Recuperação=============================");
		for (Aluno aluno : alunosAprovados) {
			System.out.println("Resultado = " + aluno.getAlunoAprovado2() + "com média de: " + aluno.getMediaNota());
		}
	}
	}
}
