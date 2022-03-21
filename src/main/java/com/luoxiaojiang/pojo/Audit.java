package com.luoxiaojiang.pojo;

public class Audit {
    private String Oid;
    private String Cid;
    private String Uid;
    private String Audit_uid;
    private String Audit_time;
    private String state;

    public Audit() {
    }

    public Audit(String oid, String cid, String uid, String audit_uid, String audit_time, String state) {
        Oid = oid;
        Cid = cid;
        Uid = uid;
        Audit_uid = audit_uid;
        Audit_time = audit_time;
        this.state = state;
    }

    @Override
    public String toString() {
        return "Audit{" +
                "Oid='" + Oid + '\'' +
                ", Cid='" + Cid + '\'' +
                ", Uid='" + Uid + '\'' +
                ", Audit_uid='" + Audit_uid + '\'' +
                ", Audit_time='" + Audit_time + '\'' +
                ", state='" + state + '\'' +
                '}';
    }

    public String getOid() {
        return Oid;
    }

    public void setOid(String oid) {
        Oid = oid;
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

    public String getAudit_uid() {
        return Audit_uid;
    }

    public void setAudit_uid(String audit_uid) {
        Audit_uid = audit_uid;
    }

    public String getAudit_time() {
        return Audit_time;
    }

    public void setAudit_time(String audit_time) {
        Audit_time = audit_time;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
