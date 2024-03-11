package poo;

public class Numero {
    private double n1;

    private double getN1() {
        return n1;
    }

    private void setN1(double n1) {
        this.n1 = n1;
    }

    public double soma(double n1, double n2){
     setN1(n1 + n2);
     return getN1();

    }

    public double subtração(double n1, double n2){
        setN1(n1 - n2);
        return getN1();
   
    }

    public double divisão(double n1, double n2){
        setN1(n1 / n2);
        return getN1();
   
    }

    public double multiplicação(double n1, double n2){
        setN1(n1 * n2);
        return getN1();
   
    }


















}
