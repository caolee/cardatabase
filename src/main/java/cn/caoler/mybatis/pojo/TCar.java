package cn.caoler.mybatis.pojo;

public class TCar {
    private String tClass;

    private Integer price;

    private Integer max;

    public String gettClass() {
        return tClass;
    }

    public void settClass(String tClass) {
        this.tClass = tClass;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getMax() {
        return max;
    }

    public void setMax(Integer max) {
        this.max = max;
    }

    @Override
    public String toString() {
        return "TCar{" +
                "tClass='" + tClass + '\'' +
                ", price=" + price +
                ", max=" + max +
                '}';
    }

    public TCar(String tClass, Integer price, Integer max) {
        this.tClass = tClass;
        this.price = price;
        this.max = max;
    }

    public TCar() {
    }
}