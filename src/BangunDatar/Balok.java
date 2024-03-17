/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangunDatar;

/**
 *
 * @author HP
 */
public class Balok implements OperasiBidang {
    private double pjg, lbr, tggi;
    
    public Balok(double pjg, double lbr, double tggi){
        this.pjg = pjg;
        this.lbr = lbr;
        this.tggi = tggi;
    }
    
    public double getPanjang(){
        return pjg;
    }
    
    public void setPanjang(double pjg){
        this.pjg = pjg;
    }
    
    public double getLebar(){
        return lbr;
    }
    
    public void setLebar(double lbr){
        this.lbr = lbr;
    }
    
    public double getTinggi(){
        return tggi;
    }
    
    public void setTinggi(double tggi){
        this.tggi = tggi;
    }
    
    @Override
    public double Volume() {
        return pjg * lbr * tggi;
    }

    @Override
    public double LuasPermukaan() {
       return 2 * (pjg * lbr + pjg * tggi + lbr * tggi);
    }

    @Override
    public double Luas() {
        return 0;
    }

    @Override
    public double Keliling() {
      return 0;
    }
}
