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


    //constructor - sirve para iniciarlizar variables y recursos de la clase
    public Calculadora(){
        this.tipoCalculadora="Calculadora Básica";
        this.cantidadDeTeclas=50;
        this.anchoPantalla=15;
        this.marca="Casio";
    }
    //metodos
    public double sumar(double primerNumero, double segundoNumero){
        return primerNumero+segundoNumero;
    }

    public double restar(double primerNumero, double segundoNumero){
        return primerNumero-segundoNumero;
    }

    public double dividir(double primerNumero, double segundoNumero){
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

    public void setMarca(String marca) {
        this.marca = marca;
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
    
}
