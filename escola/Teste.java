package Secretaria;

import Secretaria.Aluno;
import Secretaria.Matricula;
import Secretaria.Curso;

public class Teste {

	public static void main(String[] args) { // Tela

		/** Classe para apresentar o aluno */

		/** Aluno 1 */
		Aluno aluno1 = new Aluno("N0meinv4alid0", "111222333552", "", "(558)9999-736372",
				"karoliny.cieply@redm87i.cocorococom", "ant0ni0");
		Curso curso1 = new Curso("Popixn##");
		Matricula mat1 = new Matricula("000000", aluno1, curso1);
		UnidadeCurricular uniCur1 = new UnidadeCurricular("  ", curso1);
		Avaliação ava1 = new Avaliação("rtyuigf +++;)00", uniCur1);
		Nota nota1 = new Nota(aluno1, ava1, 23);

		/** Aluno 2 */
		Aluno aluno2 = new Aluno("Joaozinho", "111.222.333-55", "Joaoa tozini", "(47)99999-7362",
				"karoliny.cieply@gmail.com", "Antonio");
		Curso curso2 = new Curso("Programacao");
		Matricula mat2 = new Matricula("S11111", aluno2, curso2);
		UnidadeCurricular uniCur2 = new UnidadeCurricular("Quimica UC", curso2);
		Avaliação ava2 = new Avaliação("Sobre propriedades", uniCur2);
		Nota nota2 = new Nota(aluno2, ava2, 9.3);

		/** Devolvendo o cadastro */
		System.out.println("\nDados do aluno 1:");
		System.out.println("\nNome 1: " + aluno1.getNome());
		System.out.println("CPF 1: " + aluno1.getCpf());
		System.out.println("Endereco 1: " + aluno1.getEndereco());
		System.out.println("Número 1: " + aluno1.getTelefone());
		System.out.println("Email 1: " + aluno1.getEmail());
		System.out.println("Responsável 1: " + aluno1.getResponsavel());
		System.out.println("Matrícula 1: " + mat1.getCodigo());
		System.out.println("Curso: " + curso1.getNomeCurso());
		System.out.println("Unidade curricular: " + uniCur1.getNomeUC());
		System.out.println("Avaliação: " + ava1.getAvaliacao());
		System.out.println("Nota: " + nota1.getNota());

		System.out.println("\nDados do aluno 2:");
		System.out.println("\nNome 2: " + aluno2.getNome());
		System.out.println("CPF 2: " + aluno2.getCpf());
		System.out.println("Endereco 2: " + aluno2.getEndereco());
		System.out.println("Número 2: " + aluno2.getTelefone());
		System.out.println("Email 2: " + aluno2.getEmail());
		System.out.println("Responsável 2: " + aluno2.getResponsavel());
		System.out.println("Matrícula 2: " + mat2.getCodigo());
		System.out.println("Curso: " + curso2.getNomeCurso());
		System.out.println("Unidade curricular: " + uniCur2.getNomeUC());
		System.out.println("Avaliação: " + ava2.getAvaliacao());
		System.out.println("Nota: " + nota2.getNota());

	}

}