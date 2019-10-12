/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Estudiante
 */
public class ProveedoresModelo implements Serializable{

    private String codigo;
    private String nombre;
    private String fecha;
    private String direccion;
    private int evaluacionI;
    private int reevaluacion;
    private String tproveedor;
    private String nit;
    private String contacto;
    private String correo;
    private int telefono;
    private String estado;

    public ProveedoresModelo(String codigo, String nombre, String fecha, String direccion, int evaluacionI, int reevaluacion, String tproveedor, String nit, String contacto, String correo, int telefono, String estado) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.fecha = fecha;
        this.direccion = direccion;
        this.evaluacionI = evaluacionI;
        this.reevaluacion = reevaluacion;
        this.tproveedor = tproveedor;
        this.nit = nit;
        this.contacto = contacto;
        this.correo = correo;
        this.telefono = telefono;
        this.estado = estado;
    }

    public ProveedoresModelo() {
    }

    /*
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the ingreso
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param ingreso the ingreso to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the evaluacionI
     */
    public int getEvaluacionI() {
        return evaluacionI;
    }

    /**
     * @param evaluacionI the evaluacionI to set
     */
    public void setEvaluacionI(int evaluacionI) {
        this.evaluacionI = evaluacionI;
    }

    /**
     * @return the reevaluacion
     */
    public int getReevaluacion() {
        return reevaluacion;
    }

    /**
     * @param reevaluacion the reevaluacion to set
     */
    public void setReevaluacion(int reevaluacion) {
        this.reevaluacion = reevaluacion;
    }

    /**
     * @return the tproveedor
     */
    public String getTproveedor() {
        return tproveedor;
    }

    /**
     * @param tproveedor the tproveedor to set
     */
    public void setTproveedor(String tproveedor) {
        this.tproveedor = tproveedor;
    }

    /**
     * @return the nit
     */
    public String getNit() {
        return nit;
    }

    /**
     * @param nit the nit to set
     */
    public void setNit(String nit) {
        this.nit = nit;
    }

    /**
     * @return the contacto
     */
    public String getContacto() {
        return contacto;
    }

    /**
     * @param contacto the contacto to set
     */
    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    /**
     * @return the correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * @param correo the correo to set
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * @return the telefono
     */
    public int getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }
}
