package diochallenge;

import java.util.Scanner;

public class Withdrawal {
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 

        double balance = scanner.nextDouble();
        double withdrawal = scanner.nextDouble();
        double limitCheck = 500;

        // TODO: Verifique se o saque não ultrapassa o saldo disponível na conta:
        if (withdrawal <= balance) {
            System.out.println("Transação realizada com sucesso.");
        } else if (withdrawal <= balance + limitCheck) {
            System.out.println("Transação realizada com sucesso utilizando o cheque especial.");
        } else {
            System.out.println("Transação não realizada. Limite do cheque especial excedido.");
        }

        scanner.close(); 
    }
}
