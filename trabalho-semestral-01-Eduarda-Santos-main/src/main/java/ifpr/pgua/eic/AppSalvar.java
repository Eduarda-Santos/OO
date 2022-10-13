
package ifpr.pgua.eic;

import java.io.FileWriter;

import com.google.gson.Gson;

import ifpr.pgua.eic.models.Escola;

public class AppSalvar 
{
    public static void main( String[] args ) throws Exception{
        
        Escola escola = new Escola(null, null);

        escola.gerarProfessores();

        escola.salvarDados();
        
        Gson gson = new Gson();

        String json = gson.toJson(escola);

        FileWriter out = new FileWriter("escola.json");

        out.write(json);
        out.close();
        

    }
}
