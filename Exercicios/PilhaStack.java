/* 
  Objetivo: Crie um programa em java que crie uma pilha.
  Entrada: Sem entrada.
  Saida: Pilha de dados.
  Autor: Rafael Florentino.
*/
public class PilhaStack {
    // Pilhas(Stacks) são do tipo LIFO (Last-in-First-Out) Último a entrar é o primeiro a sair
    // Pilhas abertas só em uma estremidade por onde entra e sai os elementos.
    // Pilhas pode ser implementadas por meio de um vetor, estrutura, ponteiro e lista ligada

    // Operações básicas
    // push() // Insere elemento no topo da Pilha
    // pop() // Remove elemento do topo da Pilha
    // peek() // Obtém o elemento de dados do topo da pilha, sem removê-lo
    // isFull() // Verifica se a pilha está cheia
    // isEmpty() // Verifica se a pilha está vazia

    // Obtém o elemento de dados do topo da pilha, sem removê-lo
    /*int peek() {
        return stack[top]
    }

    // Verifica se a pilha está cheia
    bool isfull() {
        if(top == MAXSIZE){
            return true;
        }else{
            return false;
        }
    }  
    // Verifica se a pilha está vazia
    bool isempty() {
        if(top == -1){
            return true;
        }else{
            return false;
        }
    } 
    // Inserir na Pilha
    void push(int data) {
        if(!isFull()) {
            top = top + 1;
            stack[top] = data;
        }else {
            printf("Não foi possível inserir, pilha está cheia!\n");
        }
    }    
    // Remove elemento do topo da Pilha
    int pop() {
        if(!isempty()) {
            data = stack[top];
            top = top - 1;
            return data;
        } else {
            printf("Não foi possível recuperar o dado, a pilha está vazia!\n");
        }
    }         
    */
        
}
