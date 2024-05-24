import java.util.Scanner;

public class ContaTerminalScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();
        
        System.out.println("Digite o numero da conta:");
        float numeroConta = scanner.nextFloat();
        scanner.nextLine();
        
        System.out.println("Digite o número da agência:");
        float numeroAgencia = scanner.nextFloat();
        scanner.nextLine();

        System.out.println("Nome:" + nome);
        System.out.println("Número da conta:" + numeroConta);
        System.out.println("Número da agência:" + numeroAgencia);

        scanner.close();
    }
}