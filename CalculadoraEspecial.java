package prograi;


public class CalculadoraEspecial {
    private String tipoCalculadora;
    private int numeroDeTeclas;

    CalculadoraEspecial(){
        this.tipoCalculadora="Calculadora Especial";
    }

    CalculadoraEspecial(String tipo){
        this.tipoCalculadora=tipo;
    }
    
    CalculadoraEspecial(String tipo, int cantidad){
        this.tipoCalculadora=tipo;
        this.numeroDeTeclas=cantidad;
    }

    public String getTipoCalculadora() {
        return this.tipoCalculadora;
    }

    public void setTipoCalculadora(String tipoCalculadora) {
        this.tipoCalculadora = tipoCalculadora;
    }

    public int getNumeroDeTeclas() {
        return numeroDeTeclas;
    }

    public void setNumeroDeTeclas(int numeroDeTeclas) {
        this.numeroDeTeclas = numeroDeTeclas;
    }

}
