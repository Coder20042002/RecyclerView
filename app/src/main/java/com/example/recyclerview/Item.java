package com.example.recyclerview;

public class Item {
    String topic;
    String describe;
    int img;

    public Item(String topic, String describe, int img) {
        this.topic = topic;
        this.describe = describe;
        this.img = img;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
