import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Solve quadratic equation ax2+bx+c=0;");
        System.out.print("Enter a(a != 0): ");
        double a =input.nextDouble();
        System.out.print("Enter b: ");
        double b = input.nextDouble();
        System.out.print("Enter c: ");
       double c= input.nextDouble();

        QuadraticEquation quadraticEquation= new QuadraticEquation(a,b,c);
        quadraticEquation.toString();
        if(quadraticEquation.getDiscriminant()>0){
            System.out.println(" this equation has 2 roots: root1= "
                    + quadraticEquation.getRoot1()+ "; root2 = "
                    + quadraticEquation.getRoot2());
        }else if(quadraticEquation.getDiscriminant()==0){
            System.out.println(" This equation has 2 roots: root1 = root2 = "+quadraticEquation.getRoot1());
        }else{
            System.out.println("This equation has no root!");
        }


    }
}
