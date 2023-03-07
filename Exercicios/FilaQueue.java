import java.util.LinkedList;
import java.util.Queue;

/* 
  Objetivo: Crie um programa em java que crie uma fila.
  Entrada: Sem entrada.
  Saida: fila de dados.
  Autor: Rafael Florentino.
*/
public class FilaQueue {
    // Fila(Queue) e conhecida como FIFO (First-In-First-Out) Primeiro a entrar e o Primeiro a sair -> -> ->
    // é abstrata adimite dados diferentes
    // Fila aberta nas duas estermidades entrada e saida, poneiro frontal e ponteiro trazeiro
    // Fila de vetores, Fila de listas ligadas, Filas de Poneiros, Filas de estruturas.

    // Operações básicas
    // enqueue() - adicionar (armazenar) um item à fila;
    // dequeue() - remove (acessa) um item da fila;
    // peek() - Pega o elemento na frente da fila sem removê-lo;
    // isfull() - Verifica se a fila está cheia;
    // isempty() - Verifica se a fila está vazia;  
    public static void main(String[] args) {
        // entra por um lado e sai pelo outro lado
        Queue<String> q = new LinkedList<>(); // quem chega primeiro sai primeiro
        q.add("d");
        q.add("b");
        q.add("c");
        q.add("a");
        while(q.size() > 0) {
            System.out.println(q.remove()); // Remove da fila
        }        
    }
    
    /*
        // Traz o primeiro elemento a fila
        int peek() {
            return queue[front];
        }

        // Verifica se a fila está cheia
        bool isfull() {
            if(rear == MAXSIZE - 1){
                return true;
            }else{
                return false;
            }
        } 
        // Inseri na fila           
        int enqueue(int data){
            if(isfull())
                return 0;
                
            rear = rear + 1;
            queue[rear] = data;

            return 1;
        }
        // Remove da fila
        int dequeue() {
            if(isempty())
                return 0;

            int data = queue[front];
            front = front + 1;
            
            return data;
        }
     */
    
}
