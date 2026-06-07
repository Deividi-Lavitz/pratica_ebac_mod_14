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

    //Valida por um nome com ao menos 2 caracteres aceita letras e numeros porem precisa ao menos uma letra
    public static boolean tipoValido(String nome) {
        String regexTipoValido = "^(?=.*[A-Za-z])[A-Za-z0-9]{2,}$";

        return nome.matches(regexTipoValido);
    }

}
