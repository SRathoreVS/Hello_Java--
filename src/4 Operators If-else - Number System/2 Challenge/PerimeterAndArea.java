import java.util.Scanner;

public class PerimeterAndArea {
    public static void main(String[] args) {
        //perimeter of rectangle
        Scanner userInput = new Scanner(System.in);
        System.out.print("enter the dimension od side1 : ");
        double side1 = userInput.nextDouble();
        System.out.print("enter the dimension od side2 : ");
        double side2 = userInput.nextDouble();
        System.out.print("enter the dimension od side3 : ");
        double side3 = userInput.nextDouble();
        System.out.print("enter the dimension od side4 : ");
        double side4 = userInput.nextDouble();
        double perimeter = side1 + side2 + side3 + side4 ;
        System.out.println("Calculating perimeter.....");
        System.out.println("Perimeter is : " + perimeter);

        //Area of triangle
        System.out.print("provide breadth of Triangle : ");
        double breadth = userInput.nextDouble();
        System.out.print("provide height of Triangle : ");
        double height = userInput.nextDouble();
        double area = ((double) 1 /2)*breadth*height;
        System.out.println("Area is calculated as : " + area);


    }
}