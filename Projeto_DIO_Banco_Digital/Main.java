
public class Main {
    public static void main(String[] args) {

      ContaCorrente cc = new ContaCorrente();
      ContaPoupaca poupanca = new ContaPoupaca();


      cc.depositar(100);
      cc.transferir(100, poupanca);

        System.out.println("*** Extrato  ***");
      cc.imprimirinfosComuns();
      poupanca.imprimirinfosComuns();
        System.out.println("*** Obrigador!  ***");

    }
}
