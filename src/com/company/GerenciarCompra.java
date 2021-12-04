package com.company;

import com.company.model.Cesta;
import com.company.model.Fornecedor;
import com.company.model.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciarCompra {
    public static List<Produto> listaProdutos = new ArrayList<>();
    public static List<Cesta> listaCompras = new ArrayList<>();

    public static void main(String[] args) {

        GerenciarCompra gc = new GerenciarCompra();
        Scanner input = new Scanner(System.in);

        int opc = 0;
        do{
            System.out.println("\n    Menu Principal");
            System.out.println("=======================");
            System.out.println("1. Cadastrar Fornecedor");
            System.out.println("2. Cadastrar Produto");
            System.out.println("3. Listar Fornecedores");
            System.out.println("4. Listar Produtos");
            System.out.println("5. Abrir Carrinho");
            System.out.println("6. Fechar Carrinho");
            System.out.println("9. Sair");
            System.out.println("=======================");
            System.out.println("   Digite sua opção: \n");
            opc = Integer.parseInt(input.nextLine());

            switch(opc){
                case 1:
                    gc.cadastrarFornecedor();
                    break;
                case 2:
                    gc.cadastrarProduto();
                    break;
                case 3:
                    gc.listarFornecedores();
                    break;
                case 4:
                    gc.listarProdutos();
                    break;
                case 5:
                    gc.abrirCesta();
                    break;
                case 6:
                    gc.fecharCesta();
                    break;
                case 9:
                    System.out.println("====================");
                    System.out.println("PROGRAMA FINALIZADO");
                    System.out.println("====================");
                    break;
                default:
                    System.out.println("===============");
                    System.out.println("OPÇÃO INVÁLIDA");
                    System.out.println("===============");
            }
        }while(opc != 9);
    }

    private void listarProdutos() {
        Produto produto = new Produto();
        produto.imprimirProdutos();

    }

    private void listarFornecedores() {
        Fornecedor fornecedor = new Fornecedor();
        fornecedor.imprimirFornecedor();
    }

    private void fecharCesta() {
        Cesta cesta = new Cesta();
        cesta.adicionarItem();
    }

    private void abrirCesta() {


    }

    private void cadastrarFornecedor() {
        Fornecedor fornecedor = new Fornecedor();
        fornecedor.cadastrarFornecedor();
    }

    private void cadastrarProduto() {
        Produto produto = new Produto();
        produto.cadastrarProduto();
    }

}

