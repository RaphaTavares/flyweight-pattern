package com.company;

public class Paciente {
    private String nome;
    private PlanoDeSaude planoDeSaude;


    public Paciente(String nome, PlanoDeSaude planoDeSaude){
        this.nome = nome;
        this.planoDeSaude = planoDeSaude;
    }

    public String obterPaciente() {
        return "Paciente{" +
                "nome=" + nome +
                ", planoDeSaude=" + planoDeSaude.getNome() +
                ", especial=" + planoDeSaude.getEspecial() +
                '}';
    }
}
