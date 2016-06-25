package com.rvag.fragmentsandroid.model;

import android.view.accessibility.AccessibilityManager;

import java.io.Serializable;

/**
 * Created by Robert on 18/06/2016.
 */
public class Amigo implements Serializable {
    private String nombre;
    private String twiter;
    private String telefono;

    public Amigo(String nombre, String twiter, String telefono) {
        this.nombre = nombre;
        this.twiter = twiter;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTwiter() {
        return twiter;
    }

    public void setTwiter(String twiter) {
        this.twiter = twiter;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return this.nombre;
    }
}
