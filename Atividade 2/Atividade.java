public class Atividade {

    public static final int MAX_ESCOLHAS=25;

    public static void main(String args[]){
        int numeros[] = new int[MAX_ESCOLHAS];
        int par[] = new int[MAX_ESCOLHAS];
        int impar[] = new int[MAX_ESCOLHAS];
        
        for(int i=1;i<MAX_ESCOLHAS;i++){
            numeros[i] = i;
            //System.out.println(numeros[i]);
            if(numeros[i]%2 == 0){
                par[i] = numeros[i];
            }
            else{
                impar[i] = numeros[i];
            }
            //System.out.println(impar[i]);
            for(int j=1;j<11;j++){
                if(i % j != 0){
                    System.out.println(numeros[i]);
                } 
            }
        }
    }
}
