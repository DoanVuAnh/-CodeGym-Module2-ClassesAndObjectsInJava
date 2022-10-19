public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getA(){
         return a;
    }
    public   double getB(){
         return b;
    }
    public double getC(){
         return c;
    }
    public double getDiscriminant(){
        double delta = Math.pow(this.b,2) - 4 * this.a * this.c;
        return delta;
    }
    public double getRoot1(){
        double root1 = (-b + Math.sqrt(b * b - 4 * a * c))/2 * a;
        return root1;
    }
    public double getRoot2(){
        double root2 = (-b - Math.sqrt(b * b - 4 * a * c))/2 * a;
        return root2;
    }

}
// public