package com.example.franciscoandrade.instagram.pojorandomimage;

import com.example.franciscoandrade.instagram.UnsplashPOJO.Links2;
import com.example.franciscoandrade.instagram.UnsplashPOJO.ProfileImage;

import java.util.Date;

/**
 * Created by franciscoandrade on 1/18/18.
 */

public class User
{
    public String id;
    public Date updated_at;
    public String username;
    public String name;
    public String first_name;
    public String last_name;
    public Object twitter_username;
    public Object portfolio_url;
    public Object bio;
    public Object location;
    public Links2 links;
    public ProfileImage profile_image;
    public int total_likes;
    public int total_photos;
    public int total_collections;

    public String getId() {
        return id;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public String getUsername() {
        return username;
    }

    public String getName() {
        return name;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public Object getTwitter_username() {
        return twitter_username;
    }

    public Object getPortfolio_url() {
        return portfolio_url;
    }

    public Object getBio() {
        return bio;
    }

    public Object getLocation() {
        return location;
    }

    public Links2 getLinks() {
        return links;
    }

    public ProfileImage getProfile_image() {
        return profile_image;
    }

    public int getTotal_likes() {
        return total_likes;
    }

    public int getTotal_photos() {
        return total_photos;
    }

    public int getTotal_collections() {
        return total_collections;
    }
}