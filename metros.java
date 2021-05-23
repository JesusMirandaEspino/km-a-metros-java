import java.util.*;

public class metros{

    public static void main( String[] args ){

        Integer km;
        Integer resultado;
        final int milMetros = 1000; 

            System.out.println( "Convierta Kilometos a metros \n" );

            System.out.println( "Ingrese los kilometros a convertir \n" );
            Scanner valorkm = new Scanner(System.in); 
            km = Integer.parseInt( valorkm.nextLine() );


            resultado = km * milMetros;

            System.out.println( "El valor de " +  km  +  " KM.  Equivale a  " +  resultado  + " metros \n" );

    }

}