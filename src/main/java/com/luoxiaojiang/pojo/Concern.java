package com.luoxiaojiang.pojo;

public class Concern {
    private String Concern_a;
    private String Concern_b;
    private String Concern_time;

    public Concern() {
    }

    public Concern(String concern_a, String concern_b, String concern_time) {
        Concern_a = concern_a;
        Concern_b = concern_b;
        Concern_time = concern_time;
    }

    @Override
    public String toString() {
        return "Concern{" +
                "Concern_a='" + Concern_a + '\'' +
                ", Concern_b='" + Concern_b + '\'' +
                ", Concern_time='" + Concern_time + '\'' +
                '}';
    }

    public String getConcern_a() {
        return Concern_a;
    }

    public void setConcern_a(String concern_a) {
        Concern_a = concern_a;
    }

    public String getConcern_b() {
        return Concern_b;
    }

    public void setConcern_b(String concern_b) {
        Concern_b = concern_b;
    }

    public String getConcern_time() {
        return Concern_time;
    }

    public void setConcern_time(String concern_time) {
        Concern_time = concern_time;
    }
}
