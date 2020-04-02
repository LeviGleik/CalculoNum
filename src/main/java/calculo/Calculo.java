/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculo;

import java.util.Scanner;

/**
 *
 * @author levia
 */
public class Calculo {
    public static void main(String[] args) {
        double x, y, a, b, erro_min;
        int questao;
        boolean invalid = true;
        do{
            System.out.println("Qual questão deseja responder? ");
            System.out.println("Questão 1: Paraquedista");
            System.out.println("Questão 2: Tanque esférico");
            System.out.println("Questão 3: Artilharia");
            System.out.println("Questão 4: Circuito elétrico");
            System.out.println("Questão 5: Sensor");

            Scanner ler = new Scanner(System.in);
            questao = ler.nextInt();
            switch (questao) {
                case 1:
                    //                q1();
                    System.out.println("1");
                    break;
                case 2:
                    System.out.println("2");
                    break;
                case 3:
                    System.out.println("3");
                    break;
                case 4:
                    System.out.println("4");
                    break;
                case 5:
                    System.out.println("5");
                    break;
                default:
                    invalid = false;
                    break;
            }
        }while(invalid);
    }
    public static double q1(double x, double y, double a, double b, double erro_min){
        
        return 2.4;
    }
}
