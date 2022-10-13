public class Atividade {

    public static final int MAX_ESCOLHAS=25;

    public static void main(String args[]){
        int numeros[] = new int[MAX_ESCOLHAS];
        int cont = 0;
        
        for(int i=1;i<MAX_ESCOLHAS;i++){
            numeros[i] = i;
            //System.out.println(numeros[i]);
            if(numeros[i]%2 == 0){
                System.out.println("O número "+numeros[i]+" é par");
            }
            else{
                System.out.println("O número "+numeros[i]+" é impar");
            }
            
            for(int j=1;j<11;j++){
                if(i % j == 0){
                    cont += 1;
                } 
            }

            if(cont == 2){
                System.out.println("O número "+numeros[i]+" é primo!");
            }
        }
    }
}
