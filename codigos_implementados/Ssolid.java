package codigos_implementados;

import java.io.*;
import java.util.Scanner;

class EntradaUsuario {
    public String obterIdEncomenda() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o ID da encomenda: ");
        return sc.nextLine();
    }

    public double obterPeso() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o peso (em kg): ");
        return sc.nextDouble();
    }
}

class CalculadoraFrete {
    public double calcular(double peso) {
        return peso * 10;
    }
}

class SalvadorArquivo {
    public void salvar(String idEncomenda, double valorFrete) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("encomendas.txt", true))) {
            bw.write("ID: " + idEncomenda + " - Frete: " + valorFrete);
            bw.newLine();
            System.out.println("Salvo no arquivo encomendas.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

public class ProcessadorEncomendas {
    private final EntradaUsuario entradaUsuario = new EntradaUsuario();
    private final CalculadoraFrete calculadoraFrete = new CalculadoraFrete();
    private final SalvadorArquivo salvadorArquivo = new SalvadorArquivo();

    public void processar() {
        try {
            String idEncomenda = entradaUsuario.obterIdEncomenda();
            double peso = entradaUsuario.obterPeso();

            double valorFrete = calculadoraFrete.calcular(peso);
            System.out.println("Valor do frete calculado: " + valorFrete);

            salvadorArquivo.salvar(idEncomenda, valorFrete);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
