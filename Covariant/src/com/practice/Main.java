package com.practice;
/*
    - Covariant artinya kita dapat melakukan substitusi dari subtype(child) ke supertype (parent).
    - Generic object dapat menjadi covariant dengan menggunakan keyword '? extends ParentClass'.
    - Artinya saat kita membuat object misalnya <String>, maka dapat disubstitusi menjadi '<? extends object>'.
    - Covariant adalah read-only, jadi tidak bisa mengubah data genericnya.
*/
public class Main {

    public static void main(String[] args){

        // Melakukan substitusi dari subclass 'String' ke superclass 'Object' (Covariant).
        Data<String> dataString = new Data<>("Suardi");
        convertToSuperclass(dataString);

        Data<? extends Object> dataObject = dataString;
        System.out.println(dataObject.getData());
    }

    // Membuat method dengan parameter dimana Generic parameter type dari turunan class Object, artinya semua class bisa
    // jadi Generic parameter type karena class Object adalah superclass dari semua class di java.
    public static void convertToSuperclass(Data<? extends Object> objectData){

        System.out.println(objectData.getData());

        // Kita dapat memanggil method yang return valuenya adalah generic namun tidak dapat memanggil method
        // yang memiliki parameter type generic.
        // objectData.setData("Daud"); Error karena dapat merubah type data. misalnya ketika kita mengisi nilai integer
        // sedangkan yang akan disubstitusi adalah dari generic parameter type String maka data akan error.
    }
}
