/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import static aritmetica.Aritmetica.division;
import excepciones.OperacionExcepcion;

/**
 *
 * @author santi
 */
public class TestExcepciones {

    public static void main(String[] args) {
        int resultado = 0;
        try {
            resultado = division(1, 0);
        }catch (OperacionExcepcion e){
            System.out.println("Ocurrio error operacionException");
        } catch (Exception e) {
            //e.printStackTrace(System.out);
             System.out.println("Ocurrio error Exception");
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Se realizo la division");
        }
        System.out.println("resultado = " + resultado);
    }
}
