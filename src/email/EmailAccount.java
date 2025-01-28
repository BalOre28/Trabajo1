/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package email;
import email.Email;
import java.util.ArrayList;
/**
 *
 * @author Balto
 */
public class EmailAccount {

    String email;
    String contraseña;
    String usuario;
    ArrayList<Email> inbox;

    public EmailAccount(String correo, String contraseña, String usuario) {
        this.email = correo;
        this.contraseña = contraseña;
        this.usuario = usuario;
        this.inbox = new ArrayList<>(100);
        for(int i = 0; i < 100; i++){
            inbox.add(null);
        }
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public String getEmail() {
        return email;
    }

    public boolean CuentasExistentes(String correo) {
        return this.email.equals(correo);
    }

    public boolean recibirEmail(Email email) {
     for (int i = 0; i < inbox.size(); i++) {
            if (inbox.get(i) == null) {
                inbox.set(i, email);
                break;
            } else if (i == inbox.size() - 1) {
                System.out.println("Buzón LLeno");
                return false;
            }
        }
     return false;
    }

    public void printInbox() {
        System.out.println("Correo: " + email);
        System.out.println("Usuario: " + usuario);
        for (int i = 0; i < inbox.size(); i++) {
            Email email = inbox.get(i);
            if (email != null) {
                System.out.println("Posición " + (i + 1) + "\n\tEl Correo Emisor pertenece a: "
                        + email.getreciEmail() + "n\tAsunto: " + email.getAsunto()
                        + "\tEmail Leídos/Sin Leer: " + email.isLeido());
            }
        }
    }

    public void leerEmail(int posicion) {
        posicion--;
        if (posicion >= 0 && posicion < inbox.size() && inbox.get(posicion) != null) {
            inbox.get(posicion).print();
            inbox.get(posicion).setLeido();
        } else {
            System.out.println("El correo no existe");
        }
    }

    public void borrarLeidos() {
        inbox.removeIf(Email::isLeido);
    }
    

}
