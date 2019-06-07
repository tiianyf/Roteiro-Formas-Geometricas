/*
 * Métodos: construtor, sobrecarga, cópia do construtor, calculo da distancia e imprimir
 */
package classes;

/**
 *
 * @author cristiane
 */
public class Ponto {
    
    private double x, y;

    //Construtor
    public Ponto() {
    
        this.x = 0.0;
        this.y = 0.0;
    }
    
    //Sobrecarga do construtor
    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    //Cópia do construtor
    public Ponto(Ponto outro){
    
        this.x = outro.getX();
        this.y = outro.getY();
    }
    /**
     * Calcula a distancia entre dois pontos
     * @param a = diferença entre os (X)
     * @param b = diferença entre o (Y)
     * @return  = retorna o valor da distância entre os pontos
     */
    public double calculoDistancia(Ponto a, Ponto b){
    
        double resultado = 0.0;
        double distanciaX = b.getX() - a.getX();
        double distanciaY = b.getY() - a.getY();
        
        resultado = Math.pow(distanciaX, 2.0) + Math.pow(distanciaY, 2.0);
        resultado = Math.sqrt(resultado);
        
        return resultado;
    }
    /**
     * Imprime as coordenadas do ponto
     * @return as coordenadas do ponto
     */
    public String imprimirPontos(){
    
        String resultado = "";
        resultado = "(" + this.x + " ; " + this.y + " )";
        
        return resultado;
    }

    /**
     * @return the x
     */
    public double getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public double getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(double y) {
        this.y = y;
    }
    
}
