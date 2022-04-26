package estruturascondicionais2compostas.atividades;

public class Exemplo5_ForEach {
	public static void main(String[] args) {
        simuladorForEach();
        simuladorForEachComSplit();

//        for(int i = 0; i < alunos.length; i++){
//
//            System.out.println(alunos[i]);
//        }

            }
        static void simuladorForEach(){
            String alunos [] =  {"Paulo","Bruno","Edi","Fabio", "Gabriel", "Renato"};
            for(String aluno : alunos) {
                System.out.println(aluno);
            }
            System.out.println("-------------------------");
        }
        static void simuladorForEachComSplit (){
            String integrantesEquipe = "Paulo Bruno Edi Fabio Gabriel Renato";
            String alunos[] = integrantesEquipe.split(" ");
            for(String aluno : alunos) {
                System.out.println(aluno);
            }
        }

static void simuladorForEachComNumero() {
            Integer numeros[] = {12, 25, 35, 88, 99, 10, 13};
            for (Integer numero : numeros) {
                System.out.println(numero);
            }
}
}



