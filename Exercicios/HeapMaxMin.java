/* 
  Objetivo: Crie um programa em java que ordene elementos de uma array em forma de árvore binário com maior número no topo
  Entrada: Sem entrada.
  Saida: Arvore ordenada.
  Autor: Rafael Florentino.
*/

//  Heap é a área da memória alocada em que os objetos da sua aplicação são armazenados.
public class HeapMaxMin {
    void max_heapify(int Arr[], int i, int N) {
        int left = 2 * i; // filho da esquerda
        int right = 2 * i + 1; // filho da direita
        int largest = 0;
        if (left <= N & Arr[left] > Arr[i]) {
            largest = left;
        } else {
            largest = i;
        }
        if (right <= N & Arr[right] > Arr[largest]) {
            largest = right;
        }
        if (largest != i) {
            // swap(Arr[i], Arr[largest]);
            max_heapify(Arr, largest, N);
        }
    }

    // Heap Máximo, maior valor ficara no nó da arvore
    void build_maxheap(int Arr[]) {
        int N = 0;
        for (int i = N / 2; i >= 1; i--) {
            max_heapify(Arr, i, N);
        }
    }

    // Heap Mínimo
    void min_heapify(int Arr[], int i, int N) {
        int left = 2 * i;
        int right = 2 * i + 1;
        int smallest;
        
        if (left <= N & Arr[left] < Arr[i]){
            smallest = left;
        }else{
            smallest = i;
        }if(right <= N & Arr[right] < Arr[smallest]){
            smallest = right;
        }if(smallest != i) {
            //swap(Arr[i], Arr[smallest]);
            min_heapify(Arr, smallest, N);
        }
    }
}
