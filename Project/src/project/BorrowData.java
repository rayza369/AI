/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author BooMBeRRy
 */
public class BorrowData implements java.io.Serializable{
    private String FName;
    private String LName;
    private String Money;
    private String Month;
    private String Interest;
    private String Pay;
    private String Total;
    
    
    public String getFName() {
        return FName;
    }

    public void setFName(String FName) {
        this.FName = FName;
    }
    
     public String getLName() {
        return LName;
    }
    public void setLName(String LName) {
        this.LName = LName;
    }
    
    public String getMoney() {
        return Money;
    }

    
    public void setMoney(String Money) {
        this.Money = Money;
    }
    public void setMonth(String Month) {
        this.Month = Month;
    }
    
     public String getMonth() {
        return Month;
    }
    public String getInterest() {
        return Interest;
    }

    
    public void setInterest(String Interest) {
        this.Interest = Interest;
    }
    
    public String getPay() {
        return Pay;
    }

    
    public void setPay(String Pay) {
        this.Pay = Pay;
    }
     public String getTotal() {
        return Total;
    }

    public void setTotal(String Total) {
        this.Total = Total;
    }
}
