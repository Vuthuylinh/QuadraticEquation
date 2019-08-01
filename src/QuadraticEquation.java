public class QuadraticEquation {
    //Solve: ax2+bx+c=0;
    private double a;
    private double b;
    private double c;

    public QuadraticEquation() {

    }


    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant() {
        //delta = b2 - 4ac
        double delta = (this.b * this.b) - (4 * this.a * this.c);
        return  delta;

    }
    public String toString(){
        String str="Quadratic equation: "+ this.a+ "x2 + "+ this.b+"x"+ this.c + "=0";
        return str;
    }

    public double getRoot1(){
        double delta=getDiscriminant();
        if(delta<0){
            return 0;
        }else {
            double root1=(-b+ Math.sqrt(delta))/(2*a);
            return root1;
        }
    }
    public double getRoot2(){
        double delta=getDiscriminant();
        if(delta<0){
            return 0;
        }else {

            double root2=(-b- Math.sqrt(delta))/(2*a);
            return root2;
        }
    }


}
