/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Vistas.*;
import Modelo.*;

public class Main {

    public static void main(String[] args) {
        
        Login login = new Login();
        
        login.setVisible(true);
        
        Conexion conexion = new Conexion();
        conexion.getConnection();
        
        
        
    }
    
}
/**
 *
 * @author Holding
 */

    

