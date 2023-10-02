/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadoresaritteste;

import static java.lang.System.exit;
import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class OperadoresAritteste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ent = new Scanner (System.in);
        int nota1, nota2 , nota3;
        int media,i,contAluno=0;
        
        for (i=0 ; i<3; i++) {
        contAluno++;
        System.out.print("Aluno " + contAluno + "digite a sua 1° nota:");
        nota1 = (int) ent.nextFloat();
        
        System.out.print("Aluno " + contAluno + "digite a sua 2° nota:");
        nota2 = (int) ent.nextFloat();
        
        System.out.print("Aluno " + contAluno + "digite a sua 3° nota:");
        nota3 = (int) ent.nextFloat();
        
        media = (nota1 + nota2 + nota3)/3;
            System.out.println("A media do aluno " + contAluno + " e " + media);
        
        if ( (media <=0) && (media <4) ){
            System.out.println("nota E");
        } else if (media <5){
            System.out.println("nota D");
        }else if (media<7){
            System.out.println("nota C");
        }else if (media <8){
            System.out.println("nota B");
        }else if (media <=10){
            System.out.println("nota A");
        }
        exit(0);
        
        
        
    }
  } 
}
