package com.practice;
/*
    - Secara default, saat membuat generic parameter type, sifat parameter tersebut adalah invariant.
    - Invariant artinya tidak boleh ada substitusi dengan subtype(child) atau supertype(parent).
    - Polymorphism tidak berlaku pada Generic Parameter type contohnya class object superclass dari class String,
      artinya variabel reference misalnya dari class Object dan pembuatan Objectnya dari class String itu adalah polymorphism
      yang dapat terjadi pada inheritance/turunan sebuah class, akan tetapi pada Generic parameter type tidak dapat terjadi
      polymorphisme baik itu substitusi object dari superclass ke subclass ataupun dari subclass ke superclass.
*/
public class Main {
    public static void main(String[] args) {

        // Contoh Polymorphism.
        Object makn = new String();

        // Melakukan substitusi dari subclass 'String' ke superclass 'Object' (Polymorphism) dan akan terjadi error (Invariant).
        Data<String> dataString = new Data<>("Suardi");
        // convertToSuperclass(dataString); error (Invariant)!!!
        // Data<Object> dataObject = dataString; error (Invariant)!!!

        // Melakukan substitusi dari superclass 'Object' ke subclass 'String' (Polymorphism) dan akan terjadi error (Invariant).
        Data<Object> dataObject = new Data<>(19999);
        // Data<Integer> dataInteger = dataObject; error (Invariant)!!!
        // convertToSubclass(dataObject); error (Invariant)!!!

    }

    public static void convertToSuperclass(Data<Object> objectData){

        System.out.println(objectData.getData());
    }

    public static void convertToSubclass(Data<Integer> intData){

        System.out.println(intData.getData());
    }
}
