package com.practice;

public class Data {

    // Membuat generic parameter type pada sebuah method (Generic Method)
    public static <T> int count(T[] product){

        return product.length;
    }

    public <T,U> String products(T idProduct, U nameOfProduct){

        String result = "[Id Product = "+idProduct+", Nama Product = "+nameOfProduct+".]";
        return  result;
    }
}
