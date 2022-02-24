package com.example.deskproject;

public class ModeClass2 {
    int thumbNail_image;
    String title_text,channel_name;

    public ModeClass2(int thumbNail_image, String title_text, String channel_name) {
        this.thumbNail_image = thumbNail_image;
        this.title_text = title_text;
        this.channel_name = channel_name;
    }

    @Override
    public String toString() {
        return "ModeClass2{" +
                "thumbNail_image=" + thumbNail_image +
                ", title_text='" + title_text + '\'' +
                ", channel_name='" + channel_name + '\'' +
                '}';
    }

    public int getThumbNail_image() {
        return thumbNail_image;
    }

    public void setThumbNail_image(int thumbNail_image) {
        this.thumbNail_image = thumbNail_image;
    }

    public String getTitle_text() {
        return title_text;
    }

    public void setTitle_text(String title_text) {
        this.title_text = title_text;
    }

    public String getChannel_name() {
        return channel_name;
    }

    public void setChannel_name(String channel_name) {
        this.channel_name = channel_name;
    }
}
