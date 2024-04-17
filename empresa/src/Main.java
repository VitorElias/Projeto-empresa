import Model.Funcionarios;
import Model.FuncionariosTercerizados;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Locale.setDefault(Locale.US);

        System.out.println("Quantos Funcionarios?");
        int qtd = sc.nextInt();

        Funcionarios[] listaFuncionarios = new Funcionarios[qtd];

        for(int c = 0; c < qtd ; c++) {

            System.out.println("É funcionario tercerizado? [S/N]");
            String t = sc.next().toLowerCase();

            System.out.println("Nome do trabalhador:");
            String nome = sc.next();

            System.out.println("Horas trabalhadas:");
            int hr = sc.nextInt();

            System.out.println("Valor por hora:");
            double valor = sc.nextDouble();


            if(t.equals("s")) {

                System.out.println("Taxa Adicional:");
                double taxa = sc.nextDouble();

                listaFuncionarios[c] = new FuncionariosTercerizados(nome,hr,valor,taxa);

            }else {

                listaFuncionarios[c] = new Funcionarios(nome,hr,valor);

            }


        }


        sc.close();

        System.out.println("==========PAGAMENTOS==========\n\n");

        for(int c = 0; c < listaFuncionarios.length; c++) {

            System.out.println((c+1)+"- "+listaFuncionarios[c].getNome()+" Salario: "+listaFuncionarios[c].Pagamentos());

        }






    }
}