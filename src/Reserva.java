import java.util.Arrays;
import java.util.List;

public class Reserva {
    String nomeHospede;
    String tipoQuarto;
    int numeroDias;
    double valorDiaria;

    public Reserva(String nomeHospede, String tipoQuarto, int numeroDias, double valorDiaria){
        this.nomeHospede = nomeHospede;
        this.tipoQuarto = tipoQuarto;
        this.numeroDias = numeroDias;
        this.valorDiaria = valorDiaria;
    }

    //Contrutor criado com base no requisito
    public Reserva(String nomeHospede, String tipoQuarto){
        this.nomeHospede = nomeHospede;
        this.tipoQuarto = tipoQuarto;
    }

    public String getNomeHospede(){ return nomeHospede; }

    public String getTipoQuarto(){ return tipoQuarto; }

    public int getNumeroDias(){ return numeroDias; }

    public double getValorDiaria(){ return valorDiaria; }

    public void setNomeHospede(String nomeHospede){ this.nomeHospede = nomeHospede; }

    public void setTipoQuarto(String tipoQuarto){ this.tipoQuarto = tipoQuarto; }

    public void setNumeroDias(int numeroDias){ this.numeroDias = numeroDias; }

    public void setValorDiaria(double valorDiaria){ this.valorDiaria = valorDiaria; }

    public double calcularValorTotal(){
        return this.numeroDias * this.valorDiaria;
    }

    @Override
    public String toString() {
        return
                "Nome do hospede: " + this.nomeHospede + "\n" +
                "Tipo de quarto: " + this.tipoQuarto + "\n" +
                "Número de dias: " + this.numeroDias + "\n" +
                "Valor da diária: " + this.valorDiaria + "\n" +
                "Valor total: " + calcularValorTotal() + "\n";
    }

    //Validações referente as reservas

    //Valida por um nome com ao menos 2 caracteres e não aceita numeros
    public static boolean nomeValido(String nome) {
        String regexNomeValido = "^[\\p{L} ]+$";

        return nome.matches(regexNomeValido);
    }

    //Valida em lower case se o nome informado é um dos tipos de quarto válidos
    public static boolean tipoValido(String nome) {
        List<String> list = Arrays.asList(new String[]{"standard", "luxo", "presidencial"});
        return list.contains(nome.toLowerCase());
    }

    //Valida o numero de dias para que seja qualquer numero menos zero
    //isso evita tambem numeros negativos pois nao acieta sinal
    public static boolean estadiaValida(String numero) {
        String regexEstadiaValida = "^(?!0$)\\d+$";

        return numero.matches(regexEstadiaValida);
    }

    //Valida se o valor da diaria está com duas casas decimais
    public static boolean diariaValida(String numero) {
        String regexDiariaValida = "^\\d+\\.\\d{2}$";

        return numero.matches(regexDiariaValida);
    }
}



