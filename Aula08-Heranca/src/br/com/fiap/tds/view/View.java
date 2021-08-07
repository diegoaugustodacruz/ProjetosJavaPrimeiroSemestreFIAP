package br.com.fiap.tds.view;

import javax.swing.JOptionPane;

import br.com.fiap.tds.bean.Aluno;
import br.com.fiap.tds.bean.Curso;
import br.com.fiap.tds.bean.Pessoa;
import br.com.fiap.tds.bean.Professor;

public class View {
	
	public static void main(String[] args) {
		
		//Instanciar uma pessoa
		Pessoa pessoa = new Pessoa("Luiz", "123.123.123-84");
		
		//Instanciar um aluno		
		Aluno aluno = new Aluno();		
		
		//Instanciar um professor
		Professor prof = new Professor();
		
		//ler as informações do aluno
		String nome = JOptionPane.showInputDialog("Digite o nome do aluno: ");
		String cpf = JOptionPane.showInputDialog("Digite o CPF: ");
		int matricula = Integer.parseInt(JOptionPane.showInputDialog("Digite a matricula: "));
		String nomeCurso = JOptionPane.showInputDialog("Digite o nome do curso: ");
		int cargaHoraria = Integer.parseInt(JOptionPane.showInputDialog("Digite a carga horaria: "));

		
		//Curso curso = new Curso(nomeCurso, cargaHoraria);
		
		//Instanciar um Aluno
		
		Aluno aluno2 = new Aluno(nome, cpf, matricula, new Curso(nomeCurso, cargaHoraria));
		
		
		
		//Exibir a assinatura de e-mail e o cpf formatado
		JOptionPane.showConfirmDialog(null, "Assinatura: " + aluno2.gerarAssinatura());
		JOptionPane.showConfirmDialog(null, "CPF: " + aluno2.formatarCpf());
		
		
		//Exibir nome do curso e carga horaria (utilizando o objeto aluno2)
		JOptionPane.showMessageDialog(null, "Curso: " + aluno2.getCurso().getNome());
		JOptionPane.showMessageDialog(null, "Curso: " + aluno2.getCurso().getCargaHoraria());

		
	}

}
