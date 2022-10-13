
package ifpr.pgua.eic;

import ifpr.pgua.eic.models.Escola;

public class AppSalvarJson 
{
    public static void main( String[] args ) throws Exception{
        
        
        Escola escola = new Escola(null, null);
        
        escola.gerarProfessores();

        escola.salvarJson();
        

    }
}
