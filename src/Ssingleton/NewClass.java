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
public class NewClass {
  private String autor, titulo;

    private static NewClass instancia = null;

    private NewClass() {
    }

    public static NewClass getInstance() {
        if (instancia == null) {
            instancia = new NewClass();
            return instancia;
        }
        return instancia;
    }
    
    public void mostrar() {
        System.out.println("Singleton{: autor " + autor + " titulo: " + titulo);
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    } 
}
