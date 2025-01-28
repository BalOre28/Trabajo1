/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package email;

/**
 *
 * @author Balto
 */
public class Email {
   private String reciEmail;
    private String asunto;
    private String cont;
    private boolean leido;

    // Constructor
    public Email(String emailRemitente, String asunto, String contenido) {
        this.reciEmail = reciEmail;
        this.asunto = asunto;
        this.cont = cont;
        this.leido = false;
    }
    
    public String getCont() {
        return cont;
    }
    public String getreciEmail() {
        return reciEmail;
    }
    public String getAsunto() {
        return asunto;
    }
    public void setLeido() {
        this.leido = true;
    }
   
    public boolean isLeido() {
        return leido;
    }

    public void print() {
        System.out.println("De: "+reciEmail+"\nAsunto: "+asunto+"\nContenido: "+cont);
    }

}
