public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "M"; // M / T / B

        switch (plano){
            case "T": {
                System.out.println("5GB de Youtube");
            }
            case "M":{
                System.out.println("Whatsapp e Instagram ilimitado");
            }
            case "B":{
                System.out.println("Plano com 100 minutos de ligação");
            }
                
        }
    }
}
