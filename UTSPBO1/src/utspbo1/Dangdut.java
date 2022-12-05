/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package utspbo1;

/**
 *
 * @author Beta Nurul Awwalin_21104410091{user}
 */
public class Dangdut {
    String penyanyi = "Ayu Ting-Ting";
    String lagu = "Alamat Palsu";
    
    Dangdut (){
    }
    
    void singer (String penyanyi){
        this.penyanyi = penyanyi;
    }
    
    void song (String lagu){
        this.lagu = lagu;
    }
    
    Void cetakLabel(){
        System.out.println(this.penyanyi + " <=> " + this.lagu);
        return null;
    }

    void song(String via_Valen, String kopi_Dangdut) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}


