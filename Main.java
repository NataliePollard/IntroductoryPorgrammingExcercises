import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        EasiestExcerciseEver();
        DrawHorizontalLine(8);
        DrawVerticalLine(3);
        DrawARightTriangle(5);
        IsoscelesTriangle(3);
        Diamond(3);
        DiamondWithName(3);
        FizzBuzz();
        System.out.println(generate(210));

    }

    public static void EasiestExcerciseEver() {
        System.out.println("*");
    }

    public static void DrawHorizontalLine(int numAstrisks) {
        for(int i = 0; i < numAstrisks; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void DrawVerticalLine(int numAstrisks) {
        for(int i = 0; i < numAstrisks; i++) {
            System.out.println("*");
        }
    }

    public static void DrawARightTriangle(int numAstrisks) {
        for(int i = 0; i < numAstrisks; i++) {
            for(int j = 0 ; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void IsoscelesTriangle(int n) {
            int totalWidth = 1 + 2*(n-1);
            for(int currentRow = 0; currentRow < n; currentRow++) {
                int numStars = 1+(2*currentRow);
                horizontalLineWithCenteredStars(numStars,totalWidth);
                System.out.println();
        }
    }


    private static void horizontalLineWithCenteredStars(int numStars, int lineWidth) {
        int numberOfBlanks = (lineWidth - numStars)/2;

        for(int i = 0; i < numberOfBlanks; i++) {
            System.out.print(" ");
        }
        for(int i = 0; i < numStars; i++) {
            System.out.print("*");
        }
        for(int i = 0; i < numberOfBlanks; i++) {
            System.out.print(" ");
        }
    }

    public static void Diamond(int n) {
        IsoscelesTriangle(n);
        UpsideDownIsocelesTriangle(n);
    }

    private static void UpsideDownIsocelesTriangle(int n) {
        int totalWidth = 1 + 2*(n-1);
        for(int currentRow = n-2; currentRow >= 0; currentRow--) {
            int numStars = 1 + 2 * currentRow;
            horizontalLineWithCenteredStars(numStars, totalWidth);
            System.out.println();
        }
    }
    public static void DiamondWithName(int n) {
        int totalWidth = 1 + 2*(n-1);
        for(int currentRow = 0; currentRow < n-1; currentRow++) {
            int numStars = 1 + (2 * currentRow);
            horizontalLineWithCenteredStars(numStars, totalWidth);
            System.out.println();
        }
        System.out.println("Natalie");
        UpsideDownIsocelesTriangle(n);
    }

    public static void FizzBuzz() {
        for(int i = 1; i < 100; i++) {
            if(i%15 == 0)
                System.out.println("FizzBuzz");
            else if(i%3 == 0)
                System.out.println("Fizz");
            else if(i%5 == 0)
                System.out.println("Buzz");
            else
                System.out.println(i);
        }
    }


    public static ArrayList generate(int n) {
        ArrayList factors = new ArrayList();
        for (int i = 2; i < n; i++){
            if (isPrime(i) && n % i == 0) {
                factors.add(i);
            }
        }
        return factors;
    }

    private static boolean isPrime(int n) {
        for(int i = 2; i < n; i++) {
            if(n%i == 0)
                return false;
        }
        return true;
    }
}

