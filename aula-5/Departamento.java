public class Departamento {
  private String nome;
  private java.util.List<Funcionario> funcionarios;
  private Empresa empresa;

  public Departamento(String nome, Empresa empresa) {
    this.nome = nome;
    this.funcionarios = new java.util.LinkedList<Funcionario>();
    this.empresa = empresa;
  }

  public void addFuncionario(Funcionario funcionario) {
    this.funcionarios.add(funcionario);
  }

  public java.util.List<Funcionario> getFuncionarios() {
    return this.funcionarios;
  }

  public String getNome() {
    return this.nome;
  }

  public float getMediaSalarial() {
    if (this.funcionarios.size() == 0)
      return 0;
    float media = 0;
    for (Funcionario f : this.funcionarios) {
      media += f.getSalario();
    }
    return media / this.funcionarios.size();
  }

  @Override
  public String toString() {
    return this.nome;
  }

}
