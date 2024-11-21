public class Empresa {

  private String nome;
  private java.util.List<Departamento> departamentos;

  public Empresa(String nome) {
    this.nome = nome;
    this.departamentos = new java.util.LinkedList<Departamento>();
  }

  public void addDepartamento(Departamento departamento) {
    this.departamentos.add(departamento);
  }

  public java.util.List<Departamento> getDepartamentos() {
    return this.departamentos;
  }

  @Override
  public String toString() {
    return this.nome;
  }

}