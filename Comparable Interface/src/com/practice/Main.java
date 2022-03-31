package com.practice;

import com.util.Data;
import com.util.ExComparable;

import java.util.Arrays;
import java.util.Comparator;

/*
    - Ada beberapa interface yang menggunakan generic.

        - Comparable Interface.
          - Sebelumnya kita sudah tahu bahwa operator perbandingan object menggunakan method equals.
          - Untuk operator perbandingan lainnya, seperti kurang dari atau lebih dari, bisa dilakukan ketika sebuah object
            mewarisi interface generic Comparable.
          - interface generic Comparable banyak digunakan seperti proses pengurutan data.
          - Untuk dokumentasi lengkapnya silahkan kunjungi oracle tentang Comparable Interface.

        - Comparator Interface.
          - Pada saat kita ingin mengurutkan class yang kita gunakan, cukup mudah dengan meng-implement interface Comparable.
          - Akan tetapi bagaimana kalau class tersebut milik orang lain? tidak bisa kita ubah, maka kita bisa menggunakan interface
            generic yang bernama Comparator.
          - Jadi Interface Comparator digunakan untuk melakukan pengurutan dimana class-class yang akan dilakukan comparasi
            tidak dapat diubah lagi.
          - Untuk dokumentasi lengkapnya silahkan kunjungi oracle tentang Comparator Interface.
*/
public class Main{
    public static void main(String[] args) {

        // Interface Comparable.
        System.out.println("= = = = = = = Comparable Interface = = = = = = =");

        ExComparable[] list = {
                new ExComparable("Suardi","North Toraja"),
                new ExComparable("Daud","North Toraja"),
                new ExComparable("Manda", "North Toraja")
        };
        // Memanggil method static 'sort' pada class Arrays dimana Comparable menggunakan method 'compareTo()'.
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
        footer();

        // Comparator Interface
        System.out.println("= = = = = = = Comparator Interface = = = = = = =");

        // Misalkan class Data adalah class orang lain sehingga kita tidak dapat mengubahnya.
        // Membuat Anonymous Class.
        Comparator<Data> comparator = new Comparator<Data>() {
            @Override
            public int compare(Data o1, Data o2) {
                return o1.getAddress().compareTo(o2.getAddress());
            }
        };

        Data[] list2 = {
                new Data("Suardi","North Toraja"),
                new Data("Daud","North Toraja"),
                new Data("Manda", "North Toraja")
        };
        Arrays.sort(list2, comparator);
        System.out.println(Arrays.toString(list2));

        footer();
    }
    private static void footer(){
        System.out.println("= = = = = = = = = = = = = = = = = = =");
    }

}
