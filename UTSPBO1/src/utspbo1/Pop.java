/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package utspbo1;

/**
 *
 * @author Beta Nurul Awwalin_21104410091{user}
 */
public class Pop {
    String penyanyi = "Raisa";
    String lagu = "Kali Dua";
    
    Pop(){
    }

    Pop(String penyanyi, String lagu) {
        System.out.printIn(this.penyanyi + "<=>" + this.lagu);
    }
    
    void singer (String penyanyi){
        this.penyanyi = penyanyi;
    }
    
    void song (String lagu){
        this.lagu = lagu;
    }
    
    Void cetakLabel(){
        System.out.println(this.penyanyi + " <=> " + this.lagu);
    }

}
