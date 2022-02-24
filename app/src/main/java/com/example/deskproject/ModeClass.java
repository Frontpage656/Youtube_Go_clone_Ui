package com.example.deskproject;

public class ModeClass {

    int thumbNail,channelLogo;
    String channel_name,description,details;

    public ModeClass(int thumbNail, int channelLogo, String channel_name, String description, String details) {
        this.thumbNail = thumbNail;
        this.channelLogo = channelLogo;
        this.channel_name = channel_name;
        this.description = description;
        this.details = details;
    }

    @Override
    public String toString() {
        return "ModeClass{" +
                "thumbNail=" + thumbNail +
                ", channelLogo=" + channelLogo +
                ", channel_name='" + channel_name + '\'' +
                ", description='" + description + '\'' +
                ", details='" + details + '\'' +
                '}';
    }

    public int getThumbNail() {
        return thumbNail;
    }

    public void setThumbNail(int thumbNail) {
        this.thumbNail = thumbNail;
    }

    public int getChannelLogo() {
        return channelLogo;
    }

    public void setChannelLogo(int channelLogo) {
        this.channelLogo = channelLogo;
    }

    public String getChannel_name() {
        return channel_name;
    }

    public void setChannel_name(String channel_name) {
        this.channel_name = channel_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
