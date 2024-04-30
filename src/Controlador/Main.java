package Controlador;

import Animacion.Animacion;
import Vista.Principal;
import javax.swing.JPanel;

public class Main {

    public static void main(String[] args) {
        abrir();//lamar metodo
    }
    //funcion para abrir la ventana principal
    static void abrir(){
         Principal principal = new Principal();
        principal.setVisible(true);
        principal.setLocationRelativeTo(null);
        JPanel ventanamenu = principal.getPanelmenu();
        int VentanaX = ventanamenu.getX();//obtener posicion
        if (VentanaX == 0) {//animaciones
            Animacion.mover_derecha(-500, 0, 10, 5, ventanamenu);
        }
    }
}
