package com.github.pdiazzdev.arquiteturaspring.montadora;

public class Motor {
    private String modelo;
    private Integer cavalos;
    private Integer cilindros;
    private Double litragem;
    private TipoMotor tipo;

    @Override
    public String toString() {
        return "Motor{" +
                "cavalos=" + cavalos +
                ", modelo='" + modelo + '\'' +
                ", cilindros=" + cilindros +
                ", litragem=" + litragem +
                ", tipo=" + tipo +
                '}';
    }

    public void setCavalos(Integer cavalos) {
        this.cavalos = cavalos;
    }

    public void setCilindros(Integer cilindros) {
        this.cilindros = cilindros;
    }

    public void setLitragem(Double litragem) {
        this.litragem = litragem;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setTipo(TipoMotor tipo) {
        this.tipo = tipo;
    }
}
