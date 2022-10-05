package com.starkcreativity.recyclerviewjava.Models;

// model class is use to make getter setter so we can assign values easily when we are using recycler view
public class NatureModel {
    int pic;
    String text;

    public  NatureModel(int pic, String text){
        this.pic = pic;
        this.text = text;
    }

    public int getPic() {
        return pic;
    }

    public void setPic(int pic) {
        this.pic = pic;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
