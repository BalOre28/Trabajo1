/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package email;
/**
 *
 * @author Balto
 */
public class Main {
    public static void main(String[] args) {
         EmailAccount mycuenta =new EmailAccount("Alejo@hotmail.com","con123", "usuarioEjemplo");
         Email email = new Email("emisor@correo.com", "Asunto del correo", "Cuerpo del mensaje");
         
        boolean seRecibioEmail = mycuenta.recibirEmail(email);
        if (seRecibioEmail) {
            System.out.println("Se recibió email");
        } else {
            System.out.println("No se puede recibir email");
        }
    }//final del main
}//final de la clase
