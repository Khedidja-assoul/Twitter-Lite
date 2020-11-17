package com.example.tweet;

import com.example.tweet.Tweet;
import com.example.tweet.User;
import com.example.tweet.R;

import java.text.ParseException;
import java.util.ArrayList;


public class ServiceTweet {

    private ArrayList<Tweet> myData = new ArrayList<>();
    private ArrayList<User> myUsers = new ArrayList<>();

    public ServiceTweet() throws ParseException {
       initialisation();
    }

    public ArrayList<Tweet> getMesDonnees(){
        return myData;
    }

    public ArrayList<User> getUsers(){
        return myUsers;
    }

    public void setNewTweet(Tweet tweet){

            myData.add(tweet);

    }

    public void initialisation() throws ParseException {

        User user1 = new User(1,"ASSOUL","Khedidja", R.drawable.planet1);
        User user2 = new User(2,"FARES","Salsabil", R.drawable.planet2);

        myUsers.add(user1);
        myUsers.add(user2);


        String date = "Sat Sep 19 21:58:00 EET 2020";

        /* ************************************************************************************** */
        Tweet tweet = new Tweet(1,"This is my first tweet !",date,1);
        myData.add(tweet);

        tweet = new Tweet(2,"This is my first tweet either :) !",date,2);
        myData.add(tweet);

        tweet = new Tweet(3,"We are going back to school!!",date,2);
        myData.add(tweet);



    }

}
