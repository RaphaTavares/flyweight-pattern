package com.company;

public class PlanoDeSaude {
    private String nome;
    private Boolean especial;

    public PlanoDeSaude(String nome, Boolean especial){
        this.nome = nome;
        this.especial = especial;
    }

    public String getNome(){
        return nome;
    }

    public Boolean getEspecial(){
        return especial;
    }
}
