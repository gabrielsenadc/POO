public class Conta {
    private float quantia;

    public Conta() {
        this.quantia = 0;
    }

    public float getSaldo(){
        return this.quantia;
    }

    public void deposito(float quantia){
        this.quantia += quantia;
    }

    public void saque(float quantia){
        if((quantia * (this.getTaxa() / 100)) > this.quantia){
            System.out.println("Nao foi possivel realizar o saque");
            return;
        }
        this.quantia -= (quantia * (this.getTaxa()) / 100);
    }

    public float getTaxa(){
        return 100.05f;
    }

    
}
