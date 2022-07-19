#include <stdio.h>
#include <stdlib.h>
#define TAM 6
int main() {

    int i, y, cont=0;
    int a[TAM], random[TAM];
  
    for(i=0;i<6;i++){
      printf("Informe 1 número: ");
      scanf("%d", &a[i]);

      random[i] = rand() % 59;

      for(y=0;y<6;y++){
        if(random[i] == a[y]){
          cont++;
        }
      }
      //printf("%d ", random[i]); 
    }
      //printf("%d", cont);
   if(cont == 4){
      printf("Fez a quadra");
    }
    else if(cont == 5){
      printf("Fez a quina");
    }
    else if(cont == 6){
      printf("Ficou rico!! Fez a sena");
    }
}
  