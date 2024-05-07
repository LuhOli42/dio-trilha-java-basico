import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

  double Saldo = 0.00;

  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Por favor, digite o número da conta ");
    Integer numeroConta = scanner.nextInt();
    System.out.println("Por favor, digite o número da agencia ");
    String agencia = scanner.next();
    System.out.println("Por favor, digite o nome do cliente ");
    String nomeCliente = scanner.next();
    System.out.println("Por favor, digite o seu saldo");
    double saldo = scanner.nextDouble();

    System.err.println(
      "Olá " +
      nomeCliente +
      ", obrigado por criar uma conta em nosso banco, sua agência é " +
      agencia +
      ", conta " +
      numeroConta +
      " e seu saldo " +
      saldo +
      " já está disponível para saque."
    );
  }
}
