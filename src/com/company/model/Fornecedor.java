package com.company.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fornecedor {

    //Atributos
    private int idForn;
    private String nome;
    private String contato;
    private String fone;
    private String email;

    public static List<Fornecedor> listaFornecedores = new ArrayList<>();

    public void cadastrarFornecedor(){
        Fornecedor fornecedor = new Fornecedor();
        Scanner input = new Scanner(System.in);

        System.out.println("\nCADASTRO DE FORNECEDOR: \n");
        int tam = listaFornecedores.size();
        fornecedor.setIdForn(tam+1);
        System.out.println("Nome: ");
        fornecedor.setNome(input.nextLine());
        System.out.println("Contato: ");
        fornecedor.setContato(input.nextLine());
        System.out.println("Fone: ");
        fornecedor.setFone(input.nextLine());
        System.out.println("Email: ");
        fornecedor.setEmail(input.nextLine());
        listaFornecedores.add(fornecedor);

    }

    public void imprimirFornecedor(){
        System.out.println("\nLISTA DE FORNECEDORES: ");
        System.out.println("--------------------------------");
        for (Fornecedor fornecedor : listaFornecedores) {
            System.out.println("ID: " + fornecedor.idForn);
            System.out.println("Nome: " + fornecedor.nome);
            System.out.println("Contato: " + fornecedor.contato);
            System.out.println("Telefone: " + fornecedor.fone);
            System.out.println("Email: " + fornecedor.email);
            System.out.println("--------------------------------");



        }
    }

    public int getIdForn() {
        return idForn;
    }

    public void setIdForn(int idForn) {
        this.idForn = idForn;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
