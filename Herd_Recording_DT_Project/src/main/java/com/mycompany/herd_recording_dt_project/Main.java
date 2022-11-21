/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.herd_recording_dt_project;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author andrewermio
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
public void clearCowData() throws IOException{
    try(FileWriter fw = new FileWriter("/Users/andrewermio/Documents/GitHub/AndrewEDT2022/Herd_Recording_DT_Project/src/main/java/com/mycompany/herd_recording_dt_project/cowinfo.txt", false);
        PrintWriter pw = new PrintWriter(fw, false)){
            
            pw.flush();
            pw.close();
            fw.close();
            
        }
        
        catch (IOException e){
                }
    }

}
