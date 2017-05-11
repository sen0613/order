package kr.re.kitri.model;


import java.time.LocalDate;

/**
 * Created by danawacomputer on 2017-05-11.
 */
public class Order {


    public Order(Integer custId, String username, String address, String email, LocalDate orderDate, String prdName) {
        this.custId = custId;
        this.username = username;
        this.address = address;
        this.email = email;
        this.orderDate = orderDate;
        this.prdName = prdName;
    }
    private Integer custId;
    private String username;
    private String address;
    private String email;
    private LocalDate orderDate;
    private String prdName;

    public Integer getCustId() {
        return custId;
    }

    public void setCustId(Integer custId) {
        this.custId = custId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public String getPrdName() {
        return prdName;
    }

    public void setPrdName(String prdName) {
        this.prdName = prdName;
    }

    @Override
    public String toString() {
        return "Order{" +
                "custId=" + custId +
                ", username='" + username + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", orderDate=" + orderDate +
                ", prdName='" + prdName + '\'' +
                '}';
    }
}