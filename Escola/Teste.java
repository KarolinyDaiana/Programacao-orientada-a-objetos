package Secretaria;

import Secretaria.Aluno;
import Secretaria.Matricula;
import Secretaria.Curso;

public class Teste {

	public static void main(String[] args) { //Tela

		/**Classe para apresentar o aluno */
		
		/**Aluno 1*/
		Aluno aluno1 = new Aluno("N0meinv4alid0", "111222333552", "" ,"(558)9999-736372", "karoliny.cieply@redm87i.cocorococom","ant0ni0");
		Matricula mat1 = new Matricula("000000", "Pgh", aluno1.getNome());
		Curso curso1 = new Curso("Popixn##");
		
		/**Aluno 2*/
		Aluno aluno2 = new Aluno("Joaozinho", "11122233355", "Joaoa tozini" ,"(47)99999-7362", "karoliny.cieply@gmail.com","Antonio");
		Matricula mat2 = new Matricula("11111", "Programacao", aluno2.getNome());
		Curso curso2 = new Curso("Programacao de sistemas");
		
		/**Devolvendo o cadastro*/
		System.out.println("Nome 1: " + aluno1.getNome());
		System.out.println("\nCPF 1: " + aluno1.getCpf());
		System.out.println("\nEndereco 1: " + aluno1.getEndereco());
		System.out.println("\nNúmero 1: " + aluno1.getNumero());
		System.out.println("\nEmail 1: " + aluno1.getEmail());
		System.out.println("\nResponsável 1: " + aluno1.getResponsavel());
		System.out.println("\nMatrícula 1: " + mat1.getMatricula());
		System.out.println("\nCurso: " + curso1.getCurso());
		
		System.out.println("Nome 2: " + aluno2.getNome());
		System.out.println("\nCPF 2: " + aluno2.getCpf());
		System.out.println("\nEndereco 2: " + aluno2.getEndereco());
		System.out.println("\nNúmero 2: " + aluno2.getNumero());
		System.out.println("\nEmail 2: " + aluno2.getEmail());
		System.out.println("\nResponsável 2: " + aluno2.getResponsavel());
		System.out.println("\nMatrícula 2: " + mat2.getMatricula());
		System.out.println("\nCurso: " + curso1.getCurso());
		
	}

}
