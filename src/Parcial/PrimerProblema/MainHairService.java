package Parcial.PrimerProblema;

public class MainHairService {
    public static void main(String[] args) {
        HairService infoHaircut = HairService.HAIRCUT;
        HairService infoNails = HairService.NAILS;
        HairService infoInk = HairService.INK;

        System.out.println("Welcome to our Skincare, let me show you our catalogue:" + "\n------------");
        System.out.println(infoHaircut.showServiceDescription());
        System.out.println(infoNails.showServiceDescription());
        System.out.println(infoInk.showServiceDescription());
    }
}
