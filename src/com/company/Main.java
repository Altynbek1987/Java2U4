package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Запуск потока " + Thread.currentThread().getName());
        try{
            for (int i = 1; i < 6; i++) {                //В месте i заменить 1
                MyThread th = new MyThread("Поток " + i);
                th.setPriority(i);
                th.start();
                th.join();
            }
        }catch (Exception e){
            System.out.println("Завершение потока " + Thread.currentThread().getName());
        }

    }
}
