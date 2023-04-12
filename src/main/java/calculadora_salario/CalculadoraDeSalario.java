package calculadora_salario;

import java.util.HashMap;
import java.util.Map;

public class CalculadoraDeSalario {
    public static double calcularSalarioLiquido(Funcionario funcionario) {
        switch (funcionario.getCargo()) {
            case "DESENVOLVEDOR":
                if (funcionario.getSalarioBase() >= 3000) {
                    return funcionario.getSalarioBase() * 0.8;
                }

                return funcionario.getSalarioBase() * 0.9;
            default:
                return funcionario.getSalarioBase();
        }
    }
}
