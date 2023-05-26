package prog9;
import java.util.Scanner;

class NumberThread extends Thread {
	int number;
	NumberThread(int number){
		this.number = number;
	}
    @Override
    public void run() {
     
        // Splitting digits and displaying in words
        System.out.println("Digits in words:");
        while (number > 0) {
            int digit = number % 10;
            String word = convertToWord(digit);
            System.out.println(word);
            number /= 10;
        }

    }

    private static String convertToWord(int digit) {
        switch (digit) {
            case 0:
                return "Zero";
            case 1:
                return "One";
            case 2:
                return "Two";
            case 3:
                return "Three";
            case 4:
                return "Four";
            case 5:
                return "Five";
            case 6:
                return "Six";
            case 7:
                return "Seven";
            case 8:
                return "Eight";
            case 9:
                return "Nine";
            default:
                return "";
        }
    }
}

class VowelThread extends Thread {
	String word;
	VowelThread(String word){
		this.word = word;
	}
    @Override
    public void run() {

        // Counting vowels
        int vowelCount = 0;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (isVowel(ch)) {
                vowelCount++;
            }
        }

        System.out.println("Number of vowels in the word: " + vowelCount);

    }

    private static boolean isVowel(char ch) {
        ch = Character.toUpperCase(ch);
        return ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }
}

public class NumberWordThreadDemo {
    public static void main(String[] args) {
        // Create thread objects
        NumberThread numberThread = new NumberThread(12);
        VowelThread vowelThread = new VowelThread("helloworld");

        // Start the threads
        numberThread.start();
        vowelThread.start();
    }
}
