package com.example.retriveimg;

public class Product {

    private int pid;
    private int did;
    private String Title;
    private String Description;

    private String imageurl;

    public Product(int pid, int did, String title, String description, String imageurl) {
        this.pid = pid;
        this.did = did;
        Title = title;
        Description = description;
        this.imageurl = imageurl;
    }

    public int getPid() {
        return pid;
    }

    public int getDid() {
        return did;
    }

    public String getTitle() {
        return Title;
    }

    public String getDescription() {
        return Description;
    }

    public String getImageurl() {
        return imageurl;
    }

}
