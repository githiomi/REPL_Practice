import java.io.Console;

public class AppTriangle{
    public static void main(String[] args){
        Console myConsole = System.console();

        System.out.println("--------Welcome to DISCOVER TRIANGLES!---------");
        System.out.println("First we are going to need the 3 sides of your triangle! Enter the length of side");
        System.out.println("Enter side 1 length: ");
            int sideOne = Integer.parseInt(myConsole.readLine());
        System.out.println("Enter side 2 length: ");
            int sideTwo = Integer.parseInt(myConsole.readLine());
        System.out.println("enter side 3 length: ");
            int sideThree = Integer.parseInt(myConsole.readLine());

        Triangle newTriangle = new Triangle(sideOne, sideTwo, sideThree);
        System.out.println("The sides of your triangle measure: " + newTriangle.mSideOne + ", " + newTriangle.mSideTwo + " and " + newTriangle.mSideThree);


        System.out.println("You have a " + newTriangle.triangleType(newTriangle.mSideOne, newTriangle.mSideTwo, newTriangle.mSideThree) + " triangle!");

        }
    }
