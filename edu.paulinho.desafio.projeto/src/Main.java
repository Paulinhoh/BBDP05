import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Cliente paulo = new Cliente();
        paulo.setNome("Paulo Henrique");

        Conta cc = new ContaCorrente(paulo);
        Conta cp = new ContaPoupaca(paulo);

        cc.depositar(100);
        cc.transferir(80, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();

        Banco banco = new Banco();
        banco.setNome("Banco do Brasil");
        banco.setContas(Arrays.asList(cc, cp));
        banco.listarContas();
    }
}
