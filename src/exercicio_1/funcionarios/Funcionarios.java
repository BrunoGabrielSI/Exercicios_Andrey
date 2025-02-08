package exercicio_1.funcionarios;

public class Funcionarios {
    private int id;
    private String name;
    private Double salario;

    public Funcionarios(int id, String name, Double salario) {
        this.id = id;
        this.name = name;
        this.salario = salario;
    }

    public Double getSalario() {
        return salario;
    }
}