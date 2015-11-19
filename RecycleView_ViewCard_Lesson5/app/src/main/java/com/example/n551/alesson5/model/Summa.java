package com.example.n551.alesson5.model;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by N551 on 18.11.2015.
 */
public class Summa {
    private double summa;
    private Date date;
    private String name;

    public Summa(double summa, Date date, String name)
    {
        this.setSumma(summa);
        this.setDate(date);
        this.setName(name);
    }

    public double getSumma() {
        return summa;
    }

    public void setSumma(double summa) {
        this.summa = summa;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
