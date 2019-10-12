/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ProveedoresModelo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Estudiante
 */
public class ProveedoresControlador {

    private List<ProveedoresModelo> proveedores = new ArrayList();

    public void agregar(ProveedoresModelo a) {

        proveedores.add(a);

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
