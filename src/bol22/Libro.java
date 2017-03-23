/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol22;

import java.util.Objects;

/**
 *
 * @author Guille
 */
public class Libro {
    String Nome,autor;
    int unidades;
    float precio;

    public Libro() {
    }

    public Libro(String Nome, String autor, int unidades, float precio) {
        this.Nome = Nome;
        this.autor = autor;
        this.unidades = unidades;
        this.precio = precio;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Libro{" + "Nome=" + Nome + ", autor=" + autor + ", unidades=" + unidades + ", precio=" + precio + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.Nome);
        hash = 67 * hash + Objects.hashCode(this.autor);
        hash = 67 * hash + this.unidades;
        hash = 67 * hash + Float.floatToIntBits(this.precio);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Libro other = (Libro) obj;
        if (this.unidades != other.unidades) {
            return false;
        }
        if (!Objects.equals(this.Nome, other.Nome)) {
            return false;
        }
        if (!Objects.equals(this.autor, other.autor)) {
            return false;
        }
        return true;
    }
}
