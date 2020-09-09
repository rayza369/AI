/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author USER
 */
public class LoanTable implements java.io.Serializable{
    private String Month;
    private String Detail;
    private Double MRR;
    private Double MLR;
    private Double MOR;

    /**
     * @return the Month
     */
    public String getMonth() {
        return Month;
    }
    /**
     * @param Month the Month to set
     */
    public void setMonth(String Month) {
        this.Month = Month;
    }
    public String getDetail() {
        return Detail;
    }
    /**
     * @param Detail the Month to set
     */
    public void setDetail(String Detail) {
        this.Detail = Detail;
    }
    /**
     * @return the MRR
     */
    public Double getMRR() {
        return MRR;
    }

    /**
     * @param MRR the MRR to set
     */
    public void setMRR(Double MRR) {
        this.MRR = MRR;
    }

    /**
     * @return the MLR
     */
    public Double getMLR() {
        return MLR;
    }

    /**
     * @param MLR the MLR to set
     */
    public void setMLR(Double MLR) {
        this.MLR = MLR;
    }

    /**
     * @return the MOR
     */
    public Double getMOR() {
        return MOR;
    }

    /**
     * @param MOR the MOR to set
     */
    public void setMOR(Double MOR) {
        this.MOR = MOR;
    }
    
}
