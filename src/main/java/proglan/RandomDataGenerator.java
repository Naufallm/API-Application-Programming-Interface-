package proglan;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Random;
import java.util.Scanner;

public class RandomDataGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Random Angka");
            System.out.println("2. Random String");
            System.out.println("3. Keluar");
            System.out.print("Pilih opsi (1/2/3): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    generateRandomNumber(scanner, random);
                    break;
                case 2:
                    generateRandomString(scanner, random);
                    break;
                case 3:
                    System.out.println("Terima kasih, program berakhir.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
                    break;
            }

        } while (choice != 3);

        scanner.close();
    }

    private static void generateRandomNumber(Scanner scanner, Random random) {
        System.out.print("Masukkan batas bawah angka acak: ");
        int lowerBound = scanner.nextInt();
        System.out.print("Masukkan batas atas angka acak: ");
        int upperBound = scanner.nextInt();

        int randomNumber = random.nextInt(upperBound - lowerBound + 1);

        System.out.println("Angka acak: " + randomNumber);
    }

    private static void generateRandomString(Scanner scanner, Random random) {
        System.out.print("Masukkan panjang string acak: ");
        int length = scanner.nextInt();

        StringBuilder randomString = new StringBuilder();

        for (int i = 0; i < length; i++) {
            char randomChar = (char) (random.nextInt(26) + 'A');
            randomString.append(randomChar);
        }

        System.out.println("String acak: " + randomString.toString());
    }
}
