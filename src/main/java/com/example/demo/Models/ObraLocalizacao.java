package com.example.demo.Models;

public class ObraLocalizacao {
    int Id;
    String Cidade;
    String Estado;
    String Latitude;
    String Longetude;
    Obra Obra;

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String cidade) {
        Cidade = cidade;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }

    public String getLatitude() {
        return Latitude;
    }

    public void setLatitude(String latitude) {
        Latitude = latitude;
    }

    public String getLongetude() {
        return Longetude;
    }

    public void setLongetude(String longetude) {
        Longetude = longetude;
    }
}
