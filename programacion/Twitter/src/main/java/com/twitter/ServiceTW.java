/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.twitter;

import java.io.File;
import java.util.logging.Level;
import twitter4j.*;
import twitter4j.conf.ConfigurationBuilder;

/**
 *
 * @author hernan
 */
public class ServiceTW {
Twitter twitter;
    public void test() throws TwitterException {
        String userAccount = "mascotas perdidas";
        

        ConfigurationBuilder cb = new ConfigurationBuilder();

        cb.setDebugEnabled(true)
                .setOAuthConsumerKey("jXIluvBNqBpo4pYzgVWbtcBA2")
                .setOAuthConsumerSecret("E0AWgFePIzhmXyS8W73nR22yzEFZtIAoO5QPLs6mOWPGMRdcg2")
                .setOAuthAccessToken("1180548411780747264-nmGrGuPdC1N66UiHNUfWY3pEu1lAoX")
                .setOAuthAccessTokenSecret("YjcHSRlp4hQgQ0Pzk98G4F1u6woLfxHjAVQ7jDycNf5aZ");

        TwitterFactory tf = new TwitterFactory(cb.build());
        twitter = tf.getInstance();



    }
    public void updateStats(File file,String text,Twitter twitter){
        try {
            
            StatusUpdate status = new StatusUpdate(text);
            status.setMedia(file);
            twitter.updateStatus(status);
        } catch (TwitterException ex) {
            java.util.logging.Logger.getLogger(Application.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public Twitter getInst(){
        return this.twitter;
    }
    
}
