
public class Usuario {

    public static void main(String[] args) throws Exception {
        
        SmartTV smartTV = new SmartTV();

        System.out.println("TV Ligada? " + smartTV.ligada);
        System.out.println("Canal Atual? " + smartTV.canal);
        System.out.println("Volume Atual? " + smartTV.volume);

        smartTV.ligar();
        System.out.println("NOVO STATUS: TV Ligada? " + smartTV.ligada);

        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.aumentarVolume();
        
        smartTV.mudarCanal(13);
        System.out.println("NOVO CANAL: " + smartTV.canal);

    }
}
