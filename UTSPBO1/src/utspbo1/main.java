/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package utspbo1;

/**
 *
 * @author Beta Nurul Awwalin_21104410091{user}
 */
public main class Penyanyi extends Pop {
    
    public static void main (String[] args){
    Pop pop = new Pop ("Black Pink", "How You Like That");
    Dangdut dangdut = new Dangdut ();
    
    pop.singer ("Eclat Story");
    pop.song("Bentuk Cinta");
    pop.cetakLabel();
    
    dangdut.singer ("Kopi Dangdut");
    dangdut.song("Via Valen");
    dangdut.cetakLabel();
    }
}
