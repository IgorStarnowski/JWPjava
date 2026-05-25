package ZadaniaYouTube;
import java.util.Scanner;

public class Zad14 {
    public static void main(String[] args) {
        int[] numbers = {10, 11, 12, 13, 14, 15};
        int[][] numbersMatrix = {
                {10, 11, 12},
                {13, 14},
                {15, 16, 17},
                {18}
        };

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 12) {
                continue;
            }
            System.out.println(numbers[i]);
        }

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 13) {
                break;
            }
            System.out.println(numbers[i]);
        }

        System.out.println("Podaj dowolne słowo: ");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        for (char wordPart : word.toCharArray()) {
            System.out.print(wordPart + " ");
        }

        for (int i = 0; i < numbersMatrix.length; i++) {
            for (int j = 0; j < numbersMatrix[i].length; j++) {
                if (numbersMatrix[i][j] == 13) {
                    System.out.print(" ");
                    continue;
                }
                System.out.print(numbersMatrix[i][j] + " ");
            }
        }

        int sumGlobal = 0;
        for (int i = 0; i < numbersMatrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < numbersMatrix[i].length; j++) {
                sum += numbersMatrix[i][j];
            }
            sumGlobal += sum;
        }
        System.out.println(sumGlobal);

        for (int[] numbersRow : numbersMatrix) {
            for (int number : numbersRow) {
                System.out.print(number + " ");
            }
            System.out.println();
        }

        System.out.println("Podaj ilość poziomów: ");
        int levelsCount = scanner.nextInt();

        for (int i = 0; i < levelsCount; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
//Zrealizowałem zadania z podsumowania z filmu 14