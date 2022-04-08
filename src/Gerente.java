
public class Gerente extends Funcionario {
	
	public Gerente() {
		
	}
	
	public double getBonificacaoGerente() {
		System.out.println("Você é um gerente!");
		return super.getSalario() * 0.5;
	}
}
