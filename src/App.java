import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int p = sc.nextInt(); //escolher entre par ou impar
        int j1 = sc.nextInt(); // jogador1 escolha
        int j2 = sc.nextInt(); // jogador2 escolha
        int r = sc.nextInt(); //se robou ou nao
        int a = sc.nextInt(); // se acausa ou nao;
        int soma = j1 +j2;
        sc.close();


        if(r == 1 & a == 1){
            System.out.println("Jogador 2 ganha!"); // roubou e foi pego
        }else if(r == 1 && a == 0){
            System.out.println("Jogador 1 ganha!"); // robou e nao foi pego
        }else if(r == 0 && a ==1){
            System.out.println("Jogador 1 ganha!"); // nao robou e foi acusado
        }

        if(r == 0 && a == 0){
            //jogo corre normalmente
            //1 = par 0 = impar
            if(p ==0 && soma%2 !=0){
                System.out.println("Jogador 1 ganha!"); // escolheu impar e saiu impar
            }else if (p ==0 && soma%2 !=0){
                System.out.println("Jogador 2 ganha!"); // escolheu impar e saiu par
            }
            
            if(p == 1 && soma%2 == 0){
                System.out.println("Jogador 1 ganha!"); // escolheu par e saiu par
            }else if (p ==1 && soma%2 !=0){
                System.out.println("Jogador 2 ganha!"); // escolheu par e saiu impar
            }
        }
    }
}
