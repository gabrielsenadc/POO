public class ContaEspecial extends Conta {
    public ContaEspecial(){
        super();
    }

    @Override
    public float getTaxa(){
        return 100.01f;
    }
}
