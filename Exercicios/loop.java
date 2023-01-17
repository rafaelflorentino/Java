import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // FOR3
        for(int cont=0; cont<3; cont++){
            System.out.println(cont+" Loop FOR");
        }
        System.out.println("\n");

        // WHILE
        System.out.print("Digite a quantidade: ");
        int quantidade= scan.nextInt();
        int contador=0;
        while(contador < quantidade){
            System.out.println(contador+" Loop WHILE");
            contador++;
        }
        System.out.println("\n");

        // DO WHILE
        int cont=0;
        do{
            System.out.println(cont+" Loop DO WHILE");
            cont++;
        }while(cont < 0);

        System.out.println("\nFim do Programa.");
        scan.close();
    }
}
