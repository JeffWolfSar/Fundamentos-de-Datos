package com.company;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz[][],NumF,NumC;

        NumF = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de filas"));
        NumC = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de columnas"));

        matriz = new int[NumF][NumC];
        System.out.println("Ingrese la matriz");

        for (int i = 0; i < NumF; i++) {
            for (int j = 0; j < NumC; j++) {
                System.out.println("Matriz["+i+"]["+j+"]:");
                matriz[i][j]=entrada.nextInt();
            }
        }

        System.out.println("\nLa matriz ingresada es: ");
        for (int i = 0; i < NumF; i++) {
            for (int j = 0; j < NumC; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }

    }
}
