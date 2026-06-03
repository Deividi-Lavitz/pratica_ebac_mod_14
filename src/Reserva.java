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

}
