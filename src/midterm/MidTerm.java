// Taylor Wu u752127
package midterm;
import java.util.Scanner;

/**
 *
 * @author taylorwu
 */
public class MidTerm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter in a height");
        int height = scanner.nextInt();
        System.out.println("Enter in a width");
        int width = scanner.nextInt();
        System.out.println("the height is: " + height + "the width is: " + width);
        computePerimeter(height, width);
        computeArea(height, width);
        System.out.print("Enter in an integer");
        int num1 = scanner.nextInt();
        System.out.print("Enter in another integer");
        int num2 = scanner.nextInt();
        addNumber(num1, num2);
    }
    public static void computePerimeter(int height, int width) {
        int perimeter = height + height + width + width;
        System.out.println("the perimeter of the rectangle is: " + perimeter);
    }
    
    public static void computeArea(int height, int width) {
        int area = height * width;
        System.out.println("The area of the rectangle is: " + area);
    }
    
    public static void addNumber(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println(num1 + " plus " + num2 + " equals " + sum);
    }
}
