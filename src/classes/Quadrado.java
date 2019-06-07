/*
 * Métodos: construtor, imprimir e calcular a distância
 */
package classes;

/**
 *
 * @author cristiane
 */
public class Quadrado {
    
    private Ponto a, b, c, d;
    private double lado;

    public Quadrado() {
        
        this.a = new Ponto();
        this.b = new Ponto();
        this.c = new Ponto();
        this.d = new Ponto();
        this.lado = a.calculoDistancia(a, b);
    
    }

    public Quadrado(Ponto a, Ponto b, Ponto c, Ponto d, double lado) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.lado = lado;
    }
    
    /**
     * @return the a
     */
    public Ponto getA() {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setA(Ponto a) {
        this.a = a;
    }

    /**
     * @return the b
     */
    public Ponto getB() {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(Ponto b) {
        this.b = b;
    }

    /**
     * @return the c
     */
    public Ponto getC() {
        return c;
    }

    /**
     * @param c the c to set
     */
    public void setC(Ponto c) {
        this.c = c;
    }

    /**
     * @return the d
     */
    public Ponto getD() {
        return d;
    }

    /**
     * @param d the d to set
     */
    public void setD(Ponto d) {
        this.d = d;
    }

    /**
     * @return the lado
     */
    public double getLado() {
        return lado;
    }

    /**
     * @param lado the lado to set
     */
    public void setLado(double lado) {
        this.lado = lado;
    }
    
    /**
     * Calcula a área do quadrado.
     * 
     * @param a = ponto a ser calculado
     * @param b = ponto a ser calculado
     * @return = o valor da área do quadrado
     */
    public double calculoArea(Ponto a, Ponto b){
        
//        System.out.println(this.a.calculoDistancia(a, b));
        double resultado = 0.0;
        resultado =  Math.pow(this.a.calculoDistancia(a, b), 2);
        return resultado;
    }
    
    /**
     * Calcula o perímetro do quadrado.
     * 
     * @param a = ponto a ser calculado.
     * @param b = ponto a ser calculado.
     * @return = valor do perímetro
     */
    public double calculoPerimetro(Ponto a, Ponto b){
    
        return (this.a.calculoDistancia(a, b)* 4);
    }
    
    /**
     * Verifica se forma um quadrado, ou seja, se os lados são iguais
     * @return = true caso forma
     */
    public boolean formaQuadrado(Ponto a, Ponto b, Ponto c, Ponto d){
    
        return (this.a.calculoDistancia(a, b) == this.a.calculoDistancia(b, c)
                && this.a.calculoDistancia(a,b) == this.a.calculoDistancia(c, d)
                && this.a.calculoDistancia(a, b) == this.a.calculoDistancia(d, a));
        
        
    }
    
    public void verificaQuadrado(Ponto a, Ponto b, Ponto c, Ponto d){
    
        double resultado1, resultado2, resultado3, resultado4 = 0.0;
        resultado1 = this.a.calculoDistancia(a, b);
        resultado2 = this.a.calculoDistancia(b, c);
        resultado3 = this.a.calculoDistancia(c, d);
        resultado4 = this.a.calculoDistancia(d, a);
        
        System.out.println(this.a.calculoDistancia(a, b));
        System.out.println(this.a.calculoDistancia(b, c));
        System.out.println(this.a.calculoDistancia(c, d));
        System.out.println(this.a.calculoDistancia(d, a));
        
//        if(resultado1 == resultado2 && resultado3 == resultado4){
//            return true;
//        }
//        else
//            return false;
//        
    }
    
    public String imprimirPontosQuadrado(Ponto a, Ponto b, Ponto c, Ponto d){
    
       String resultado = "\nOs pontos:"
                + "\nA: " + a.imprimirPontos() 
                +"\nB: " + b.imprimirPontos() 
                +"\nC: " + c.imprimirPontos() 
               + "\nD: " + d.imprimirPontos() + "\n";
        
        return resultado;
    }
    
    public double calculoDiagonal(Ponto a, Ponto b){
        
        double resultado =  ((this.a.calculoDistancia(a, b) * Math.sqrt(2)));
//        System.out.println(resultado);
        return resultado;
        
    }
    
}
