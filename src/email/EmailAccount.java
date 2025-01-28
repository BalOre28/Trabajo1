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

    String correo;
    String contraseña;
    String usuario;
    ArrayList<Email> inbox;

    public EmailAccount(String correo, String contraseña, String usuario) {
        this.correo = correo;
        this.contraseña = contraseña;
        this.usuario = usuario;
        this.inbox = new ArrayList<>();
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public String getCorreo() {
        return correo;
    }

    public boolean CuentasExistentes(String correo) {
        return this.correo.equals(correo);
    }

    public void recibirEmail(Email email) {
        inbox.add(email);
    }

   
}
