package com.luoxiaojiang.pojo;

public class Course {
    private String Cid;
    private String Uid;
    private String Send_time;
    private String Name;
    private String Type_a;
    private String Type_b;
    private String Img_a;
    private String Img_b;
    private String Img_c;
    private String Introduce;
    private String Study_time;
    private int Study_length;
    private String Study_place;
    private int Limit_num;
    private int Praise_num;
    private int Collection_num;
    private int Buy_num;
    private int Course_money;
    private String Course_state;

    public Course() {
    }

    public Course(String cid, String uid, String send_time, String name, String type_a, String type_b, String img_a, String img_b, String img_c, String introduce, String study_time, int study_length, String study_place, int limit_num, int praise_num, int collection_num, int buy_num, int course_money, String course_state) {
        Cid = cid;
        Uid = uid;
        Send_time = send_time;
        Name = name;
        Type_a = type_a;
        Type_b = type_b;
        Img_a = img_a;
        Img_b = img_b;
        Img_c = img_c;
        Introduce = introduce;
        Study_time = study_time;
        Study_length = study_length;
        Study_place = study_place;
        Limit_num = limit_num;
        Praise_num = praise_num;
        Collection_num = collection_num;
        Buy_num = buy_num;
        Course_money = course_money;
        Course_state = course_state;
    }

    @Override
    public String toString() {
        return "Course{" +
                "Cid='" + Cid + '\'' +
                ", Uid='" + Uid + '\'' +
                ", Send_time='" + Send_time + '\'' +
                ", Name='" + Name + '\'' +
                ", Type_a='" + Type_a + '\'' +
                ", Type_b='" + Type_b + '\'' +
                ", Img_a='" + Img_a + '\'' +
                ", Img_b='" + Img_b + '\'' +
                ", Img_c='" + Img_c + '\'' +
                ", Introduce='" + Introduce + '\'' +
                ", Study_time='" + Study_time + '\'' +
                ", Study_length=" + Study_length +
                ", Study_place='" + Study_place + '\'' +
                ", Limit_num=" + Limit_num +
                ", Praise_num=" + Praise_num +
                ", Collection_num=" + Collection_num +
                ", Buy_num=" + Buy_num +
                ", Course_money=" + Course_money +
                ", Course_state='" + Course_state + '\'' +
                '}';
    }

    public String getCid() {
        return Cid;
    }

    public void setCid(String cid) {
        Cid = cid;
    }

    public String getUid() {
        return Uid;
    }

    public void setUid(String uid) {
        Uid = uid;
    }

    public String getSend_time() {
        return Send_time;
    }

    public void setSend_time(String send_time) {
        Send_time = send_time;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getType_a() {
        return Type_a;
    }

    public void setType_a(String type_a) {
        Type_a = type_a;
    }

    public String getType_b() {
        return Type_b;
    }

    public void setType_b(String type_b) {
        Type_b = type_b;
    }

    public String getImg_a() {
        return Img_a;
    }

    public void setImg_a(String img_a) {
        Img_a = img_a;
    }

    public String getImg_b() {
        return Img_b;
    }

    public void setImg_b(String img_b) {
        Img_b = img_b;
    }

    public String getImg_c() {
        return Img_c;
    }

    public void setImg_c(String img_c) {
        Img_c = img_c;
    }

    public String getIntroduce() {
        return Introduce;
    }

    public void setIntroduce(String introduce) {
        Introduce = introduce;
    }

    public String getStudy_time() {
        return Study_time;
    }

    public void setStudy_time(String study_time) {
        Study_time = study_time;
    }

    public int getStudy_length() {
        return Study_length;
    }

    public void setStudy_length(int study_length) {
        Study_length = study_length;
    }

    public String getStudy_place() {
        return Study_place;
    }

    public void setStudy_place(String study_place) {
        Study_place = study_place;
    }

    public int getLimit_num() {
        return Limit_num;
    }

    public void setLimit_num(int limit_num) {
        Limit_num = limit_num;
    }

    public int getPraise_num() {
        return Praise_num;
    }

    public void setPraise_num(int praise_num) {
        Praise_num = praise_num;
    }

    public int getCollection_num() {
        return Collection_num;
    }

    public void setCollection_num(int collection_num) {
        Collection_num = collection_num;
    }

    public int getBuy_num() {
        return Buy_num;
    }

    public void setBuy_num(int buy_num) {
        Buy_num = buy_num;
    }

    public int getCourse_money() {
        return Course_money;
    }

    public void setCourse_money(int course_money) {
        Course_money = course_money;
    }

    public String getCourse_state() {
        return Course_state;
    }

    public void setCourse_state(String course_state) {
        Course_state = course_state;
    }
}
