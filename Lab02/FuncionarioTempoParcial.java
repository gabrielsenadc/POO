public class FuncionarioTempoParcial extends Funcionario {
  private int horas;

  public FuncionarioTempoParcial(String nome, float salario, Departamento dpt) {
    super(nome, salario, dpt);
    this.horas = 0;
  }

  public void setNumeroHorasSemanais(int numeroHorasSemanais) {
    this.horas = numeroHorasSemanais;
  }
}