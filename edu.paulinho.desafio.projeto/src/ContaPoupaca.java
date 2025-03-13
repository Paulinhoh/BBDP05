public class ContaPoupaca extends Conta {

    public ContaPoupaca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("\n=== Extrato Conta Poupança ===");
        super.imprimirInfosComuns();
    }
}
