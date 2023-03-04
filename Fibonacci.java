import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        
        // Solicita ao usuário um número
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo: ");
        int num = input.nextInt();
        
        // Inicia as duas primeiras posições da sequência de Fibonacci
        int fib1 = 0;
        int fib2 = 1;
        
        // Verifica se o número informado está na sequência de Fibonacci
        while (fib2 < num) {
            int temp = fib1 + fib2;
            fib1 = fib2;
            fib2 = temp;
        }
        
        // Imprime a mensagem de resultado
        if (fib2 == num) {
            System.out.println(num + " pertence a sequencia de Fibonacci.");
        } else {
            System.out.println(num + " nao pertence a sequencia de Fibonacci.");
        }
        
        input.close();
    }

}
