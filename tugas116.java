package Jobsheet13;

import java.util.Scanner;

public class tugas116 {
    public static int hitungIteratif(int[] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        return total;
    }

    public static int hitungRekursif(int[] arr, int n) {
        if (n < 0) {
            return 0;
        }
        return arr[n] + hitungRekursif(arr, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Masukkan jumlah angka yang ingin dihitung (N): ");
        n = sc.nextInt();
        int[] data = new int[n];
        for (int i = n; i >= 1; i--) {
            System.out.print("Masukkan angka ke-" + i + ": ");
            data[i - 1] = sc.nextInt();
        }
        int totalIteratif = hitungIteratif(data);
        int totalRekursif = hitungRekursif(data, n - 1);
        System.out.println("Total dari " + n + " angka yang dimasukkan adalah: " + totalRekursif);
        System.out.println("Total dari " + n + " angka yang dimasukkan adalah: " + totalIteratif);
    }
}
