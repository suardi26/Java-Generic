package com.practice;

public class MultipleBoundedTypeParameter<T extends Number> {
    public static void main(String[] args) {
        // Bounded Type Parameter
        Data<Manager> dataManager1 = new Data<>(new Manager());
        Data<VicePresident> dataVicePresident1 = new Data<>(new VicePresident());

        // Multiple Bounded Type Parameter
        // Informations<Manager> dataManager2 = new Informations<>(new Manager()); ERROR karena class 'Manager' tidak implement interface sayHello.

        // Tidak error karena class 'VicePresident' meng-implement interface sayHello.
        Informations<VicePresident> dataVicePresident2 = new Informations<>(new VicePresident());
    }

    public static interface SayHello {
        void hello(String name);
    }

    public static abstract class Employee {

    }

    public static class Manager extends Employee {

    }

    public static class VicePresident extends Employee implements SayHello {

        @Override
        public void hello(String name) {
            System.out.println("Hello "+name);
        }
    }

    public static class Data <T extends Employee> {
        private T data;

        public Data(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }
    }

    public static class Informations<T extends Employee & SayHello>{
        private T information;

        public Informations(T information) {
            this.information = information;
        }

        public T getData() {
            return information;
        }

        public void setData(T information) {
            this.information = information;
        }


    }

}
