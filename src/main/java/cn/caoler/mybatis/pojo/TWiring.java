package cn.caoler.mybatis.pojo;

import java.util.Date;

public class TWiring {
    private String start;

    private String destination;

    private Date time;

    private Integer stime;

    private String tClass;

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Integer getStime() {
        return stime;
    }

    public void setStime(Integer stime) {
        this.stime = stime;
    }

    public String gettClass() {
        return tClass;
    }

    public void settClass(String tClass) {
        this.tClass = tClass;
    }
}