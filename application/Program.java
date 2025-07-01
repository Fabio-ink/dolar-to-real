package application;

import java.util.Scanner;

import util.CurrencyConverter;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual o valor do Dolar no momento da compra: ");
        Double dolar = sc.nextDouble();
        System.out.print("Quantos Dolares você quer comprar: ");
        Double quantity = sc.nextDouble();
        System.out.printf("O valor em reais a ser pago é de: R$ %.2f%n", CurrencyConverter.converter(dolar, quantity));

        sc.close();
    }

}
