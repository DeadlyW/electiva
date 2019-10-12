/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ProveedoresModelo;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Estudiante
 */
public class ProveedoresControlador {

    private static List<ProveedoresModelo> proveedores = new ArrayList();
    static FileOutputStream fout;
    static FileInputStream fin;

    public void agregar(ProveedoresModelo a) {

        proveedores.add(a);

    }

    public static void guardarProveedor() {
        File directorio = new File("c:\\Proveedores");
        directorio.mkdir();
        

        
        ObjectOutputStream out = null;
        try {
            fout = new FileOutputStream("C:\\Proveedores\\proveedor.txt");
            out = new ObjectOutputStream(fout);
            out.writeObject(proveedores);
            out.close();
        } catch (IOException ex) {
            Logger.getLogger(ProveedoresControlador.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                out.close();
            } catch (IOException ex) {
                Logger.getLogger(ProveedoresControlador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
     public static List cargarProveedor(){        
        ObjectInputStream ois = null;
        List provee=new ArrayList();
        try {
            fin= new FileInputStream("C:\\Proveedores\\proveedor.txt");  
            ois = new ObjectInputStream(fin);
            try {
                provee = (List)ois.readObject();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ProveedoresControlador.class.getName()).log(Level.SEVERE, null, ex);
            }            
        } catch (IOException ex) {
            Logger.getLogger(ProveedoresControlador.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                ois.close();
            } catch (IOException ex) {
                Logger.getLogger(ProveedoresControlador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }return provee;
    }

    public void eliminar(ProveedoresModelo a) {

        proveedores.remove(a);

    }

    /**
     * @return the proveedores
     */
    public List<ProveedoresModelo> getProveedores() {
        return proveedores;
    }

    /**
     * @param proveedores the proveedores to set
     */
    public void setProveedores(List<ProveedoresModelo> proveedores) {
        this.proveedores = proveedores;
    }

}
