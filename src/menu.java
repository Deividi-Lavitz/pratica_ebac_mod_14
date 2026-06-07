import java.util.ArrayList;
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
        String input, nome, tipoQuarto;


        System.out.println("=====Sistema de Reserva de Quarto de Hoteis=====");

        //Loop do while para executar o menu até o user escolher a opção de sair
        do {
            opcoesDoMenu();
            input = sc.nextLine().trim();
            //Lista de reservas
            ArrayList<Reserva> listaDeReservas = new ArrayList<>(10);



            switch (input){
                case "1":
                    System.out.println(listaDeReservas.size());
                    do{
                        System.out.println("Digite o nome do hospede com ao menos 2 caracteres: ");
                        input = sc.nextLine().trim();
                    } while (!Reserva.nomeValido(input));

                    nome = input;

                    do{
                        System.out.println("Digite o tipo do quarto com ao menos 2 caracteres (letras ou letras e numeros): ");
                        input = sc.nextLine().trim();
                    } while (!Reserva.tipoValido(input));

                    tipoQuarto = input;




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
