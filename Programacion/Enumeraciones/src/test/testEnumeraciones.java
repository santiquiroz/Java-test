package test;

import enumeracion.Continentes;
import enumeracion.Dias;

/**
 *
 * @author santi
 */
public class testEnumeraciones {
    public static void main(String[] args) {
//        System.out.println("Dia 1 = " + Dias.LUNES);
//        indicarDiaSemana(Dias.MARTES);

        System.out.println("Continente 4: "+ Continentes.AMERICA);
        System.out.println("Paises en el continente 4: "+Continentes.AMERICA.getPaises());
        
        System.out.println("Continente 1: "+ Continentes.AFRICA);
        System.out.println("Paises en el continente 1: "+Continentes.AFRICA.getPaises());
    }
    
    private static void indicarDiaSemana(Dias dias){
        switch(dias){
            case LUNES:
                System.out.println("Primer dia de la semana");
                break;
            case MARTES:
                System.out.println("Segundo dia de la semana");
                break;
    }
    }
}
