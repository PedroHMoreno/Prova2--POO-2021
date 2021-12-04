package com.company.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cesta {


    public int OrdemEntrada;
    public int codProd;
    public String descricao;
    public double preco;
    public double precoTotal;



    public static List<Produto> listaProdutos = new ArrayList<>();
    public static List<Cesta> listaCompras = new ArrayList<>();

    public void adicionarItem(){


        Scanner input = new Scanner(System.in);

        System.out.println("ADICIONANDO ITENS AO CARRINHO: \n");

        System.out.println("Digite o ID do item escolhido: ");

        for(Produto produto : listaProdutos){
            Cesta cesta = new Cesta();
                int codEntrada = Integer.parseInt(input.nextLine());

            System.out.println("Código: " + produto.codProd);
            System.out.println("Descrição: " + produto.descricao);
            System.out.println("Preço: " + produto.preco);
            System.out.println("Fornecedor: " + produto.fornecedor);  // JÁ HERDADO
            System.out.println("--------------------------------");
                if (produto.codProd==codEntrada){
                    cesta.setDescricao(produto.descricao);
                    cesta.setPreco(produto.preco);
                    cesta.setPrecoTotal(produto.preco+precoTotal);
                    listaCompras.add(cesta);System.out.println("Cadastrado");
                }


                cesta.setCodProd(produto.getCodProd());
                cesta.setDescricao(produto.getDescricao());
                cesta.setPreco(produto.getPreco());




        }





    }

    public int getOrdemEntrada() {
        return OrdemEntrada;
    }

    public void setOrdemEntrada(int ordemEntrada) {
        this.OrdemEntrada = ordemEntrada;
    }

    public int getCodProd() {
        return codProd;
    }

    public void setCodProd(int codProd) {
        this.codProd = codProd;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPrecoTotal(){
        return preco;
    }

    public void setPrecoTotal(double preco){
        this.precoTotal = precoTotal;
    }

}

