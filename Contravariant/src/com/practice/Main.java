package com.practice;
/*
    - Contravariant maksudnya kita dapat melakukan substitusi dari supertype (parent) ke subtype (child).
    - Generic object dapat menjadi Contravariant dengan menggunakan keyword '? super SubClass'.
    - Artinya Pada saat membuat object Contoh <Object>, maka dapat disubstitusi menjadi contoh <? super String>.
    - Contravariant adalah dapat melakukan Write dan Read data genericnya, namun perlu berhati-hati ketika melakukan read,
      terutama jika sampai parent classnya mempunyai banyak child class.

    - Covariant read datanya aman namun write datanya berbahaya (dapat menimbulkan error) sedangkan Contravariant write datanya
      aman namun read datanya harus berhati-hati bisa saja menyebabkan error. Contohnya :

        - Ketika kita membuat sebuah method dengan parameter generic type '(Data<? super String> objectData)' artinya
          class apa saja yang super dari class String, sehingga dapat membaca nilai/ read suatu data dengan malakukan casting
          variabel ke String, namun ketika membuat sebuah object dari class object dengan nilai Integer dapat dilakukan karena
          class Integer adalah turunan dari class object, namun yang jadi masalah pada saat runtime ketika method dipanggil
          dan nilai dari sebuah method tersebut sudah di casting ke String sedangkan nilai yang akan di substitusi adalah integer.
          sehingga dapat mengakibatkan error, untuk itu dalam melakukan read data pada covariant harus berhati-hati.
*/
public class Main {
    public static void main(String[] args) {

    // Melakukan substitusi dari superclass 'Object' ke subclass 'String' (Contravariant).
    Data<Object> dataObject = new Data<>("Suardi");
    Data<? super String> dataString = dataObject;
    System.out.println(dataString.getData());

    convertToSubClass(dataObject);

    }

    // Membuat method dengan parameter dimana Generic parameter type Superclass dari String.
    public static void convertToSubClass(Data<? super String> objectData){

        // Menulis data Generic (Contravariant)
        objectData.setData("Daud");

        // Membaca data Generic (Contravariant)
        System.out.println(objectData.getData());

    }
}
