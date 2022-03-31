package com.practice;
/*
    - Pada saat kita ingin membatasi type data yang boleh digunakan pada generic parameter type, kita dapat menambahkan constraint
      di generic parameter type dengan menyebutkan tipe data yang diperbolehkan digunakan.
    - Secara otomatis, type data yang bisa digunakan adalah type data yang sudah disebutkan atau class-class turunannya.
    - Dan secara default, Constraint type untuk generic parameter type adalah Object, sehingga semua tipe data bisa digunakan
      sebab semua class di java turunan dari class object.
    - Bounded Type Parameter dapat diterapkan dengan keyword 'T extends nameOfClass';

    - Multiple Bounded Type Parameter
        - Kita bisa menambahkan beberapa bounded type parameter dengan karakter '&' setelah bounded type pertama.
        - Jika ingin menambahkan lebih banyak constraint lagi, dapat gunakan karakter '&' diikuti bounded typenya lagi.
        - Namun hanya boleh ada satu bounded type parameter yang dari class setelah itu harus interface.
            contohnya : <T extends nameOfClass & NameOfInterface1 & NameOfInterface2 & ...>

        - Misalnnya kita ingin membuat Generic parameter type dimana yang mengisi parameter tersebut adalah class yang memiliki lebih dari satu
          constraint misalnya  Generic parameter type memiliki constraint dari sebuah class 'Employee' yang dibuat sendiri beserta turunannya dan
          memiliki constraint lain dengan mengimplementasi interface 'SayHello' yang dibuat sendiri sehingga Generic parameter type diisi oleh
          class 'Employee' beserta turunannya dan interface 'SayHello'.

                Contoh  Pembuatan class VicePresident : 'public static class VicePresident extends Employee implements SayHello'.
                Contoh  Pembuatan class Informations : 'public static class Informations<T extends Employee & SayHello>'.
                Contoh  Pembuatan Object : 'Informations<VicePresident> dataVicePresident2 = new Informations<>(new VicePresident());'.





*/
public class Main {

    public static void main(String[] args){

        // Membuat object dari class Data dengan generic parameter type bertipe data Integer, dimana class Integer
        // turunan dari class Number.
        Data<Integer>dataInteger = new Data<>(101);
        System.out.println(dataInteger.getData());

        // Membuat object dari class Data dengan generic parameter type bertipe data Long, dimana class Long
        // turunan dari class Number.
        Data<Long>dataLong = new Data<>(10101010101010L);
        System.out.println(dataLong.getData());


        // Tidak dapat membuat variabel reference serta pembuatan object dari Generic parameter type bertipe String karena
        // Generic parameter type dari class Data itu adalah extends class Number artinya class yang dapat
        // digunakan untuk Generic parameter type adalah class Number dan turunananya.
        //Data<String> stringData = new Data<String>("Suardi"); ERROR.

    }

}
