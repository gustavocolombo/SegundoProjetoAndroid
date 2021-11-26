package dadm.com.example.trabalhonavegacaoactivities;

public class Time {
    public static int contadorId = 0;

    private int id;
    private String Nome;
    private String Cores;
    private String Regiao;

    public Time(String nome, String cores, String regiao) {
        this.id = contadorId++;
        Nome = nome;
        Cores = cores;
        Regiao = regiao;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getCores() {
        return Cores;
    }

    public void setCores(String cores) {
        Cores = cores;
    }

    public String getRegiao() {
        return Regiao;
    }

    public void setRegiao(String regiao) {
        Regiao = regiao;
    }

    @Override
    public String toString() {
        return Nome + "-" + Cores;
    }
}
