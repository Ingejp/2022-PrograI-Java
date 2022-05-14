package prograi;

public class Calculadora {
    //area de atributos
    private String tipoCalculadora;
    private int cantidadDeTeclas;
    private int anchoPantalla;
    private String color;
    private String marca;
    private int ancho;
    private int alto;
    private String[] vectorTransacciones;  //declaracion de un vector.
    private int indiceVector;


    //constructor - sirve para iniciarlizar variables y recursos de la clase
    public Calculadora(){
        this.tipoCalculadora="Calculadora Básica";
        this.cantidadDeTeclas=50;
        this.anchoPantalla=15;
        this.marca="Casio";
        vectorTransacciones= new String[10000000];//inicializo el vector
        this.indiceVector=0;
    }
    //metodos
    public double sumar(double primerNumero, double segundoNumero){
        double resultado = primerNumero+segundoNumero;
        this.registrarTransaccion("suma", primerNumero, segundoNumero, resultado);
        return resultado;
    }

    public double restar(double primerNumero, double segundoNumero){
        double resultado = primerNumero-segundoNumero;
        this.registrarTransaccion("resta", primerNumero, segundoNumero, resultado);
        return resultado;
    }

    public double dividir(double primerNumero, double segundoNumero){
        double resultado = primerNumero/segundoNumero;
        this.registrarTransaccion("dividir", primerNumero, segundoNumero, resultado);
        return primerNumero/segundoNumero;
    }

    public double multiplicar(double primerNumero, double segundoNumero){
        return primerNumero*segundoNumero;
    }

    public String getMarca() {
        return marca;
    }
    public String getTipo() {
        return this.tipoCalculadora;
    }

    public int getAnchoPantalla() {
        return anchoPantalla;
    }

    public void setAnchoPantalla(int anchoPantalla) {
        this.anchoPantalla = anchoPantalla;
    }

    public void setColor(String cualquierColor){
        this.color=cualquierColor;
    }

    public String getColor(){
        return this.color;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }    

    public void registrarTransaccion(String tipo, double primerParametro, double segundoParametro, double resultado){
        indiceVector= indiceVector+1;
        vectorTransacciones[indiceVector]= primerParametro+ " "+  tipo +" "+segundoParametro+" resultado: "+resultado;
        
    }
    public void mostrarTransacciones(){
        try{       
            for (int i=1; i<vectorTransacciones.length;i++){
                if(vectorTransacciones[i] != null){
                    System.out.println(vectorTransacciones[i]);
                }
            }
            System.out.println("\n // otra forma de recorre el vector // \n");
            for(String transaccion : vectorTransacciones){
                if(transaccion != null){
                    System.out.println(transaccion);
                }   
            } 
        }catch(Exception e){
            System.out.println(e.getMessage());       
        }
        
    }
}
