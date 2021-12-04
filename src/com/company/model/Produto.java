package com.company.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Produto extends Fornecedor {

        public int codProd;
        public String descricao;
        public double preco;
        public String fornecedor;   // JÁ HERDADO

        public static List<Fornecedor> listaFornecedores = new ArrayList<>();
        public static List<Produto> listaProdutos = new ArrayList<>();

        // Métodos

        public void cadastrarProduto(){
            Produto produto = new Produto();
            Scanner input = new Scanner(System.in);

            System.out.println("\nCADASTRO DE PRODUTOS: \n");
            int tam = listaProdutos.size();
            produto.setCodProd(tam+1);
            System.out.println("Descricao: ");
            produto.setDescricao(input.nextLine());
            System.out.println("Preco: ");
            produto.setPreco(Double.parseDouble(input.nextLine()));
            System.out.println("ID Fornecedor: ");
            produto.setFornecedor(input.nextLine());
            listaProdutos.add(produto);

            }



        public void imprimirProdutos(){
            System.out.println("\nLISTA DE PRODUTOS: ");
            System.out.println("--------------------------------");
            for(Produto produto : listaProdutos) {
                System.out.println("Código: " + produto.codProd);
                System.out.println("Descrição: " + produto.descricao);
                System.out.println("Preço: " + produto.preco);
                System.out.println("Fornecedor: " + produto.fornecedor);  // JÁ HERDADO
                System.out.println("--------------------------------");
            }
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

        public String getFornecedor() {                     // JÁ HERDADO
            return fornecedor;
        }

        public void setFornecedor(String fornecedor) {      // JÁ HERDADO
            this.fornecedor = fornecedor;
        }


    }