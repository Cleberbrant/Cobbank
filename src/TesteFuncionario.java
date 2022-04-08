
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario cleber = new Funcionario();
		cleber.setCpf("12341234");
		cleber.setNome("Cleber");
		cleber.setSalario(100000);
		System.out.println(cleber.getSalario());
		System.out.println(cleber.getBonificacao());
		
		Gerente dolly = new Gerente();
		dolly.setSalario(1000);
		System.out.println(dolly.getBonificacaoGerente());
		
	}
}
