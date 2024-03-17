/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangunDatar;

/**
 *
 * @author HP
 */
public class Persegi implements OperasiBidang{
    private double pjg, lbr;
    
    public Persegi(double pjg, double lbr){
        this.pjg = pjg;
        this.lbr = lbr;
        
    }

    public double getPanjang() {
        return pjg;
    }

    public void setPanjang(double pjg) {
        this.pjg = pjg;
    }

    public double getLebar() {
        return lbr;
    }

    public void setLebar(double lbr) {
        this.lbr = lbr;
    }

    @Override
    public double Luas() {
        return pjg * lbr;
    }

    @Override
    public double Keliling() {
        return 2 * (pjg + lbr);
    }
    
    @Override
    public double Volume() {
        return 0;
    }

    @Override
    public double LuasPermukaan() {
       return 0;
    }
    
    
}
