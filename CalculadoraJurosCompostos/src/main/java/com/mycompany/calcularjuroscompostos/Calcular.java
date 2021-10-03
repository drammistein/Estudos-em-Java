package com.mycompany.calcularjuroscompostos;

/**
 *
 * @author daniel
 */
import java.util.Scanner;

public class Calcular {
    
    public static void main(String[] args) {
            
        double montanteanual = 0;
        double montantemensal = 0;        
              
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("*******Escolha sua opção para calcular os juros:*******");
        System.out.println("*              1 - Valor Anual                        *");
        System.out.println("*              2 - Valor Mensal                       *");
        System.out.println("*******************************************************");
        
        int opc = entrada.nextInt();       
        
        System.out.println();
        
        //declara as strings pra receber o resultado
        //String dinheiro, juros, tempo, montante;

        //recebe o tempo a investir, o dinheiro e o juros
        //tempo = ("Digite o tempo em meses");
        //dinheiro = ("Digite o dinheiro a investir: ");
        //juros = ("Digite a taxa de juros por mes");

        
        //transforma a variavel de string em ponto flutuante e depois transforma em porcentagem
        //mes = Integer.parseInt (tempo);
        //juros1 = Double.parseDouble (juros);
        //juros1 = juros1/100;
        //dinheiro1 = Double.parseDouble (dinheiro);
        //montante = Double.parseDouble(montante1);
        
        //Formula calculo mensal
        // taxa mensal = ((1 + tx anual)¹/12) -1
        //depois -> resultado * 100
        
              if(opc == 1 ) { //opção para Anual
                  
                   System.out.println("-> Digite o valor inicial para investir:");
                    double dinheiro = entrada.nextDouble();
                   
                   System.out.println("-> Digite o tempo de inventimento:");
                    int a = entrada.nextInt();
        
                   System.out.println("-> Digite a taxa de juros anual:");
                    double juros = entrada.nextDouble();
                 
                        System.out.println("");
                        
                   System.out.printf("%s%20s %n", "Ano", "Quantia Final");

                    //faz o laço calculando o valor
                   for (int ano = 1; ano <= a; ++ano){
                      montanteanual = dinheiro * Math.pow(1.0 + juros/100, ano);
           
                      //exibe o resultado
                      System.out.printf("%4d%,20.2f%n", ano, montanteanual);

                 } 
               }
        
              if(opc == 2 ) { //opção para Mensal
                  
                   System.out.println("-> Digite o valor inicial para investir:");
                    double dinheiro = entrada.nextDouble();
                   
                   System.out.println("-> Digite o tempo de inventimento em meses:");
                    int m = entrada.nextInt();
                
                   System.out.println("-> Digite a taxa de juros anual:");
                    double juros = entrada.nextDouble();
                    
                   System.out.printf("%s%22s %n", "Mes", "Quantia Final");
                
                 //faz o laço calculando o valor
                   for (int mes = 1; mes <= m; ++mes){
                     
                    double e = (1.0 + juros/100);
                    double taxamensal = (Math.pow(e, 0.083)-1);
                 
                 
                    montantemensal = dinheiro * Math.pow(1.0 + taxamensal, mes);           
          
                 //exibe o resultado
                    System.out.printf("%4d%,20.2f%n", mes, montantemensal);
                    
                 }
              }
    }
}


