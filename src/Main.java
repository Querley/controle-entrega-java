import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Senha: ");
        String s = sc.nextLine();

        if(!s.equals("12345678")){
            System.out.println("Acesso negado");
            return;
        }

        System.out.println("Acesso liberado");
    }
}
