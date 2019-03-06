/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ssingleton;

/**
 *
 * @author r618b
 */
public class Singleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        NewClass obj1 = NewClass.getInstance();
        NewClass obj2 = NewClass.getInstance();
        obj1.setAutor("cereza");
        obj1.setTitulo("Cerezo");
        obj1.mostrar();
        obj2.setAutor("Pera");
        obj2.setTitulo("Peral");
        obj2.mostrar();
        obj1.mostrar();

    }

}
