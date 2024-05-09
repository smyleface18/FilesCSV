/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.filescsv.managerFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SCIS2
 */
public class ReadFile {
    
    private File file;
    private FileReader fileReader;
    private BufferedReader bufferedReader;


    public ReadFile(File file) throws IOException {
        this.file = file;
        this.fileReader = new FileReader(file);
        this.bufferedReader = new BufferedReader(fileReader);
        
    }
    
    
    public List<String> loadData(){
        String line;
        List<String> data = new ArrayList<>();
        try {
            while((line = bufferedReader.readLine()) != null){
                data.add(line);
            }
        }catch (IOException e){
        
        }finally{
            try {
                if(fileReader != null){
                    fileReader.close();
                }
            }catch(IOException e2){
            
            }
        }
        return data;
    }
    
    public void ficheroWriter(File file,boolean value) throws IOException{
        FileWriter writer = new FileWriter(file, value);
        PrintWriter pw = new PrintWriter(writer);
        pw.println("ssdf");
        pw.close();
        System.out.println("ya escribio");
        
    }
    
    
}
