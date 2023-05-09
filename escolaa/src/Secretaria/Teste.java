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
		responsavel1.setResponsavel("Mariana0");
		Aluno email1 = new Aluno();
		email1.setEmail("karoliny.cieply@redm87i.cocorococom");
		Aluno numero1 = new Aluno();
		numero1.setNumero("(558)9999-736372");
		
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Antonio");
		Aluno cpf2 = new Aluno();
		cpf2.setCpf("11122233355");
		Aluno matricula2 = new Aluno();
		matricula2.setMatricula("0123456789");
		Aluno responsavel2 = new Aluno();
		responsavel2.setResponsavel("Joaozinho");
		Aluno email2 = new Aluno();
		email2.setEmail("karoliny.cieply@gmail.com");
		Aluno numero2 = new Aluno();
		numero2.setNumero("(47)99999-7362");
		
		System.out.println("Nome: " + aluno1.getNome());
		System.out.println("\nCPF: " + cpf1.getCpf());
		System.out.println("\nMatrícula: " + matricula1.getMatricula());
		System.out.println("\nResponsável: " + responsavel1.getResponsavel());
		System.out.println("\nEmail: " + email1.getEmail());
		System.out.println("\nNúmero: " + numero1.getNumero());
		
		System.out.println("\nNome: " + aluno2.getNome());
		System.out.println("\nCPF: " + cpf2.getCpf());
		System.out.println("\nMatrícula: " + matricula2.getMatricula());
		System.out.println("\nResponsável: " + responsavel2.getResponsavel());
		System.out.println("\nEmail: " + email2.getEmail());
		System.out.println("\nNúmero: " + numero2.getNumero());
		
	}

}
