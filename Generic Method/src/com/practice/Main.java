package com.practice;
/*
    - Generic parameter type tidak hanya bisa digunakan pada class atau interface, namun bisa juga pada sebuah method.
    - Generic parameter type yang dideklarasikan pada sebuah method, hanya dapat diakses pada method tersebut, namun tidak dapat
      diakses diluar method.
    - Membuat Generic method sangat cocok digunakan ketika tanpa harus mengubah deklarasi sebuah class.
*/
public class Main {
    public static void main(String[] args) {

        // Memanggil method Generic bisa dengan menggunakan Generic parameter type sebelum nama methodnya seperti '<Integer,String>'
        // ataupun tidak menggunakan Generic parameter type (Opsional).
        Data data1 = new Data();
        String r1 = data1.<Integer,String>products(100,"Dettol");

        Data data2 = new Data();
        String r2 = data2.products(101,"Rinso");

        Data data3 = new Data();
        String r3 = data3.products(102,"Pepsodent");

        String[] resultProducts = {r1,r2,r3};
        for (String resultProduct : resultProducts) {
            System.out.println(resultProduct);
        }

        // Memanggil method static dengan Generic parameter type.
        System.out.println("Jumlah Data Product "+Data.<String>count(resultProducts));

    }
}
