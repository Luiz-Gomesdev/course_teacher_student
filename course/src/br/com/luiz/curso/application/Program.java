package br.com.luiz.curso.application;

import java.util.Locale;
import java.util.Scanner;

import br.com.luiz.curso.entities.Aluno;
import br.com.luiz.curso.entities.Curso;
import br.com.luiz.curso.entities.Professor;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o nome do curso: ");
		String nome = sc.nextLine();
		
		System.out.println("Entre com o hor?rio do curso: ");
		String horario = sc.nextLine();
		
		System.out.println("Entre com o nome do professor");
		String nomeProf = sc.nextLine();
		
		System.out.println("Entre com o email do professor");
		String emailProf = sc.nextLine();
		
		System.out.println("Entre com o departamento do professor");
		String depProf = sc.nextLine();
		
		Curso curso = new Curso();
		curso.setNome(nome);
		curso.setHorario(horario);
		
		Professor professor = new Professor();
		professor.setNome(nomeProf);
		professor.setDepartamento(depProf);
		professor.setEmail(emailProf);
		
		curso.setProfessor(professor); //Tenho que setar o nome do professor
		
				
		System.out.println("==== Alunos ====");
		
		Aluno[] alunos = new Aluno[5];
		for (int i=0; i<5; i++) {
			
			sc.nextLine();
			
			System.out.println("Nome do aluno " + (i+1) + ": ");
			String nomeAluno = sc.nextLine();
			
			System.out.println("Matr?cula do aluno " + (i+1) + ": ");
			String matAluno = sc.nextLine();
			
			double[] notas = new double[4];
			for (int j=0; j<4; j++) {
				System.out.println("Nota: " + (j+1));
				notas[j] = sc.nextDouble();
			}
			
			Aluno aluno = new Aluno();
			aluno.setNome(nomeAluno);
			aluno.setMatricula(matAluno);
			aluno.setNotas(notas);
			
			alunos[i] = aluno;
		}
		
		curso.setAlunos(alunos); //Tenho que setar os nomes dos alunos
		
		System.out.println(curso.obterInfo());
		
		
		sc.close();
		
	}

}
