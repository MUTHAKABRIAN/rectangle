import java.io.Console;

public class App {
    public static void main(String[]args){
        Console console = System.console();
        System.out.println("Enter the Length of you Rectangle");
        String stringLength = console.readLine();
        int intLength = Integer.parseInt(stringLength);
        System.out.println("Enter with of your Rectangle");
        String stringWidth =console.readLine();
        int intWidth = Integer.parseInt(stringWidth);
        Rectangle rectangle =new Rectangle (intLength,intWidth);
        boolean squareResult = rectangle.isSquare();
        System.out.println("Is your rectangle a square,too?" +squareResult+"!");
    }
}