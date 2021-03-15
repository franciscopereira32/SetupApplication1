/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import View.Planeta;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import javax.swing.Icon;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.text.View;
/*
import View.Planeta;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
//import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;*/

 
 //@author Francisco
 
public class Cmd{
    public static void CriarDiretorio(String up) throws IOException{
        //u = Integer.parseInt(Planeta.up);
        switch (Planeta.up){
            case 1:
                Process p = Runtime.getRuntime().exec("cmd.exe /c start C:\\SetupLinha\\versao.bat ");
                BufferedReader stdInput = new BufferedReader(new 
                InputStreamReader(p.getInputStream()));
                String line;
                 while ((line = stdInput.readLine()) != null) {
            System.out.println(line);
    }
            }
        }    
    
        //pega o retorno do processo
        /*BufferedReader stdInput = new BufferedReader(new 
             InputStreamReader(p.getInputStream()));
        String line;
        //printa o retorno
        while ((line = stdInput.readLine()) != null) {
            System.out.println(line);*/

    public static void DeletarDiretorio(String actionCommand) throws IOException {
        Process p = Runtime.getRuntime().exec("cmd.exe /c start C:\\SetupLinha\\remove.bat ");
        BufferedReader stdInput = new BufferedReader(new 
        InputStreamReader(p.getInputStream()));
        String line;
        while ((line = stdInput.readLine()) != null) {
        System.out.println(line);
    }
    }
}
    

    

