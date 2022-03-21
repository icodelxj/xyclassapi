package com.luoxiaojiang.pojo;

public class Order {
    private String Oid;
    private String Uid;
    private String Cid;
    private String Buy_time;
    private int Buy_money;
    private String state;

    public Order() {
    }

    public Order(String oid, String uid, String cid, String buy_time, int buy_money, String state) {
        Oid = oid;
        Uid = uid;
        Cid = cid;
        Buy_time = buy_time;
        Buy_money = buy_money;
        this.state = state;
    }

    @Override
    public String toString() {
        return "Order{" +
                "Oid='" + Oid + '\'' +
                ", Uid='" + Uid + '\'' +
                ", Cid='" + Cid + '\'' +
                ", Buy_time='" + Buy_time + '\'' +
                ", Buy_money=" + Buy_money +
                ", state='" + state + '\'' +
                '}';
    }

    public String getOid() {
        return Oid;
    }

    public void setOid(String oid) {
        Oid = oid;
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

    public String getBuy_time() {
        return Buy_time;
    }

    public void setBuy_time(String buy_time) {
        Buy_time = buy_time;
    }

    public int getBuy_money() {
        return Buy_money;
    }

    public void setBuy_money(int buy_money) {
        Buy_money = buy_money;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
