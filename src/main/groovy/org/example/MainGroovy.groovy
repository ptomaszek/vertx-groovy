package org.example


import io.vertx.core.Promise

class MainGroovy {

    static void main(String[] args) {
        Promise p = Promise.promise()
        println p.future() == p.future()
    }
}
