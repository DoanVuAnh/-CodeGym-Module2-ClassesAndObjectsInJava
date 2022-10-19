import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = input.nextDouble();
        System.out.print("Enter b: ");
        double b = input.nextDouble();
        System.out.print("Enter c: ");
        double c = input.nextDouble();

        QuadraticEquation equation = new QuadraticEquation();

        equation.setA(a);
        equation.setB(b);
        equation.setC(c);
        if (equation.getDiscriminant() > 0){
            System.out.print(equation.getRoot1());
            System.out.print(equation.getRoot2());
        } else if (equation.getDiscriminant() == 0) {
            System.out.print(equation.getRoot1());
        } else {
            System.out.print("The equation has no roots");
        }

    }
}