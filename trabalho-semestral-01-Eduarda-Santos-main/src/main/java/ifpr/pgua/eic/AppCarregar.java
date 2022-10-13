package ifpr.pgua.eic;

import ifpr.pgua.eic.models.Escola;
import ifpr.pgua.eic.models.Professor;

public class AppCarregar {
    public static void main(String[] args) throws Exception {
        
        Escola escola = new Escola(null, null);

        Professor professor = new Professor(null, null, null, null, null);

        escola.carregarDados();

        System.out.println(professor.getProfessores());

        

    }
}
