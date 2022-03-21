package com.luoxiaojiang.pojo;

import java.util.Collection;

public class Choosecourse {
    private String Uid;
    private String Cid;
    private int Study;
    private int Collection;
    private int Praise;
    private String Study_state;
    private String Buy_time;
    private String Collection_time;
    private String Praise_time;

    public Choosecourse() {
    }

    public Choosecourse(String uid, String cid, int study, int collection, int praise, String study_state, String buy_time, String collection_time, String praise_time) {
        Uid = uid;
        Cid = cid;
        Study = study;
        Collection = collection;
        Praise = praise;
        Study_state = study_state;
        Buy_time = buy_time;
        Collection_time = collection_time;
        Praise_time = praise_time;
    }

    @Override
    public String toString() {
        return "Choosecourse{" +
                "Uid='" + Uid + '\'' +
                ", Cid='" + Cid + '\'' +
                ", Study=" + Study +
                ", Collection=" + Collection +
                ", Praise=" + Praise +
                ", Study_state='" + Study_state + '\'' +
                ", Buy_time='" + Buy_time + '\'' +
                ", Collection_time='" + Collection_time + '\'' +
                ", Praise_time='" + Praise_time + '\'' +
                '}';
    }

    public String getUid() {
        return Uid;
    }

    public void setUid(String uid) {
        Uid = uid;
    }

    public String getCid() {
        return Cid;
    }

    public void setCid(String cid) {
        Cid = cid;
    }

    public int getStudy() {
        return Study;
    }

    public void setStudy(int study) {
        Study = study;
    }

    public int getCollection() {
        return Collection;
    }

    public void setCollection(int collection) {
        Collection = collection;
    }

    public int getPraise() {
        return Praise;
    }

    public void setPraise(int praise) {
        Praise = praise;
    }

    public String getStudy_state() {
        return Study_state;
    }

    public void setStudy_state(String study_state) {
        Study_state = study_state;
    }

    public String getBuy_time() {
        return Buy_time;
    }

    public void setBuy_time(String buy_time) {
        Buy_time = buy_time;
    }

    public String getCollection_time() {
        return Collection_time;
    }

    public void setCollection_time(String collection_time) {
        Collection_time = collection_time;
    }

    public String getPraise_time() {
        return Praise_time;
    }

    public void setPraise_time(String praise_time) {
        Praise_time = praise_time;
    }
}
