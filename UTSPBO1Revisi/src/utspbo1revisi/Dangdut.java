/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package utspbo1revisi;

/**
 *
 * @author Beta Nurul Awwalin_21104410091{user}
 */
public class Dangdut {
    static String Penyanyi;
    
    static void song (String via_Valen, String kopi_Dangdut){
    }
    
    String penyanyi = "Ayu Ting-Ting";
    String lagu = "Kopi Dangdut";
    
    Dangdut(){
    }
    
    void singer (String penyanyi){
        this.penyanyi = penyanyi;
    }
    
    public void song (String lagu){
        this.lagu = lagu;
    }
    
    void cetakLabel(){
        System.out.print(this.penyanyi + " <=> " + this.lagu);
    }
}
