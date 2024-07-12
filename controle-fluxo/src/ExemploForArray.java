public class ExemploForArray {
    public static void main(String[] args) {

        // em arrays o indice de elementos inicia em ZERO
        String alunos [] = {"FELIPE", "JONAS", "JULIA", "MARCOS"};

        for (int x=0; x < alunos.length; x++){
            System.out.println("o aluno no indice x= " + x + " é " + alunos [x]);
        }
    }
}
