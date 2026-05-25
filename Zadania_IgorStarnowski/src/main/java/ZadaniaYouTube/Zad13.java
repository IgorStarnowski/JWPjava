package ZadaniaYouTube;
public class Zad13 {
    public static void main(String[] args) {
        String[] numbers = {"10", "11", "12", "13", "14", "15"};
        int numbersLength = numbers.length; // 6

//        int index = 0;
//
//        while (index < numbersLength) {
//            System.out.println(numbers[index]);
//            index++;
//        }
//
//        do {
//            System.out.println(numbers[index]);
//            index++;
//        } while(index < numbersLength);
//
//        for (int index = 0; index < numbersLength; index++) {
//            System.out.println(numbers[index]);
//        }

        for (String number : numbers) {
            System.out.println(number);
        }
    }
}
//nie dowiedziałem się nic nowego znam zasadę działania pętli for, for each i do while