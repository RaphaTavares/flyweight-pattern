package com.company;

import java.util.HashMap;
import java.util.Map;

public class PlanoDeSaudeFactory {

    private static Map<String, PlanoDeSaude> planos = new HashMap<>();

    public static PlanoDeSaude getPlano(String nome, Boolean especial){
        PlanoDeSaude plano = planos.get(nome);
        if(plano == null){
        plano = new PlanoDeSaude(nome, especial);
        planos.put(nome, plano);
        }
        return plano;
    }

    public static int getTotalPlanos(){
        return planos.size();
    }
}
