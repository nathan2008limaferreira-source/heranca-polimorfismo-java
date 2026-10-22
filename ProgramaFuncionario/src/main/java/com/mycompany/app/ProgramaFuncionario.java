package com.mycompany.app;

import com.mycompany.model.*;
import com.mycompany.service.ControleDeBonificacoes;
import java.util.Scanner;

public class ProgramaFuncionario {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("PROGRAMADOR");
        System.out.println("Digite seu NOME: ");
        String nomep = in.nextLine();
        System.out.println("Digite seu CPF: ");
        String cpfp = in.nextLine();
        System.out.println("Digite seu SALARIO: ");
        double salariop = in.nextDouble();
        
        System.out.println("ESTAGIARIO");
        System.out.println("Digite seu NOME: ");
        String nomee = in.nextLine();
        System.out.println("Digite seu CPF: ");
        String cpfe= in.nextLine();
        System.out.println("Digite seu SALARIO: ");
        double salarioe = in.nextDouble();
        System.out.println("Digite sua instituição de ensino: ");
        String instens = in.nextLine();
        
        System.out.println("GERENTE");
        System.out.println("Digite seu NOME: ");
        String nomeg = in.nextLine();
        System.out.println("Digite seu CPF: ");
        String cpfg = in.nextLine();
        System.out.println("Digite seu SALARIO: ");
        double salariog = in.nextDouble();
        System.out.println("Digite sua SENHA: ");
        String senhag = in.nextLine();
        
        
        
        System.out.println("DIRETOR");
        System.out.println("Digite seu NOME: ");
        String nomed = in.nextLine();
        System.out.println("Digite seu CPF: ");
        String cpfd= in.nextLine();
        System.out.println("Digite seu SALARIO: ");
        double salariod = in.nextDouble();
        System.out.println("Digite sua SENHA: ");
        String senhad = in.nextLine();
        
   }
}
