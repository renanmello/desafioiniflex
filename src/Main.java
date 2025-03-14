import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();

        //Requisito 3.1 -  Inserir todos os funcionários, na mesma ordem e informações da tabela acima.
        funcionarios.add(new Funcionario("Maria", LocalDate.of(2000, 10, 18), new BigDecimal("2009.44"), "Operador"));
        funcionarios.add(new Funcionario("João", LocalDate.of(1990, 5, 12), new BigDecimal("2284.38"), "Operador"));
        funcionarios.add(new Funcionario("Caio", LocalDate.of(1961, 5, 2), new BigDecimal("9836.14"), "Coordenador"));
        funcionarios.add(new Funcionario("Miguel", LocalDate.of(1988, 10, 14), new BigDecimal("19119.88"), "Diretor"));
        funcionarios.add(new Funcionario("Alice", LocalDate.of(1995, 1, 5), new BigDecimal("2234.68"), "Recepcionista"));
        funcionarios.add(new Funcionario("Heitor", LocalDate.of(1999, 11, 19), new BigDecimal("1582.72"), "Operador"));
        funcionarios.add(new Funcionario("Arthur", LocalDate.of(1993, 3, 31), new BigDecimal("4071.84"), "Contador"));
        funcionarios.add(new Funcionario("Laura", LocalDate.of(1994, 7, 8), new BigDecimal("3017.45"), "Gerente"));
        funcionarios.add(new Funcionario("Heloísa", LocalDate.of(2003, 5, 24), new BigDecimal("1606.85"), "Eletricista"));
        funcionarios.add(new Funcionario("Helena", LocalDate.of(1996, 9, 2), new BigDecimal("2799.93"), "Gerente"));

        //Requisito 3.2 - Remover o funcionário “João” da lista.
        funcionarios.removeIf(f -> f.getNome().equals("João"));

        //Requisito 3.3 - Imprimir funcionários
        System.out.println("\nLista de funcionários:");
        funcionarios.forEach(System.out::println);

        //Requisito 3.4 - Os funcionários receberam 10% de aumento de salário,
        // atualizar a lista de funcionários com novo valor.
        funcionarios.forEach(f -> f.aumentarSalario(new BigDecimal("0.10")));
        System.out.println("\nLista de funcionários Atualizada:");
        funcionarios.forEach(System.out::println);

        //Requisito 3.5 - Agrupar os funcionários por função em um MAP,
        //sendo a chave a “função” e o valor a “lista de funcionários”.
        Map<String, List<Funcionario>> funcionariosPorFuncao = new HashMap<>();

        for (Funcionario funcionario : funcionarios) {
            String funcao = funcionario.getFuncao();
            if (!funcionariosPorFuncao.containsKey(funcao)) {
                funcionariosPorFuncao.put(funcao, new ArrayList<>());
            }
            funcionariosPorFuncao.get(funcao).add(funcionario);
        }


        //Requisito 3.6 - Imprimir funcionários agrupados por função
        System.out.println("\nFuncionários agrupados por função:");
        funcionariosPorFuncao.forEach((funcao, lista) -> {
            System.out.println(funcao + ":");
            lista.forEach(System.out::println);
        });

        //Requisito 3.8 - Imprimir os funcionários que fazem aniversário no mês 10 e 12.
        System.out.println("\nFuncionários que fazem aniversário em outubro e dezembro:");
        funcionarios.stream()
                .filter(f -> List.of(10, 12).contains(f.getDataNascimento().getMonthValue()))
                .forEach(f -> System.out.println(f.getNome() + " " + f.getDataNascimento()));

        //Requisito 3.9 -Imprimir o funcionário com a maior idade, exibir os atributos: nome e idade.
        Collections.sort(funcionarios, Comparator.comparing(Funcionario::getDataNascimento));
        Funcionario maisVelho = funcionarios.isEmpty() ? null : funcionarios.getFirst();

        if (maisVelho != null) {
            System.out.println("\nFuncionário mais velho:");
            int idade = LocalDate.now().getYear() - maisVelho.getDataNascimento().getYear();
            System.out.println("Nome: " + maisVelho.getNome() + ", Idade: " + idade + " anos");
        }

        //Requisito 3.10 -  Imprimir a lista de funcionários por ordem alfabética.
        System.out.println("\nFuncionários em ordem alfabética:");
        funcionarios.stream()
                .sorted(Comparator.comparing(Funcionario::getNome))
                .forEach(System.out::println);

        //Requisito 3.11 - Imprimir o total dos salários dos funcionários.
        BigDecimal totalSalarios = BigDecimal.ZERO;

        for (Funcionario f : funcionarios) {
            totalSalarios = totalSalarios.add(f.getSalario());
        }

        DecimalFormat df = new DecimalFormat("#,##0.00");
        System.out.println("\nTotal dos salários: R$ " + df.format(totalSalarios));

        // 3.12 - Imprimir quantos salários mínimos ganha cada funcionário,
        //considerando que o salário mínimo é R$1212.00.
        BigDecimal salarioMinimo = new BigDecimal("1212.00");
        System.out.println("\nSalários mínimos por funcionário:");
        funcionarios.forEach(f -> {
            BigDecimal salariosMinimos = f.getSalario().divide(salarioMinimo, 2, RoundingMode.DOWN);
            System.out.println(f.getNome() + " recebe " + salariosMinimos + " salários mínimos.");
        });
    }
}
