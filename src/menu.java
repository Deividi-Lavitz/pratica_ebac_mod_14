import java.util.Scanner;

public class menu {
    //Função para imprimir o menu
    public static void opcoesDoMenu(){
        System.out.println("[1] - Nova reserva");
        System.out.println("[2] - Listar reservas");
        System.out.println("[3] - Buscar reserva por nome do hóspede");
        System.out.println("[4] - Ordenar reservas por número de dias");
        System.out.println("[5] - Sair ");
    }

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String input;


        System.out.println("=====Sistema de Reserva de Quarto de Hoteis=====");

        //Loop do while para executar o menu até o user escolher a opção de sair
        do {
            opcoesDoMenu();
            input = sc.nextLine().trim();

            switch (input){
                case "1":
                    System.out.println("Nova reserva criada");
                    break;
                case "2":
                    System.out.println("Listar reservas");
                    break;
                case "3":
                    System.out.println("Retornar reserva por nome");
                    break;
                case "4":
                    System.out.println("Retornar reservas ordenadas em ordem decrescente");
                    break;
                case "5":
                    System.out.println("Até Logo!");
                    break;
                //Opção default usada para tratar inputs inválidos
                default:
                    System.out.println("Opção inválida!\n");
                    break;
            }

        } while (!input.equals("5"));

        sc.close();



    }
}
