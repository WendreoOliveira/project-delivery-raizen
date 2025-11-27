package com.wendreo.br.project_delivery_raizen;

import jakarta.persistence.*;

// Entity transforma uma classe em uma entidade do banco de dados
// JPA = Java Persistence API
@Entity
@Table(name = "tb_reservas")
public class ReservasModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String setor;
    private int cadastroColaborador;
    private int reserva;
    private int itensDelivery;

    public ReservasModel() {
    }

    public ReservasModel(String nome, String setor, int cadastroColaborador, int reserva, int itensDelivery) {
        this.nome = nome;
        this.setor = setor;
        this.cadastroColaborador = cadastroColaborador;
        this.reserva = reserva;
        this.itensDelivery = itensDelivery;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public int getCs() {
        return cadastroColaborador;
    }

    public void setCs(int cs) {
        this.cadastroColaborador = cadastroColaborador;
    }

    public int getReserva() {
        return reserva;
    }

    public void setReserva(int reserva) {
        this.reserva = reserva;
    }

    public int getItensDelivery() {
        return itensDelivery;
    }

    public void setItensDelivery(int itensDelivery) {
        this.itensDelivery = itensDelivery;
    }
}
