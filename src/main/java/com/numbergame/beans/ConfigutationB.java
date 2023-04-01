package com.numbergame.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class ConfigutationB {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String propiedad;
    private String valor;

    public ConfigutationB(String propiedad, String valor) {
        this.propiedad = propiedad;
        this.valor = valor;
    }

    public ConfigutationB() {

    }

    public void setPropiedadId(Long propiedadId) {
        this.id = id;
    }

    public Long getPropiedadId() {
        return id;
    }
    public void setPropiedad(String propiedad) {
        this.propiedad = propiedad;
    }

    public String getPropiedad() {
        return propiedad;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ConfigutationB that = (ConfigutationB) o;
        return Objects.equals(id, that.id) && Objects.equals(propiedad, that.propiedad) && Objects.equals(valor, that.valor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, propiedad, valor);
    }

    @Override
    public String toString() {
        return "ConfigutationB{" +
                "id=" + id +
                ", propiedad='" + propiedad + '\'' +
                ", valor='" + valor + '\'' +
                '}';
    }
}
