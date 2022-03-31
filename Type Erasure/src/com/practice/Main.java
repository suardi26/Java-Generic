package com.practice;
/*
    - Type erasure adalah proses pengecekan generic pada saat compile program, dan menghiraukan pengecekan pada saat program berjalan
      (runtime).
    - Type erasure menjadikan informasi generic yang dibuat akan hilang ketika kode program telah di compile menjadi binary file.
    - Compiler akan mengubah generic parameter type menjadi tipe Object di java.
    - Informasi generic akan hilang ketika sudah menjadi binary file, maka dari itu konversi tipe data generic akan berbahaya jika
      dilakukan secara tidak bijak.
*/
public class Main {
    public static void main(String[] args) {

        Data dataString = new Data<>("Suardi");

        // Melakukan casting dimana Data memiliki nilai String di paksa ke Data dengan generic parameter type Integer dengan melakukan
        // casting.
        Data<Integer> integerData = (Data<Integer>) dataString;
        Integer interValue = integerData.getData(); // pada saat compile aman, namun pada saat runtime akan error.

    }
}
