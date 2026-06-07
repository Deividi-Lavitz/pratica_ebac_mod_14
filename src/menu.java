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
        int numeroDias;
        double valorDiaria;

        //Lista de reservas
        ArrayList<Reserva> listaDeReservas = new ArrayList<>(10);


        System.out.println("=====Sistema de Reserva de Quarto de Hoteis=====");

        //Loop do while para executar o menu até o user escolher a opção de sair
        do {
            opcoesDoMenu();
            input = sc.nextLine().trim();




            switch (input){
                case "1":
                    System.out.println(listaDeReservas.size());
                    do{
                        System.out.println("Digite o nome do hospede com ao menos 2 caracteres: ");
                        input = sc.nextLine().trim();
                    } while (!Reserva.nomeValido(input));

                    nome = input;

                    do{
                        System.out.println("Escolha o tipo de quarto (Standard, Luxo ou Presidencial):");
                        input = sc.nextLine().trim();
                    } while (!Reserva.tipoValido(input));

                    tipoQuarto = input;

                    do{
                        System.out.println("Digite quantos dias de estadia (mínimo 1): ");
                        input = sc.nextLine().trim();
                    } while (!Reserva.estadiaValida(input));

                    numeroDias = Integer.parseInt(input);

                    do{
                        System.out.println("Digite o valor da diária no formato '10.00': ");
                        input = sc.nextLine().trim();
                    } while (!Reserva.diariaValida(input));

                    valorDiaria = Double.parseDouble(input);


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
