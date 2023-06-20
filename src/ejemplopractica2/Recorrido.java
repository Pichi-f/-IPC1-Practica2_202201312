/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplopractica2;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author USUARIO
 */
public class Recorrido extends Thread {

    JLabel vehiculo;
    public int distancia;
    boolean regreso;

    final int posDestino = VerRecorridos.DestinoLbl.getLocation().x;

    public Recorrido(JLabel vehiculo, int distancia) {
        this.vehiculo = vehiculo;
        this.distancia = distancia;
        this.regreso = false;
    }

    @Override
    public void run() {
        while (true) {
            try {
                //delay
                sleep( distancia/1);

                //Obtener la posición del vehiculo en X
                int vehiculoPosX = vehiculo.getLocation().x;

                //Si va de ida
                if (!regreso) {
                    //Si no ha llegado al destino
                    if (vehiculoPosX < posDestino - 125) {
                        //Avanzar el vehiculo
                        vehiculo.setLocation(vehiculoPosX + 1, vehiculo.getLocation().y);
                    } else {
                        regreso = true;
                    }
                } else {
                    //De regreso
                    //Si no ha llegado al inicio
                    if (vehiculoPosX > 125) {
                        //Retroceder el vehiculo
                        vehiculo.setLocation(vehiculoPosX - 1, vehiculo.getLocation().y);
                    } else {
                        break;
                    }
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
