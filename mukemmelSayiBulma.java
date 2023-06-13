package odevler;

import java.util.Scanner;

public class mukemmelSayiBulma {
// Mükemmel Sayı Nedir ?
//Bir sayının kendisi hariç pozitif tam sayı çarpanları
// (kalansız bölen sayıların) toplamı kendisine eşit olan sayıya mükemmel sayı denir.
/*
Örnek olarak, 6 sayısını ele alalım:

6'nın tam bölenleri 1, 2 ve 3'tür.
Bu tam bölenlerin toplamı: 1 + 2 + 3 = 6
Toplam, 6'ya eşit olduğu için 6 bir mükemmel sayıdır.
Başka bir örnek olarak, 28 sayısını ele alalım:

28'in tam bölenleri 1, 2, 4, 7 ve 14'tür.
Bu tam bölenlerin toplamı: 1 + 2 + 4 + 7 + 14 = 28
Toplam, 28'e eşit olduğu için 28 bir mükemmel sayıdır.
Mükemmel sayılar oldukça özel ve nadir sayılardır.
İlk birkaç mükemmel sayı şunlardır: 6, 28, 496, 8128, 33,550,336 vb.
Bu sayılar matematiksel olarak ilginç özelliklere sahiptir.

Programda, kullanıcının girdiği sayının tam bölenlerinin toplamını hesaplayarak,
bu toplamın girilen sayıya eşit olup olmadığını kontrol ediyoruz.
Eşitse, sayı mükemmel sayıdır. Aksi takdirde mükemmel sayı değildir.
 */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int sayi = input.nextInt();

        int toplam = 0;

        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                toplam += i;
            }
        }

        if (toplam == sayi) {
            System.out.println(sayi + " mükemmel sayıdır.");
        } else {
            System.out.println(sayi + " mükemmel sayı değildir.");
        }

    }
}
