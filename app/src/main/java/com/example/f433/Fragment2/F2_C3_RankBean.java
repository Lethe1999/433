package com.example.f433.Fragment2;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

import java.io.Serializable;

public class F2_C3_RankBean implements Serializable {
    public String rank;         //  排名
    public Drawable logo;         //  队徽
    public String name;         //  队名
    public String turn;         //  轮次
    public String num1;         //  胜局
    public String num2;         //  平局
    public String num3;         //  负局
    public String rate;         //  进/失球
    public String points;       //  积分

    public F2_C3_RankBean() {
    }

    public F2_C3_RankBean(String rank, Drawable img, String name, String turn, String num1,
                          String num2, String num3, String rate, String points) {
        this.rank = rank;
        this.logo = img;
        this.name = name;
        this.turn = turn;
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        this.rate = rate;
        this.points = points;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getRank() {
        return rank;
    }

    public void setLogo(Drawable logo) {
        this.logo = logo;
    }

    public Drawable getLogo() {
        return logo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setTurn(String turn) {
        this.turn = turn;
    }

    public String getTurn() {
        return turn;
    }

    public void setNum1(String num1) {
        this.num1 = num1;
    }

    public String getNum1() {
        return num1;
    }

    public void setNum2(String num2) {
        this.num2 = num2;
    }

    public String getNum2() {
        return num2;
    }

    public void setNum3(String num3) {
        this.num3 = num3;
    }

    public String getNum3() {
        return num3;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getRate() {
        return rate;
    }

    public void setPoints(String points) {
        this.points = points;
    }

    public String getPoints() {
        return points;
    }

    @Override
    public String toString() {
        return "F2_C3_RankBean{" +
                "rank='" + rank + '\'' +
                "imgPath='" + logo + '\'' +
                "name='" + name + '\'' +
                "turn='" + turn + '\'' +
                "num1='" + num1 + '\'' +
                "num2='" + num2 + '\'' +
                "num3='" + num3 + '\'' +
                "rate='" + rate + '\'' +
                "points='" + points + '\'' +
                '}';
    }
}
