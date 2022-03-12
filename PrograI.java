package prograi;
public class PrograI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hola munda con Java");

        Calculadora calculadora1=new Calculadora();
        System.out.println(calculadora1.sumar(5, 10));

        Calculadora otraCalculadora = new Calculadora();
        System.out.println(otraCalculadora.sumar(8, 9));
        System.out.println(otraCalculadora.restar(10, 3));
        System.out.println(otraCalculadora.multiplicar(5, 3));
        System.out.println(otraCalculadora.getMarca());
        System.out.println(otraCalculadora.getTipo());


    }
}
