package MuhammadAnandaRM;

import java.util.Scanner;

public class MuhammadAnandaRM{
    public static void main(String[] args) {
        double Nilai2;
        double hasil;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Masukan Nilai 1: ");
        double Nilai1 = keyboard.nextInt();
        System.out.print("Masukan Nilai 2: ");
        Nilai2 = keyboard.nextInt();

        // penjumlahan
        hasil = Nilai1 + Nilai2;
        System.out.println("Hasil Penjumlahan = " + hasil);

        System.out.print("Masukan Nilai 1: ");
        Nilai1 = keyboard.nextInt();
        System.out.print("Masukan Nilai 2: ");
        Nilai2 = keyboard.nextInt();

        // pengurangan
        hasil = Nilai1 - Nilai2;
        System.out.println("Hasil Pengurangan = " + hasil);

        System.out.print("Masukan Nilai 1: ");
        Nilai1 = keyboard.nextInt();
        System.out.print("Masukan Nilai 2: ");
        Nilai2 = keyboard.nextInt();

        // perkalian
        hasil = Nilai1 * Nilai2;
        System.out.println("Hasil Perkalian = " + hasil);

        System.out.print("Masukan Nilai 1: ");
        Nilai1 = keyboard.nextInt();
        System.out.print("Masukan Nilai 2: ");
        Nilai2 = keyboard.nextInt();

        // Pembagian
        hasil = Nilai1 / Nilai2;
        System.out.println("Hasil Pembagian = " + hasil);

        System.out.print("Masukan Nilai 1: ");
        Nilai1 = keyboard.nextInt();
        System.out.print("Masukan Nilai 2: ");
        Nilai2 = keyboard.nextInt();

        // Sisa Bagi
        hasil = Nilai1 % Nilai2;
        System.out.println("Hasil Sisa Bagi = " + hasil);

        System.out.print("Masukan Nilai 1: ");
        Nilai1 = keyboard.nextDouble(); // Menggunakan nextDouble() untuk mengambil nilai desimal
        System.out.print("Masukan Nilai 2: ");
        Nilai2 = keyboard.nextDouble();

        // Perbandingan
        boolean lebihBesar = Nilai1 > Nilai2;
        boolean lebihKecil = Nilai1 < Nilai2;
        boolean samaDengan = Nilai1 == Nilai2;

        System.out.println("Nilai1 lebih besar dari Nilai2: " + lebihBesar);
        System.out.println("Nilai1 lebih kecil dari Nilai2: " + lebihKecil);
        System.out.println("Nilai1 sama dengan Nilai2: " + samaDengan);

        // Operator Bitwise AND
        int nilaiInt1 = (int) Nilai1;
        int nilaiInt2 = (int) Nilai2;
        int hasilBitwiseAND = nilaiInt1 & nilaiInt2;
        String binerAngka1 = Integer.toBinaryString(nilaiInt1);
        String binerAngka2 = Integer.toBinaryString(nilaiInt2);
        String binerHasilAND = Integer.toBinaryString(hasilBitwiseAND);

        System.out.println("Hasil Bitwise AND = " + hasilBitwiseAND + " (dalam biner: " + binerHasilAND + ")");
        System.out.println("Angka-1 dalam biner: " + binerAngka1);
        System.out.println("Angka-2 dalam biner: " + binerAngka2);

        // Operator Bitwise OR
        int hasilBitwiseOR = nilaiInt1 | nilaiInt2;
        String binerHasilOR = Integer.toBinaryString(hasilBitwiseOR);
        System.out.println("Hasil Bitwise OR = " + hasilBitwiseOR + " (dalam biner: " + binerHasilOR + ")");

        // Operator Bitwise XOR
        int hasilBitwiseXOR = nilaiInt1 ^ nilaiInt2;
        String binerHasilXOR = Integer.toBinaryString(hasilBitwiseXOR);
        System.out.println("Hasil Bitwise XOR = " + hasilBitwiseXOR + "(dalam biner: " + binerHasilXOR + ")");

        // Operator Bitwise NOT
        int hasilBitwiseNOT1 = ~nilaiInt1;
        int hasilBitwiseNOT2 = ~nilaiInt2;
        String binerHasilNOT1 = Integer.toBinaryString(hasilBitwiseNOT1);
        String binerHasilNOT2 = Integer.toBinaryString(hasilBitwiseNOT2);
        System.out.println("Hasil Bitwise NOT dari angka-1 = " + hasilBitwiseNOT1 + " (dalam biner: " + binerHasilNOT1 + ")");
        System.out.println("Hasil Bitwise NOT dari angka-2 = " + hasilBitwiseNOT2 + " (dalam biner: " + binerHasilNOT2 + ")");
    }
}