/*
 * Métodos: construtor, calculo do perímetro, determinante, área, tipo do triangulo formado
*/
package classes;

/**
 *
 * @author cristiane
 */
public class Triangulo {
    
    private Ponto a, b, c;

    public Triangulo() {
        
        this.a = new Ponto();
        this.b = new Ponto();
        this.c = new Ponto();
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
     * Calcula a determinante de três pontos, pega-se as coordenadas e adiciona 1
     * na última coluna da matriz.
     * @param a = primeira linha da matriz.
     * @param b = segunda linha da matriz.
     * @param c = terceira linha da matriz.
     * @return = o valor da determinante.
     */
    public double calculoDeterminante(Ponto a, Ponto b, Ponto c){
    
        double resultado = 0.0;
        double diagonalPrincipal = ((a.getX() * b.getY() * 1))
                + ((a.getY() * 1 * c.getX()))
                +((1 * b.getX() * c.getY()));
        
        double diagonalSecundaria = ((a.getY() * b.getX() * 1))
                + ((a.getX() * 1 * c.getY()))
                + ((1 * b.getY() * c.getX()));
        
        resultado = (diagonalPrincipal - diagonalSecundaria);
        return resultado;
        
    }
    
    /**
     * Verifica se os três pontos são colineares, ou seja, estão sob a mesma reta
     * caso seja verdadeiro, o valor da determinante será zero.
     * 
     * @param a = primeiro ponto a ser verificado.
     * @param b = segundo ponto a ser verificado.
     * @param c = terceiro ponto a ser verificado.
     * @return = true caso a determinante dê 0.
     */
    public boolean colinear(Ponto a, Ponto b, Ponto c){
    
        return this.calculoDeterminante(a, b, c) == 0;
    }
    
    /**
     * Calcula a área entre três pontos. O resultado será igual a 0 se a determinante
     * der 0, ou seja, eles serão colineares. Do contrário, basta dividir o valor encontrado
     * pela determinante por 1/2. Assim obtemos a área do triangulo.
     * 
     * @param a = ponto que será calculado
     * @param b = ponto que será calculado
     * @param c = ponto que será calculado
     * @return = a área do triângulo
     */
    public double calculoArea(Ponto a, Ponto b, Ponto c){
    
        if(this.colinear(a, b, c)){
            return 0.0;
        }
        else{
            return Math.abs(this.calculoDeterminante(a, b, c)/2.0);
        }
       
    }
    
    /**
     * Verifica se o triângulo formado é escaleno, ou seja, todos os lados 
     * são diferentes.
     * 
     * @param a = primeiro ponto a ser analizado.
     * @param b = segundo ponto a ser analizado.
     * @param c = terceiro ponto a ser analizado.
     * @return = true caso seja escaleno.
     */
    public boolean escaleno(Ponto a, Ponto b, Ponto c){
    
        double ladoA = this.a.calculoDistancia(a, b);
        double ladoB = this.a.calculoDistancia(b, c);
        double ladoC = this.a.calculoDistancia(c, a);
        
        return (ladoA != ladoB) && (ladoB != ladoC) && (ladoC != ladoA);
    }
    
    /**
     * Verifica se o triangulo formado é isósceles, ou seja dois lados iguais.
     * 
     * @param a = primeiro ponto a ser analizado.
     * @param b = segundo ponto a ser analizado.
     * @param c = terceiro ponto a ser analizado.
     * @return = true caso seja isosceles.
     */
    public boolean isosceles(Ponto a, Ponto b, Ponto c){
    
        double ladoA = this.a.calculoDistancia(a, b);
        double ladoB = this.a.calculoDistancia(b, c);
        double ladoC = this.a.calculoDistancia(c, a);
        
        return ((ladoA == ladoB)) && ((ladoB != ladoC)) && ((ladoC != ladoA))
                || ((ladoB == ladoC)) && ((ladoA == ladoB)) && ((ladoC != ladoA))
                || ((ladoC == ladoA)) && ((ladoB != ladoC)) && ((ladoC != ladoA));
    }
    
    /**
     * Verifica se o triangulo formado é equilátero, ou seja, todos os lados são iguais7
     * 
     * @param a = primeiro ponto a ser analizado.
     * @param b = segundo ponto a ser analizado.
     * @param c = terceiro ponto a ser analizado.
     * @return = true caso ele seja equilátero.
     */
    public boolean equilatero(Ponto a, Ponto b, Ponto c){
    
        double ladoA = this.a.calculoDistancia(a, b);
        double ladoB = this.a.calculoDistancia(b, c);
        double ladoC = this.a.calculoDistancia(c, a);
        
        return (ladoA == ladoB) && (ladoB == ladoC) && (ladoC == ladoA);
    }
    
    /**
     * Verifica qual foi o tipo de triangulo formado pelos 3 pontos.
     * (Equilátero, isósceles ou escaleno).
     * 
     * @param a = primeiro ponto a ser analizado.
     * @param b = segundo ponto a ser analizado.
     * @param c = terceiro ponto a ser analizado.
     * @return = retorna o tipo de triangulo formado.
     */
    public String tipoDeTriangulo(Ponto a, Ponto b, Ponto c){
    
        String resultado = "\nO triângulo formado pelos pontos é:"
                + "\nA: " + a.imprimirPontos() 
                +"\nB: " + b.imprimirPontos() 
                +"\nC: " + c.imprimirPontos() + "\n";
                
        
        if(this.equilatero(a, b, c)){
            return resultado + "\tEquilátero!";
        }
        else if(this.isosceles(a, b, c)){
            return resultado + "\tIsósceles!";
        }
        else{
            return resultado +"\tEscaleno!";
        }
    }
    
    /**
     * Calculo a perímetro do triangulo.
     * 
     * @param a = ponto a ser calculado.
     * @param b = ponto a ser calculado.
     * @param c = ponto a ser calculado.
     * @return = o valor do perímetro
     */
    public double calculaPerimetro(Ponto a, Ponto b, Ponto c){
    
        double resultado = 0.0;
        resultado = (a.calculoDistancia(a, b) + a.calculoDistancia(b, c) + a.calculoDistancia(c, a));
        
        return resultado;
    }
}
