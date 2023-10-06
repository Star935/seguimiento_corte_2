package Parcial.SegundoProblema.Dto;

import java.io.Serializable;

public class Toys_Dto implements Serializable {
        private Integer id;
        private String toyName;
        private String toyCategory;
        private Double price;
        private Integer amount;

    public Toys_Dto(Integer id, String toyName, String toyCategory, Double price, Integer amount) {
        this.id = id;
        this.toyName = toyName;
        this.toyCategory = toyCategory;
        this.price = price;
        this.amount = amount;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getToyName() {
        return toyName;
    }

    public void setToyName(String toyName) {
        this.toyName = toyName;
    }

    public String getToyCategory() {
        return toyCategory;
    }

    public void setToyCategory(String toyCategory) {
        this.toyCategory = toyCategory;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Toy:" +
                "\n Id=" + id +
                "\n Name of the toy=" + toyName +
                "\n Category of the toy=" + toyCategory +
                "\n Price=" + price +
                "\n Amount=" + amount;
    }
}
