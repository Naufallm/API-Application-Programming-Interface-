package proglan;
import java.util.Arrays;
import java.util.Scanner;

public class SortingAndRatio {
    public static void main(String[] args) {
        // Data
        int[] data = {38, -15, 72, 0, -42, 19, -63, 50, 27, -84, 61, 5};

        // Sorting data
        Arrays.sort(data);

        // Menampilkan data yang sudah diurutkan
        System.out.println("Data setelah diurutkan: " + Arrays.toString(data));

        // Input dari pengguna untuk mencari indeks elemen
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan elemen yang ingin dicari indeksnya: ");
        int target = scanner.nextInt();

        // Mencari indeks elemen menggunakan binarySearch
        int index = Arrays.binarySearch(data, target);

        // Menampilkan hasil pencarian
        if (index >= 0) {
            System.out.println("Elemen " + target + " ditemukan pada indeks " + index);
        } else {
            System.out.println("Elemen " + target + " tidak ditemukan dalam data");
        }

        // Menghitung rasio elemen positif, negatif, dan nol
        int countPositive = 0;
        int countNegative = 0;
        int countZero = 0;

        for (int num :data) {
            if (num > 0) {
                countPositive++;
            } else if (num < 0) {
                countNegative++;
            } else {
                countZero++;
            }
        }

        // Menampilkan nilai rasio
        System.out.println("Jumlah elemen dengan nilai positif: " +countPositive);
        System.out.println("Jumlah elemen dengan nilai negatif: " +countNegative);
        System.out.println("Jumlah elemen dengan nilai nol: " +countZero);
    }
}

