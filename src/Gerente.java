
public class Gerente extends Funcionario {
	
	public Gerente() {
		
	}
	
	public double getBonificacaoGerente() {
		System.out.println("Voc� � um gerente!");
		return super.getSalario() * 0.5;
	}
}
