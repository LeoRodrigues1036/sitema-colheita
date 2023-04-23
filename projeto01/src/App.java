import cultura.CulturaAnual;
import funcionario.Funcionario;

public interface App {
    public static void main(String[] args) {
        Funcionario f = new Funcionario("João", 30, "Gerente",20);
        System.out.println("Nome: " + f.getNome());
        System.out.println("Idade: " + f.getIdade());
        System.out.println("Função: " + f.getFuncao());

        System.out.println( "---------COLHEITA--------");
        CulturaAnual c = new CulturaAnual("Milho", 100.5, "Fazenda ABC", "Setembro a Dezembro", 90, "João");
        System.out.println("Nome: " + c.getNome());
        System.out.println("Área total plantada: " + c.getAreaTotalPlantada() + " hectares");
        System.out.println("Localização: " + c.getLocalizacao());
        System.out.println("Período de plantação: " + c.getPeriodoPlantacao());
        System.out.println("Tempo de colheita: " + c.getTempoColheita() + " Horas");
        System.out.println("Responsável pela plantação: " + c.getResponsavelPlantacao());

        int quantidadeHorasTrabalhadas = c.getTempoColheita(); 
        double salario = f.calcularSalario(quantidadeHorasTrabalhadas);
        System.out.println("O salário de " + f.getNome() + " é: R$" + salario);

    }
}