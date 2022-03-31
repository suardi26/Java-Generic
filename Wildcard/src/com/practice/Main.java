package com.practice;
/*
    - Wildcard digunakan pada saat kita ingin print data T, dan tidak peduli generic parameter type apapun baik String, Integer, dll.
    - WIldcard bisa dibuat dengan mengganti generic parameter type dengan karakter '?'.
    - Wildcard digunakan pada saat menerima data ataupun menampilkan data tanpa harus mengkonversi data ke tipe data tertentu.
*/

public class Main {
    public static void main(String[] args) {
        printData(new Data<>("Suardi"));
        printData(new Data<>("Daud"));
        printData(new Data<>("Manda"));
        printData(new Data<>(26));
        printData(new Data<MultipleBoundedTypeParameter.Manager>(new MultipleBoundedTypeParameter.Manager()));
    }

    // Wildcard
    public static void printData(Data<?> data){
        System.out.println(data.getData());

    }
}
