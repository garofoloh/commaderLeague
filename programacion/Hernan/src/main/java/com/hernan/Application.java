/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hernan;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import twitter4j.TwitterException;

@SpringBootApplication
public class Application {

    public static void main(String[] args) throws TwitterException {
        Servicio sv = new Servicio();
        sv.test();
    }
}

