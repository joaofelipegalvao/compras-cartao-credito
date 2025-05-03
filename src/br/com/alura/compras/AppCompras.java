package br.com.alura.compras;

import java.util.Scanner;

public class AppCompras {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite o limite do cartão: ");
    double limite = scanner.nextDouble();
    scanner.nextLine();

    CartaoDeCredito cartao = new CartaoDeCredito(limite);

    int opcao = 1;
    while (opcao != 0) {
      System.out.println("Digite a descrição da compra: ");
      String descricao = scanner.nextLine();

      System.out.println("Digite o valor da compra: ");
      double valor = scanner.nextDouble();
      scanner.nextLine();

      Compra compra = new Compra(descricao, valor);
      cartao.adicionarCompra(compra);

      System.out.println("Digite 0 para sair ou 1 para continuar: ");
      opcao = scanner.nextInt();
      scanner.nextLine();
    }

    System.out.println();
    cartao.exibirComprasOrdenadas();

    scanner.close();
  }
}
