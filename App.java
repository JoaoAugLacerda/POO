import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        Microondas micro = new Microondas();
        int opcoes = 0;

        while (opcoes != 5) {
            System.out.println("POO Exerc Microondas - Aluno: João Augusto - 26/08/22");
            System.out.println(
                    "------------ Menu ------------ \n 1 - Ligar/Desligar \n 2 - Abrir/fechar \n 3 - Atualizar tempo \n 4 - Pausar/Despausar \n 5 - Tirar da tomada");
            opcoes = ler.nextInt();

            switch (opcoes) {
                case 1:
                    if (micro.ligarDesligar()) {
                        System.out.println("\n Microondas ligado.");
                    } else {
                        System.out.println("\n Microondas desligado.");
                    }
                    break;
                case 2:
                    if (micro.abrirFechar()) {
                        System.out.println("\n Porta aberta.");
                    } else {
                        System.out.println("\n Porta fechada.");
                    }
                    break;
                case 3:
                    System.out.println("Segundos:");
                    int seg = ler.nextInt();
                    System.out.println("Minutos");
                    int min = ler.nextInt();
                    if (micro.atualizarTemporalizador(seg, min)) {
                        System.out.println("\n Tempo atualizado!");
                        System.out.println(micro.verTemp());
                    } else {
                        System.out.println("\n Não foi possivel atualizar o tempo.");
                    }
                    break;
                case 4:
                    if(micro.pausar()){
                        System.out.println("\n Pausado.");
                    }else{
                        System.out.println("\n Despausado.");
                    }
                    break;
                case 5:
                    opcoes = 5;
                    break;
            }
        }

    }
}
