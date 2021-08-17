package com.company;

import java.util.ArrayList;
import java.util.List;

public class Hospital {

    private List<Paciente> pacientes = new ArrayList<>();

    public void cadastrar(String nomePaciente, String nomePlano, Boolean especial){
        PlanoDeSaude plano = PlanoDeSaudeFactory.getPlano(nomePlano, especial);
        Paciente paciente = new Paciente(nomePaciente, plano);
        pacientes.add(paciente);
    }

    public List<String> obterPacientes(){
        List<String> saida = new ArrayList<String>();
        for(Paciente paciente : this.pacientes){
            saida.add(paciente.obterPaciente());
        }
        return saida;
    }

}
