package com.luoxiaojiang.pojo;

public class User {
    private String Uid;
    private String Name;
    private String Image;
    private String Sex;
    private String School;
    private String Telephone;
    private String Real_name;
    private String Style;
    private String Add_time;
    private String Type;
    private int Money;

    public User() {
    }

    public User(String uid, String name, String image, String sex, String school, String telephone, String realName, String style, String add_time, String type, int money) {
        Uid = uid;
        Name = name;
        Image = image;
        Sex = sex;
        School = school;
        Telephone = telephone;
        Real_name = realName;
        Style = style;
        Add_time = add_time;
        Type = type;
        Money = money;
    }

    @Override
    public String toString() {
        return "User{" +
                "Uid='" + Uid + '\'' +
                ", Name='" + Name + '\'' +
                ", Image='" + Image + '\'' +
                ", Sex='" + Sex + '\'' +
                ", School='" + School + '\'' +
                ", Telephone='" + Telephone + '\'' +
                ", RealName='" + Real_name + '\'' +
                ", Style='" + Style + '\'' +
                ", Add_time='" + Add_time + '\'' +
                ", Type='" + Type + '\'' +
                ", Money=" + Money +
                '}';
    }

    public String getUid() {
        return Uid;
    }

    public void setUid(String uid) {
        Uid = uid;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String sex) {
        Sex = sex;
    }

    public String getSchool() {
        return School;
    }

    public void setSchool(String school) {
        School = school;
    }

    public String getTelephone() {
        return Telephone;
    }

    public void setTelephone(String telephone) {
        Telephone = telephone;
    }

    public String getRealName() {
        return Real_name;
    }

    public void setRealName(String realName) {
        Real_name = realName;
    }

    public String getStyle() {
        return Style;
    }

    public void setStyle(String style) {
        Style = style;
    }

    public String getAdd_time() {
        return Add_time;
    }

    public void setAdd_time(String add_time) {
        Add_time = add_time;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public int getMoney() {
        return Money;
    }

    public void setMoney(int money) {
        Money = money;
    }
}

