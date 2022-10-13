
package ifpr.pgua.eic;

import ifpr.pgua.eic.models.Escola;
import ifpr.pgua.eic.models.Professor;

public class AppCarregarJson {
    public static void main(String[] args) throws Exception {
        
        Escola escola = new Escola(null, null);

        Professor professor = new Professor(null, null, null, null, null);

        escola.carregarJson();

        System.out.println(professor.getProfessores());
        
    }
}
