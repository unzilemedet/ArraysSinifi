package com.unzilemedet;

import java.util.Arrays;

public class Arrays_Sinifi {
    public static void main(String[] args) {

        int[] dizi = {3, 5, 79, 12, 25, -3, 66, 82, -49, 152};
        System.out.println(Arrays.toString(dizi));
        // Çıktısı
        // [3, 5, 79, 12, 25, -3, 66, 82,-49,152]




        /*    Arrays.fill()   */
        //  Arrays.fill metodu ile dizilerimizin belirli bir bölümlerine değerler atayabiliriz.

        int[] liste = {15, 1, 99, 7, 7, -22, 11, 2, -49, 52};

        Arrays.fill(liste, 2);
        System.out.println(Arrays.toString(liste));

        int[] liste2 = {15, 1, 99, 7, 7, -22, 11, 2, -49, 52};

        Arrays.fill(liste2, 3, 5, 7);
        System.out.println(Arrays.toString(liste2));
        // Çıktısı
        // [2, 2, 2, 2, 2, 2, 2, 2, 2, 2]
        // [15, 1, 99, 7, 7, -22, 11, 2, -49, 52]




        /*    Arrays.sort()    */
        //Arrays.sort() metodu ile dizilerdeki elemanları sıralayabiliriz.
        int[] list= {6, 1, 55, 21, 33, -321, -21, 2, -11, 27};
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
        // Çıktısı
        // [-321, -21, -11, 1, 2, 6, 21, 27, 33, 55]



        /*   Arrays.binarySearch()   */
        /*  Java'da dizideki bir elemanın indis değerini bulmak
        için binarySearch kullanılabilir.Ama bu metodu kullanabilmek için,
                dizinin sıralı olması gerekmektedir.  */

        int[] ls = {6, 1, 55, 21, 33, -321, -21, 2, -11, 27};

        Arrays.sort(ls);
        System.out.println(Arrays.toString(ls));

        int index = Arrays.binarySearch(ls, 33);
        System.out.println("33'ün indeksi :" + index);

        // [-321, -21, -11, 1, 2, 6, 21, 27, 33, 55]
        // 33'ün indeksi :8




        /*  Arrays.copyOf() ve Arrays.copyOfRange() metotu  */
         /*Mevcut diziden belli bir uzunlukta yeni bir dizi oluşturmak için
         Arrays.copyOf() metotu kullanılır

          Mevcut diziden belli bir aralıkta yeni bir dizi oluşturmak için ise
          Array.copyOfRange() metodu kullanılır.*/


        int[] l = {6, 1, 55, 21, 33, -321, -21, 2, -11, 27};

        int[] copyArray = Arrays.copyOf(l, 3);
        System.out.println(Arrays.toString(copyArray));

        int[] copyOfRangeArray = Arrays.copyOfRange(l, 0,5);
        System.out.println(Arrays.toString(copyOfRangeArray));


        // [6, 1, 55]
        // [6, 1, 55, 21, 33]



         /*        Arrays.equals() metotu
         Java'da iki dizinin eşitliğini kontrol etmek için
         Arrays.equals() metotu kullanılır.*/

        int[] list1 = {1, 2, 3};
        int[] list2 = {1, 2, 3};
        int[] list3 = {1, 2, 10};

        System.out.println(Arrays.equals(list1, list2)); // true
        System.out.println(Arrays.equals(list2, list3)); // false



    }
}
