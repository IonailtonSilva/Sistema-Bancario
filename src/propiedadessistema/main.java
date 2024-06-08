package propiedadessistema;

public class main {

public static void main(String[] args){

    Cliente NovoCliente = new Cliente();
    NovoCliente.setNome("Ionailton Silva");
    
    Conta cc = new ContaCorrente(NovoCliente);
    cc.depositar(250);
    cc.sacar(150);
    Conta poupanca = new ContaPoupanca(NovoCliente);
    cc.transferir(150, poupanca);

    cc.imprimirExtrato();
    poupanca.imprimirExtrato();

}
}