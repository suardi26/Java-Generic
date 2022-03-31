package com.practice;
/*
    - Generic class adalah class atau interface yang menggunakan parameter type namun tidak dapat digunakan pada Enum.
    - Pada Pembuatan Generic parameter Type tidak ada ketentuan, tapi biasanya orang menggunakan 1 karakter sebagai generic
      parameter type.
    - Berikut nama generic parameter type yang biasa digunakan (tidak wajib) :
        - E = Element (Biasanya digunakan di collection atau struktur data).
        - N = Key.
        - V = Value.
        - N = Number.
        - T = Type.
        - V = Value.
        - S, U, dll.

    - Multiple Parameter Type.
        - Parameter type di Generic class boleh lebih dari 1, tapi harus menggunakan nama type berbeda.
        - Multiple Parameter Type sangat berguna pada saat kita ingin membuat generic parameter type yang banyak.
*/
public class Main {
    public static void main(String[] args){

        Data<String> stringData1 = new Data<String>("Suardi");

        // Ketika membuat data yang number, harus tipe data object bukan tipe data primitif misalnya : 'Integer' bukan 'int'.
        // Membuat object bisa tanpa menambahkan Generic parameter type (opsional) namun wajib menambahkan
        // Generic parameter type sebelum variabel reference.
        Data<Integer> intData1 = new Data<>(1);

        String valueOfString = stringData1.getData();
        Integer valueOfInt = intData1.getData();

        System.out.println(valueOfString);
        System.out.println(valueOfInt);

        // Membuat object dengan multiple parameter type.
        Equals<Integer,Integer> intData2 = new Equals<Integer,Integer>(5,10);
        if (intData2.getFirst() == intData2.getSecond()){
            System.out.println(intData2.getFirst()+" sama dengan "+intData2.getSecond());
        }else if (intData2.getFirst() > intData2.getSecond()){
            System.out.println(intData2.getFirst()+" Lebih Besar dari "+intData2.getSecond());
        }else{
            System.out.println(intData2.getSecond()+" Lebih Besar dari "+intData2.getFirst());
        }

        Equals<String,String> product = new Equals<String,String>("Toyota","Avanza");
        System.out.println("Mobil "+product.getFirst()+" "+product.getSecond()+".");

        // Membuat object dengan multiple parameter type yang satu tipe Data String dan yang satu tipe data Integer.
        Equals<Integer,String> dataOfProduct = new Equals<Integer, String>(1999, "Seribu Sembilan Ratus Sembilan Puluh Sembilan.");
        System.out.println(dataOfProduct.getFirst()+" = "+dataOfProduct.getSecond());
    }
}
