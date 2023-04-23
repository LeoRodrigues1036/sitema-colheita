package funcionario;

public class Funcionario {
    private String nome;
    private int idade;
    private double valorHora;
    private String funcao;
    public int quantidadeHoras;

    protected static final double VALOR_HORA_PADRAO = 10.0;
    protected static final int LIMITE_HORAS_PADRAO = 40; // Example value
    protected static final int LIMITE_HORAS_SEMANAIS = 60; // Example value
    protected static final double ACRESCIMO_PORCENTAGEM = 0.5; // Example value

    public Funcionario(String nome, int idade,String funcao, int quantidadeHoras) {
        this.nome = nome;
        this.idade = idade;
        this.funcao = funcao;
        this.quantidadeHoras = quantidadeHoras;
        this.valorHora = VALOR_HORA_PADRAO;
    }

       // Getters
       public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getValorHora() {
        return valorHora;
    }

    public String getFuncao() {
        return funcao;
    }

    public int getQuantidadeHoras() {
        return quantidadeHoras;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    public void setQuantidadeHoras(int quantidadeHoras) {
        this.quantidadeHoras = quantidadeHoras;
    }

    public double calcularSalario(int quantidadeHoras) {
        int horasExcedentes = Math.max(0, quantidadeHoras - LIMITE_HORAS_PADRAO);
        horasExcedentes = Math.min(horasExcedentes, LIMITE_HORAS_SEMANAIS - LIMITE_HORAS_PADRAO);
        double salarioPadrao = VALOR_HORA_PADRAO * LIMITE_HORAS_PADRAO;
        double salarioExcedente = valorHora * horasExcedentes * (1 + ACRESCIMO_PORCENTAGEM);
        return salarioPadrao + salarioExcedente;
    }
}



