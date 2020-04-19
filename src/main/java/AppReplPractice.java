import java.io.Console;

public class AppReplPractice{
    public static void main(String[] args) {
        Console myConsole = System.console();

        System.out.println("Please enter your name: ");
            String input = myConsole.readLine();
        System.out.println("How many times do you want us to repeat it?");
            int repeat = Integer.parseInt(myConsole.readLine());

        for (int i = 0; i < repeat; i += 1) {
            System.out.println("Your name is: " + input);
            System.out.println("------------------------");
        }

    }
}