package prograi;

import java.util.Scanner;

public class PrograI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hola munda con Java");

        Calculadora calculadora1=new Calculadora();
        //System.out.println(calculadora1.sumar(5, 10));

        Calculadora otraCalculadora = new Calculadora();
        
        /*System.out.println(otraCalculadora.sumar(8, 9));
        System.out.println(otraCalculadora.restar(10, 3));
        System.out.println(otraCalculadora.multiplicar(5, 3));*/
        //System.out.println(otraCalculadora.getMarca());
        //System.out.println(otraCalculadora.getTipo());
        //System.out.println(otraCalculadora.getAnchoPantalla());
        //Scanner sc= new Scanner(System.in);
       // System.out.println("Ingrese el color de la calculadora");
        //String valorRecibido = sc.nextLine();

        /*otraCalculadora.setColor(valorRecibido);
        System.out.println("El color de la calculadora es: " + otraCalculadora.getColor());
        otraCalculadora.setColor("Azul");
        System.out.println("El color de la calculadora es: " + otraCalculadora.getColor());*/

        CalculadoraEspecial calculadoraNueva = new CalculadoraEspecial();
        System.out.println(calculadoraNueva.getTipoCalculadora());

        CalculadoraEspecial calculadora4 = new CalculadoraEspecial("Calculadora del mundo de a 3");
        System.out.println(calculadora4.getTipoCalculadora());
        
        CalculadoraEspecial calculadora5 = new CalculadoraEspecial("Calculadora del Bazar Chino", 100);
        System.out.println(calculadora5.getTipoCalculadora() + " con " + calculadora5.getNumeroDeTeclas()+ " teclas");



    }
}
