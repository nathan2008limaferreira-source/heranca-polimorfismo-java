package com.mycompany.service;

import com.mycompany.model.Funcionario;

public abstract class ControleDeBonificacoes extends Funcionario {
    
    private double totalDeBonificacoes = 0;

    public ControleDeBonificacoes(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }
    
    public void registra(Funcionario f){
        double bonificacao = f.getBonificacao();
    }
    
   public void getTotalDeBonificacoes(){
      double totaldeBonificacoes = getSalario() - getBonificacao();
   }
}
