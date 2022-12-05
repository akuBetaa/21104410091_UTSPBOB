/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package utspbo1revisi;

/**
 *
 * @author Beta Nurul Awwalin_21104410091{user}
 */
public class Pop {
    String penyanyi = "Raisa";
    String lagu = "Kali Dua";
    
    Pop (){
    }
    
    Pop (String penyanyi, String lagu){
        this.penyanyi = penyanyi;
        this.lagu = lagu;
        System.out.println(this.penyanyi + " <=> " + this.lagu);    
    }
    
    public void singer (String penyanyi) {
        this.penyanyi = penyanyi;
    }
    
    protected void song (String lagu) {
        this.lagu = lagu;
    }
    
    void cetakLabel () {
        System.out.print(this.penyanyi + " <=> " + this.lagu);
    }
}
