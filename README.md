# 💳 Lista de Compras com Cartão de Crédito

Este projeto consiste em uma aplicação simples desenvolvida em Java, cujo objetivo é simular o controle de gastos em um cartão de crédito. O usuário informa o limite do cartão e realiza lançamentos de compras, desde que não ultrapassem o saldo disponível.

## ✨ Funcionalidades

- Definir o limite inicial do cartão de crédito.
- Adicionar compras com descrição e valor.
- Verificar se há saldo suficiente antes de realizar a compra.
- Listar todas as compras realizadas.
- Exibir as compras ordenadas por valor (da menor para a maior).
- Mostrar o saldo restante do cartão ao final.

## 💡 Lógica do Projeto

O sistema é composto por duas classes principais:

### `Compra.java`

Responsável por representar uma compra individual. Contém:

- Descrição da compra.
- Valor da compra.
- Implementação da interface `Comparable` para permitir ordenação por valor.

### `CartaoDeCredito.java`

Controla:

- Limite inicial do cartão.
- Saldo disponível.
- Lista de compras.
- Verificação de saldo antes de adicionar uma compra.
- Exibição das compras ordenadas e do saldo restante.

## 🧪 Exemplo de uso

```bash
Digite o limite do cartão: 1000
Digite a descrição da compra: sapato
Digite o valor da compra: 150
Compra realizada!

Digite 0 para sair ou 1 para continuar
1

Digite a descrição da compra: armário
Digite o valor da compra: 900
Saldo insuficiente!

COMPRAS REALIZADAS:
sapato - R$150.00

Saldo do cartão: R$850.00
```

## 📚 Conceitos aplicados

- Orientação a Objetos com Java.
- Encapsulamento com `private`.
- Construtores.
- Uso de `ArrayList` para armazenar objetos.
- Interface `Comparable` e ordenação com `Collections.sort()`.
- Sobrescrita de métodos (`toString`, `compareTo`).
- Condicionais (`if/else`) e loops (`while`).
