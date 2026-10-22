package com.mycompany.model;

public class Estagiario extends Funcionario{
    
    private String instituicaoDeEnsino;

    public Estagiario (String nome, String cpf, double salario, String instituicaoDeEnsino) {
        super(nome, cpf, salario);
        this.instituicaoDeEnsino = instituicaoDeEnsino;
    }

     @Override
    public double getBonificacao(){
        return (getSalario() + 200.0);
    }
    
    @Override
    public String getCargo(){
     System.out.println("Estagiario");
        return null;
    }
    
    @Override
     public void exibirDados(){
         super.exibirDados();
     }
       
}
