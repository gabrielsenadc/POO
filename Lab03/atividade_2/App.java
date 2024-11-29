public class App {
    public static void main(String[] args) {
        Conta conta1 = new Conta();
        Conta conta2 = new ContaEspecial();

        conta1.deposito(1000f);
        conta2.deposito(1000f);

        conta1.saque(100f);
        conta2.saque(100f);

        System.out.printf("Saldo da conta1: %.2f\nSaldo da conta2: %.2f\n", conta1.getSaldo(), conta2.getSaldo());
    }
}
