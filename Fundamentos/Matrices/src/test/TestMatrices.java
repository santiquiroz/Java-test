package test;

import domain.Persona;

/**
 *
 * @author santi
 */
public class TestMatrices {
    public static void main(String[] args) {
        int edades[][] = new int[3][2];
        System.out.println("edades = " + edades);
        
        edades[0][0] = 5;
        edades[0][1] = 7;
        edades[1][0] = 8;
        edades[1][1] = 4;
        
        System.out.println("edades 0 0 = " + edades[0][0]);
        System.out.println("edades 0 1 = " + edades[0][1]);
        
        for (int i = 0; i < edades.length; i++) {
            for (int j = 0; j < edades[i].length; j++) {
                System.out.println("edades i j = " + edades[i][j]);
            }            
        }
        
        String frutas[][] = {{"Naranja", "Limon"},{"Fresa","ZAarzamora","Mora"}};
        for (int i = 0; i < frutas.length; i++) {
            for (int j = 0; j < frutas[i].length; j++) {
                System.out.println("frutas i j = " + frutas[i][j]);
            }
        }
        imprimir(frutas);
        
        Persona personas [][] = new Persona[2][3];
        personas[0][0] = new Persona("Aleja");
        personas[0][1] = new Persona("Vivi");
        imprimir(personas);
    }
    
    public static void imprimir(Object matriz[][]){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("matriz i =" +i+ " j "+j+" = " + matriz[i][j]);
            }
        }
    }
}
