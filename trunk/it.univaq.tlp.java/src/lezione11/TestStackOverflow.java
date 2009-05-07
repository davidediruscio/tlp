package lezione11;

public class TestStackOverflow {
    static int numeroChiamata;

    public static void main(String[] args) {
         funzioneRicorsiva();
    }
    
    public static void funzioneRicorsiva() {
         System.out.println("Invocazione metodo numero: " + numeroChiamata++);
         funzioneRicorsiva();
    }
}
