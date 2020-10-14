package org.example;


import io.vertx.core.Promise;

class MainJava {

    public static void main(String[] args) {
        Promise p = Promise.promise();
        System.out.println(p.future() == p.future());
    }
}
