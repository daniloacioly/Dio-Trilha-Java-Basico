public class ExemploBreakContinue {
    public static void main(String[] args) {
        for (int numero =1; numero <=5; numero++){
            if(numero == 4)
                break; // Break para a interação

            System.out.println(numero);
        }
        for (int numero =1; numero <=5; numero++){
            if(numero == 3)
                continue; // Continue continua a interação, pulando o valor selecionado

            System.out.println(numero);
        }
    }
}
