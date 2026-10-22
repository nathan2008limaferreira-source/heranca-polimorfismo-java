package com.mycompany.model;

public class Programador extends Funcionario{
    
    private String linguagem;
    
    public Programador(String nome, String cpf, double salario) {
        super (nome , cpf , salario);
    }
   
    @Override
    public double getBonificacao(){
        return (getSalario() * 0.10 );
    }
    
    @Override
    public String getCargo(){
     System.out.println("Programador");
        return null;
    }
    
    @Override
     public void exibirDados(){
         super.exibirDados();
     }
    
    
    
}
