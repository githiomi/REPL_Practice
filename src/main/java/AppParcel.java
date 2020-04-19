import java.io.Console;

public class AppParcel{
    public static void main (String[] args){
        Console myConsole = System.console();

        System.out.println("-------------Welcome to DHOSIO'S PARCELS-----------");
        System.out.print("Hello user, please enter your name: ");
            String enteredName = myConsole.readLine();
        System.out.println("Hello " + enteredName + ", thank you for choosing Dhosio's Parcels.");
        System.out.print("Please enter the length of your parcel: ");
            int enteredLength = Integer.parseInt(myConsole.readLine());

        System.out.print("Got it! Please enter the width of your parcel: ");
        int enteredWidth = Integer.parseInt(myConsole.readLine());

        System.out.print("Awesome! Please enter the height of your parcel: ");
        int enteredHeight = Integer.parseInt(myConsole.readLine());

        Parcel newParcel = new Parcel(enteredName, enteredLength, enteredWidth, enteredHeight);
            System.out.println(newParcel.mName + ", please confirm the dimensions: Length = " + enteredLength + ", the width = " + enteredWidth + ", and the height = " + enteredHeight + " units");
            System.out.print("Press 1 to proceed: ");
                Integer toContinue = Integer.parseInt(myConsole.readLine());

                if (toContinue == 1){
                    System.out.println("Your parcel has a volume of " + newParcel.parcelVolume(newParcel.mLength, newParcel.mWidth, newParcel.mHeight) + " cubic units");

                    System.out.println("This will cost you $" + newParcel.costCalculator(newParcel.mLength, newParcel.mWidth, newParcel.mHeight));
        }
    }
}