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
        System.out.println("Q1: " + q1());
//        do{
//            System.out.println("Questão 1: Paraquedista");
//            System.out.println("Questão 2: Tanque esférico");
//            System.out.println("Questão 3: Artilharia");
//            System.out.println("Questão 4: Circuito elétrico");
//            System.out.println("Questão 5: Sensor");
//            System.out.println("Qual questão deseja responder?");
//            
//            Scanner ler = new Scanner(System.in);
//            questao = ler.nextInt();
//            switch (questao) {
//                case 1:
//                    System.out.println(q1());
//                    break;
//                case 2:
//                    System.out.println("2");
//                    break;
//                case 3:
//                    System.out.println("3");
//                    break;
//                case 4:
//                    System.out.println("4");
//                    break;
//                case 5:
//                    System.out.println("5");
//                    break;
//                default:
//                    invalid = false;
//                    break;
//            }
//        }while(invalid);
    }
    public static double q1(){
        double a, a0 = 40, fa, b, b0 = 90, fb, x, x0 = 65, y, erro = 1;
        int i = 0;
        a = a0;
        b = b0;
        do{           
            fa = (a - a * Math.pow(Math.E, (-135/a)) - 53.03);
            fb = (b - b * Math.pow(Math.E, (-135/b)) - 53.03);
            y = (x0 - x0 * Math.pow(Math.E, (-135/x0)) - 53.03);
            a = ((fa >= 0 && y >= 0) || (fa < 0 && y < 0)) ? x0 : a;
            b = ((fb >= 0 && y >= 0) || (fb < 0 && y < 0)) ? x0 : b;
            x = (a + b) / 2;
            erro = Math.abs(x - x0);
            x0 = x;
	}while(erro > 0.1);
        return x;
    }
    public static double q2(){
        return 2.4;
    }
}
