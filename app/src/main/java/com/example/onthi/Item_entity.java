package com.example.onthi;

public class Item_entity {
    private String ten;
    private String duong;
    private  int ima;

    public Item_entity(String ten, String duong, int ima) {
        this.ten = ten;
        this.duong = duong;
        this.ima = ima;
    }

    public Item_entity() {
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDuong() {
        return duong;
    }

    public void setDuong(String duong) {
        this.duong = duong;
    }

    public int getIma() {
        return ima;
    }

    public void setIma(int ima) {
        this.ima = ima;
    }
}
