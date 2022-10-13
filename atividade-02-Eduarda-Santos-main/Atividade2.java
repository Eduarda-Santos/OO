public class Atividade2 {
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int[] vetor = new int[100];
        int valor = 0;
        int pos = 0;
        int pos2 = 0;

        while(pos < 100 && valor != -1){
            System.out.println("Digite um valor:");
            valor = scan.nextIn();
            if(valor != -1){
                vetor[pos] = valor;
                pos += 1;
            }
        }

        int max = vetor[0];
        int min = vetor[0];

        while(pos2 < pos){
            if(vetor[pos2] < min){
                min = vetor[pos2];
            }
            pos2 += 1;
        }
        System.out.println("O menor numero é "+min);
        System.out.println("O maior numero é "+max);
    }
}
