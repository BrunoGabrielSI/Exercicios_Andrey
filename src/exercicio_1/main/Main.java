package exercicio_1.main;

import exercicio_1.funcionarios.Funcionarios;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Funcionarios> funcionarios = new ArrayList<>();
        funcionarios.add(new Funcionarios(1, "Bruno", 3000.0));
        funcionarios.add(new Funcionarios(2, "Dennis", 4000.0));
        funcionarios.add(new Funcionarios(3, "Augusto", 5000.0));
        funcionarios.add(new Funcionarios(4, "Ana Julia", 6000.0));
        funcionarios.add(new Funcionarios(5, "Filipe", 7000.0));

        double somaSalarios = 0;
        for (Funcionarios funcionario : funcionarios) {
            somaSalarios += funcionario.getSalario();
        }

        double mediaSalarios = somaSalarios / funcionarios.size();
        DecimalFormat df = new DecimalFormat("#.00");
        String mediaFormatada = df.format(mediaSalarios);

        System.out.println("A média de salários desta empresa é R$ " + mediaFormatada.replace(".", ","));
    }
}