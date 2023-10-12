package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        System.out.println("Processo Seletivo");
        analisarCandidato(1900);
        analisarCandidato(2000);
        analisarCandidato(2200);

        selecaoCandidato();

        imprimirSelecionados();

    }

    static void imprimirSelecionados(){
        String [] candidatosSelecionados = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};
		
		System.out.println("Imprimindo com a ordem de seleção pelo índice");
		for(int x = 0; x < candidatosSelecionados.length; x++) {
			System.out.println((x + 1)+ "° Candidato é " + candidatosSelecionados [x] );
		}
		
        //forma abrevida
		System.out.println("Imprimindo todos sem a necessidade de exibir o índice");
		
		for(String candidato: candidatosSelecionados) {
			System.out.println(candidato);
		}

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