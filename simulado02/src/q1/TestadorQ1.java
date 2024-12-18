package q1;

/**
 * Questão 1 (4 pontos).
 * 
 * Crie classes para representar dados sobre uma empresa com suas unidades organizacionais 
 * (departamentos estruturados em setores) e seus funcionários (lotados em setores). 
 * 
 * Siga o diagrama UML fornecido (diagrama-q1.png). (O diagrama mostra alguns atributos e 
 * algumas operações, mas não é exaustivo quanto aos atributos e operações. 
 * Adicione aqueles que foram necessários.)
 * 
 * Implemente funcionalidade nas suas classes para calcular o salário médio de uma 
 * unidade organizacional, assim como para consultar os funcionários nela lotados 
 * (direta ou indiretamente).
 * 
 * Atenção às indicações de navegabilidade e às cardinalidades.
 * 
 * Sua implementação deve permitir a transferência de um funcionário para outro setor.
 * 
 * Crie um testador para suas classes. 
 * 
 */


public class TestadorQ1 {

	public static void main(String[] args) {
		Empresa cocaCola = new Empresa("Coca Cola");

		Departamento divulgacao = new Departamento("Divulgacao");
		cocaCola.addDepartamento(divulgacao);

		Setor desing = new Setor("Desing");
		divulgacao.addSetor(desing);
		Setor vendas = new Setor("Vendas");
		divulgacao.addSetor(vendas);

		Funcionario aline = new Funcionario(2000, "aline");
		Funcionario eduardo = new Funcionario(3000, "eduardo");
		Funcionario gabriel = new Funcionario(4000, "gabriel");

		aline.setSetor(vendas);
		eduardo.setSetor(desing);
		gabriel.setSetor(desing);

		System.out.println("Old:");
		System.out.println("Vendas: " + vendas.getFuncionarios() + "; Salario Medio: " + vendas.getSalarioMedio());
		System.out.println("Desing: " + desing.getFuncionarios()  + "; Salario Medio: " + desing.getSalarioMedio());

		gabriel.setSetor(vendas);

		System.out.println("New:");
		System.out.println("Vendas: " + vendas.getFuncionarios() + "; Salario Medio: " + vendas.getSalarioMedio());
		System.out.println("Desing: " + desing.getFuncionarios()  + "; Salario Medio: " + desing.getSalarioMedio());
	}

}
