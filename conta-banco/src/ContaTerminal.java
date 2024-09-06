import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception{

        //TODO: Conhecer e importar a classe Scanner

        //Exibir as mensagens para nosso usuario
        //Obter pela scanner os valores digitados pelo terminal


        Scanner scAg = new Scanner(System.in);
        System.out.println("Por favor, digite o número da Agência !");
        String agencia = scAg.nextLine();

        Scanner scNumConta = new Scanner(System.in);
        System.out.println("Por favor, digite o número da conta !");
        int numero = scNumConta.nextInt();

        Scanner scNomeCli = new Scanner(System.in);
        System.out.println("Por favor, digite o nome do cliente !");
        String nomeDoCliente = scNomeCli.nextLine();

        Scanner scSaldo = new Scanner(System.in);
        System.out.println("Por favor, digite o saldo !");
        float saldo = scSaldo.nextFloat();

        //Exibir a mensagem conta criada

        System.out.println("Olá " + nomeDoCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");

    }


}
