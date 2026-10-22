package com.mycompany.model;

public class Diretor extends Gerente{

    public Diretor(String nome, String cpf, double salario, int senha) {
        super(nome, cpf, salario, senha);
    }
    
    @Override
    public double getBonificacao(){
        super.getBonificacao();
                return getBonificacao() + 1000;
    }
    
    @Override
    public String getCargo(){
     System.out.println("Diretor");
        return null;
    }
    
    
}
