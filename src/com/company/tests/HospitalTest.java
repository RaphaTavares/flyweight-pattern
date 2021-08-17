package com.company.tests;

import com.company.Hospital;
import com.company.PlanoDeSaudeFactory;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class HospitalTest {

    @Test
    public void deveRetornarPacientes(){
        Hospital hospital = new Hospital();
        hospital.cadastrar("Raphael", "Unimed", true);
        hospital.cadastrar("Flavio", "Sabin", true);
        hospital.cadastrar("Jafar", "Unimed", false);

        List<String> saida = Arrays.asList(
                "Paciente{nome=Raphael, planoDeSaude=Unimed, especial=true}",
                "Paciente{nome=Flavio, planoDeSaude=Sabin, especial=true}",
                "Paciente{nome=Jafar, planoDeSaude=Unimed, especial=true}");

        assertEquals(saida, hospital.obterPacientes());
    }

    @Test
    public void deveRetornarTotalPlanos(){
        Hospital hospital = new Hospital();
        hospital.cadastrar("Raphael", "Unimed", true);
        hospital.cadastrar("Flavio", "Sabin", true);
        hospital.cadastrar("Jafar", "Unimed", false);;

        assertEquals(2, PlanoDeSaudeFactory.getTotalPlanos());
    }

}
