

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Senha: ");
    String s = sc.nextLine();

    if (!s.equals("12345678")) {
      System.out.println("Acesso negado");
      return;
    }

    System.out.println("Acesso liberado");

    System.out.println("\n=== MENU ===");
    System.out.println("1 - Cadastrar mercadoria");
    System.out.println("2 - Sair");

    int op = sc.nextInt();

    if (op == 1) {
      Endereco e = new Endereco();
      e.logradouro = "Rua A";
      e.complemento = "Casa";
      e.numero = "123";
      e.cep = "00000-000";
      e.cidade = "Goiania";
      e.estado = "GO";

      Mercadoria m = new Mercadoria();
      m.nome = "Teclado Gamer";
      m.preco = 200;
      m.quantidade = 1;
      m.codigo = "01";
      m.descricao = "Mecanico RGB";
      m.endereco = e;

      System.out.println("Mercadoria cadastrada: " + m.nome);
      System.out.println("Entrega em: " + e.cidade + " - " + e.estado);
    } else {
      System.out.println("Encerrando...");
    }

    sc.close();
  }
}
