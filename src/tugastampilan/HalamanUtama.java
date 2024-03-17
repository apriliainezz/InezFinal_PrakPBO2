/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugastampilan;

import BangunDatar.Balok;
import BangunDatar.Persegi;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author HP
 */
public class HalamanUtama extends JFrame implements ActionListener {
    JLabel headerutama = new JLabel();
    JLabel ket2 = new JLabel("Tentukan panjang, lebar, dan tinggi untuk menghitung Rumus Persegi dan Balok.");
    JLabel panjang = new JLabel("Panjang");
    JLabel lebar = new JLabel("Lebar");
    JLabel tinggi = new JLabel("Tinggi");
    JLabel hasil = new JLabel("Hasil");
    
    JLabel luasPersegi = new JLabel("Luas Persegi");
    JLabel hasilLP = new JLabel("[Hasil Berupa Angka]");
    
    JLabel kelilingPersegi = new JLabel("Keliling Persegi");
    JLabel hasilKP = new JLabel("[Hasil Berupa Angka]");
    
    JLabel volumeBalok = new JLabel("Volume Balok");
    JLabel hasilVB = new JLabel("[Hasil Berupa Angka]");
    
    JLabel lpBalok = new JLabel("Luas Permukaan Balok");
    JLabel hasilLPB = new JLabel("[Hasil Berupa Angka]");
    
    JTextField Panjang = new JTextField();
    JTextField Lebar = new JTextField();
    JTextField Tinggi = new JTextField();
    
    JButton hitung = new JButton("Hitung");
    JButton reset = new JButton("Reset");

    public HalamanUtama(String Username, String Gender){
        
        setVisible(true);
        setSize(750, 740);
        setTitle("Halaman Utama");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLayout(null);
        setLocationRelativeTo(null);
        
        add(headerutama);
        headerutama.setText("Welcome, " + Gender + Username);
        headerutama.setFont(new Font("arial", Font.BOLD, 21));
        headerutama.setBounds(30, 30, 360, 40);
        
        add(ket2);
        ket2.setFont(new Font("arial", Font.BOLD, 15));
        ket2.setBounds(30, 60, 700, 40);
        
        add(panjang);
        panjang.setBounds(30, 120, 100, 20);
        
        add(lebar);
        lebar.setBounds(30, 160, 150, 30);
        
        add(tinggi);
        tinggi.setBounds(30, 200, 200, 40);
        
        add(hasil);
        hasil.setBounds(296, 380, 100, 20);
        
        add(luasPersegi);
        luasPersegi.setBounds(30, 420, 150, 20);
        add(hasilLP);
        hasilLP.setBounds(200, 420, 200, 20);
        
        add(kelilingPersegi);
        kelilingPersegi.setBounds(30, 440, 150, 20);
        add(hasilKP);
        hasilKP.setBounds(200, 440, 200, 20);
        
        add(volumeBalok);
        volumeBalok.setBounds(30, 460, 150, 20);
        add(hasilVB);
        hasilVB.setBounds(200, 460, 200, 20);
        
        add(lpBalok);
        lpBalok.setBounds(30, 480, 200, 20);
        add(hasilLPB);
        hasilLPB.setBounds(200, 480, 200, 20);
        
        add(Panjang);
        Panjang.setBounds(155, 110, 385, 40);
        
        add(Lebar);
        Lebar.setBounds(155, 160, 385, 40);
        
        add(Tinggi);
        Tinggi.setBounds(155, 210, 385, 40);
        
        add(hitung);
        hitung.setBounds(30, 270, 560, 40);
       
        
        add(reset);
        reset.setBounds(30, 320, 560, 40);
        
        
        hitung.addActionListener(this);
        reset.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== hitung){
            double pjg = Double.parseDouble(Panjang.getText());
            double lbr = Double.parseDouble(Lebar.getText());
            double tggi = Double.parseDouble(Tinggi.getText());
            
            Persegi bangun1 = new Persegi(pjg, lbr);
            Balok bangun2 = new Balok(pjg, lbr,  tggi);
            
            String hasilLuasPersegi = String.valueOf(bangun1.Luas());
            String hasilKelilingPersegi = String.valueOf(bangun1. Keliling());
            String hasilVolumeBalok = String.valueOf(bangun2. Volume());
            String hasilLuasPermukaan = String.valueOf(bangun2.LuasPermukaan());
            
            hasilLP.setText(hasilLuasPersegi);
            hasilKP.setText(hasilKelilingPersegi);
            hasilVB.setText(hasilVolumeBalok);
            hasilLPB.setText(hasilLuasPermukaan);
            
        } else if(e.getSource() == reset){
            Panjang.setText("");
            Lebar.setText("");
            Tinggi.setText("");
            hasilLP.setText("[Hasil berupa angka]");
            hasilKP.setText("[Hasil berupa angka]");
            hasilVB.setText("[Hasil berupa angka]");
            hasilLPB.setText("[Hasil berupa angka]");
        }
    }
    
  

}
