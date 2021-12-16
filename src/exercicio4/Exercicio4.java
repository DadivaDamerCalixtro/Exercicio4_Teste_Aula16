/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio4;

import java.util.Scanner;

/**
 *
 * @author Notebook
 */
public class Exercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int carteira=1;
        int qmlt = 0;
        float valor = 0;
        double ttl;
        
        System.out.print("Numero da carteira: ");
        carteira = entrada.nextInt();
        
        if (carteira <3235){
            System.out.print("Digite a quantidade de multas: ");
            qmlt = entrada.nextInt();
        } else if (carteira >3235){
            System.out.println("Digite o numero da carteira valido");
        }
        for(int c=1; c<=qmlt; c++){
            System.out.print("Valor da multa(Ex: 123 ou 123,90): R$");
            valor = entrada.nextFloat();
        }
        ttl = qmlt*valor;
        System.out.println("Motorista com carteira numero "+carteira+" tem um total de "+ttl
                +" em multas para pagar.");
        System.out.print("O DETRAN arrecadou R$"+ttl);
    }
}
