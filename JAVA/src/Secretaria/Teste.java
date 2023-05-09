package Secretaria;

public class Teste {

	public static void main(String[] args) { //Tela

		
		Aluno aluno1 = new Aluno();
		aluno1.setNome("peeeee2"); 
		Aluno cpf1 = new Aluno();
		cpf1.setCpf("111222333552");
		Aluno matricula1 = new Aluno();
		matricula1.setMatricula("01234567892");
		Aluno responsavel1 = new Aluno();
		responsavel1.setResponsavel();
		
		
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Antonio");
		Aluno cpf2 = new Aluno();
		cpf2.setCpf("11122233355");
		Aluno matricula2 = new Aluno();
		matricula2.setMatricula("0123456789");
		
		System.out.println("Nome: " + aluno1.getNome());
		System.out.println("CPF: " + cpf1.getCpf());
		System.out.println("Matrícula: " + matricula1.getMatricula());
		
		System.out.println("Nome: " + aluno2.getNome());
		System.out.println("CPF: " + cpf2.getCpf());
		System.out.println("Matrícula: " + matricula2.getMatricula());
	}

}