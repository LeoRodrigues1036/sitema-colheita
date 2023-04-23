package funcionario;

public class FuncionarioSafra extends Funcionario {
    private static final int LIMITE_HORAS_SEMANAIS = 60;
    private static final int LIMITE_HORAS_PADRAO = 40;
    private static final double ACRESCIMO_PORCENTAGEM = 0.3;
    private double bonusSafra;

    public FuncionarioSafra(String nome, int idade, String funcao, int quantidadeHoras, double bonusSafra) {
        super(nome, idade, funcao, quantidadeHoras);
        this.bonusSafra = bonusSafra;
    }

    @Override
    public double calcularSalario(int quantidadeHoras) {
        int horasExcedentes = Math.max(0, quantidadeHoras - LIMITE_HORAS_PADRAO);
        horasExcedentes = Math.min(horasExcedentes, LIMITE_HORAS_SEMANAIS - LIMITE_HORAS_PADRAO);
        double salarioPadrao = VALOR_HORA_PADRAO * LIMITE_HORAS_PADRAO;
        double salarioExcedente = getValorHora() * horasExcedentes * (1 + ACRESCIMO_PORCENTAGEM);
        return salarioPadrao + salarioExcedente + bonusSafra;
    }
}


