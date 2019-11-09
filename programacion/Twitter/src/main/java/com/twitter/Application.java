package com.twitter;

import java.io.File;
import twitter4j.Twitter;
import twitter4j.TwitterException;



public class Application {

    public static void main(String[] args) throws TwitterException {
        ServiceTW tw = new ServiceTW();
        tw.test();
        File file = new File("C:\\Users\\hernan\\Pictures\\magic.png");
        tw.updateStats(file, "Al fin una Foto",tw.getInst());
    }      
}
