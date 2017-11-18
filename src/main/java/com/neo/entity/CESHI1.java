package com.neo.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Administrator on 2017/11/18.
 */
@Entity
public class CESHI1 {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;


    @Column(nullable = false)
    private Date shijian;

    @Column(nullable = false)
    private String wendu;

    @Column(nullable = false)
    private int yali;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getShijian() {
        return shijian;
    }

    public void setShijian(Date shijian) {
        this.shijian = shijian;
    }

    public String getWendu() {
        return wendu;
    }

    public void setWendu(String wendu) {
        this.wendu = wendu;
    }

    public int getYali() {
        return yali;
    }

    public void setYali(int yali) {
        this.yali = yali;
    }
}
