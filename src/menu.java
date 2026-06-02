import java.util.Scanner;

public class menu {

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
        opcoesDoMenu();



    }
}
