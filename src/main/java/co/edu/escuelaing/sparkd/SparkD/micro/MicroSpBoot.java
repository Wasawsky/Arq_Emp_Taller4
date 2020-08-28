/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.escuelaing.sparkd.SparkD.micro;

import co.edu.escuelaing.sparkd.httpserver.HttpServer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mjbc_
 */
public class MicroSpBoot {
    
    
    public static void main(String[] args){
        args[0]="co.edu.escuelaing.sparkd.MicroBoot";
        try {
            MicroS iocServer = new MicroS();
            iocServer.start(args);
            HttpServer server = new HttpServer(iocServer);
            server.start();
        } catch (Exception ex) {
            Logger.getLogger(MicroSpBoot.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
