package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        System.out.println("Processo Seletivo");
        analisarCandidato(1900);
        analisarCandidato(2000);
        analisarCandidato(2200);

        selecaoCandidato();

    }

    static void selecaoCandidato(){
        String [] candidatos = {
            "FELIPE",
            "MARCIA",
            "JULIA",
            "PAULO",
            "AUGUSTO",
            "MONICA",
            "FABRICIO",
            "MIRELA",
            "DANIELA",
            "JORGE"
        };

        double salarioBase = 2000.0;
        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato "+ candidato + " solicitou este valor de salário " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi SELECIONADO para a VAGA");
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }
    }

    // Método que simula o valor pretendido

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1600, 2200);
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CONDIDATO COM CONTRA PROPOSTA");
            
        } else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
            
        }
    }
}