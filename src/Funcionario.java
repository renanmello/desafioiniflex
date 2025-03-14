import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.LocalDate;

public class Funcionario extends Pessoa{
    private BigDecimal salario;
    private String funcao;

    //construtor do funcionario
    public Funcionario(String nome, LocalDate dataNascimento, BigDecimal salario, String funcao) {
        //parametros da classe pai (Pessoa).
        super(nome, dataNascimento);
        this.salario = salario;
        this.funcao = funcao;
    }

    public BigDecimal getSalario() {
        return salario;
    }
    //funcao para aumentar o salario dos funcionarios conforme o percentual recebido
    public void aumentarSalario(BigDecimal percentual) {
        this.salario = this.salario.add(this.salario.multiply(percentual));
    }

    public String getFuncao() {
        return funcao;
    }

    @Override
    public String toString() {
        //formatar do jeito que o requisito pede
        DecimalFormat df = new DecimalFormat("#,##0.00");
        return super.toString() + ", Salário: R$ " + df.format(salario) + ", Função: " + funcao;
    }
}
