public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("Tv ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);
        
        smartTv.ligar ();
        System.out.println("Novo Status -> Tv ligada? " + smartTv.ligada);
    
        smartTv.desligar ();
        System.out.println("Novo Status -> Tv ligada? " + smartTv.ligada);
    
        smartTv.aumentarVolume ();
        System.out.println("Volume " + smartTv.volume);
    
        smartTv.diminuirVolume ();
        System.out.println("Volume " + smartTv.volume);
    
        smartTv.aumentarCanal ();
        System.out.println("Canal " + smartTv.canal);
    
        smartTv.diminuirCanal ();
        System.out.println("Canal " + smartTv.canal);

        smartTv.mudarCanal (13);
        System.out.println("Canal " + smartTv.canal);
    }
}
