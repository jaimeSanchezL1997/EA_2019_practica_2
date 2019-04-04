/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EA_Practica_2.data;
import java.io.*;
import java.util.*;
import EA_Practica_2.Templates.Producto;

/**
 *
 * @author jaime
 */
public class ArchivoProducto {
    void guardarProducto(ArrayList<Producto> productos){
       try{
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter"Productos.txt"));
        for(int i=0;i<productos.size();i++){
        
        fileWriter("{{" + productos.get(i).getNumobre)
        }
        
       }catch(IOExcepcion ex){
       }
       
    }
    
}
