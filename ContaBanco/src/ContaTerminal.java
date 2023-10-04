
import java.util.Scanner;

public class ContaTerminal {

    String agencia;
    int numero;
    String nomeCliente;
    double saldo = 1400.22;

    public ContaTerminal() {
    }

    public static void main(String[] args) {

        ContaTerminal ContaTerminal = new ContaTerminal();

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println(
                    "Seja bem vindo (a) ao Banco de Todos, por favor precisamos de algumas informações para te informar o seu saldo.");
            System.out.println("Por favor, digite o número da sua Agência:");
            ContaTerminal.agencia = scanner.next();
            System.out.println("Por favor, digite o número da sua Conta:");
            ContaTerminal.numero = scanner.nextInt();
            System.out.println("Por favor, digite o seu Nome:");
            ContaTerminal.nomeCliente = scanner.next();

        }

        System.out.println("Olá " +
                ContaTerminal.nomeCliente + ", obrigado por criar uma conta em nosso banco, a sua agência é " +
                ContaTerminal.agencia + ", e a sua conta " +
                ContaTerminal.numero + " e seu saldo disponível para saque é de R$ " +
                ContaTerminal.saldo + ".");
                System.out.println("Obrigada por utilizar os nossos canais digitais!!");
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
}