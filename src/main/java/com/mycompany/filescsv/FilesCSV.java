/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.filescsv;

import com.mycompany.filescsv.managerFile.ReadFile;
import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author SCIS2
 */
public class FilesCSV {

    public static void main(String[] args) throws IOException {

        File file = new File("./data.csv");
        
        ReadFile readFile = new ReadFile(file);
        
        List<String> data = readFile.loadData();
        
        String [] splited = new String [3];
        String [][] arraySplited = new String[4][3];
        
        readFile.ficheroWriter(file, true);

        int i =0;
        for (String line : data) {
                
                splited = line.split(";");
                arraySplited[i][0]= splited[0];  
                arraySplited[i][1]= splited[0];  
                arraySplited[i][2]= splited[0];  
                System.out.println("Hola "+ splited[0]+" "+splited[1]+" "+splited[2]);   

        }
        
        

        
        
    }
}
