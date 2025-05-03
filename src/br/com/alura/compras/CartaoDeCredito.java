package br.com.alura.compras;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CartaoDeCredito {

  private double limite;
  private double saldoDisponivel;
  private List<Compra> compras = new ArrayList<>();

  public CartaoDeCredito(double limite) {
    this.limite = limite;
    this.saldoDisponivel = limite;
  }

  public void adicionarCompra(Compra compra) {
    if (compra.getValor() <= saldoDisponivel) {
      compras.add(compra);
      saldoDisponivel -= compra.getValor();
      System.out.println("Compra realizada");
    } else {
      System.out.println("Saldo insuficiente");
    }
  }

  public void exibirComprasOrdenadas() {
    Collections.sort(compras);
    System.out.println("*********************\n");
    System.out.println("COMPRAS REALIZADAS:\n");
    for (Compra c : compras) {
      System.out.println(c);
    }
    System.out.println("\n*********************");

    System.out.printf("\nSaldo do cartão: R$%.2f\n", saldoDisponivel);
  }
}
