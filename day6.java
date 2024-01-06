import java.util.Scanner;
public class day6 implements Iactivities {
Scanner scanner = new Scanner(System.in);
    @Override
    public void uyanma() {
        System.out.println("Bugün saat kaçta kalksam?");
        System.out.println("1. 10.00\n"
                + "2. 11.00\n"
                + "3. 12.00\n"
                + "4. 13.00\n");
        int saatKac = scanner.nextInt();
        System.out.println("Yine seni biraz şaşırtacağım. 8.00'da uyandım.");
        System.out.println("**************************************************************************************************************");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    @Override
    public void kahvalti() {
        System.out.println("Sabah 9.00 gibi kuzenlerim, babam, yengem hep beraber kahvaltı yaptık. Kalabalık masalar beni çok mutlu ediyor.");
        System.out.println("**************************************************************************************************************");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void kahve(){
        System.out.println("Kahvaltı bittikten sonra herkese türk kahvesi yaptım, afiyetle içtik. Kahveye bayılıyorum...");
        System.out.println("**************************************************************************************************************");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void yolculuk(){
        System.out.println("Erken kalkmamın bir sebebi vardı tabiki. Bu gün yolculuk günü. Hangi şehre gitsem?");
        System.out.println("1. Kdz. Ereğli\n"
                + "2. İzmir\n"
                + "3. Ankara\n"
                + "4. Bolu\n");
        int yolNereye = scanner.nextInt();
        switch (yolNereye) {
            case 1:
                System.out.println("Ereğlim de ereğlim <3 Ereğli doğup büyüdüğüm şehir ve bir şehir ne kadar sevilebilirse o kadar seviyorum fakat yolculuk oraya değil. Bolu'ya annemlerin yanına gideceğimmm.");
                break;
            case 2:
                System.out.println("İzmir'i çok severim fakat kışın gitmeyi tercih edeceğim bir yer pek değil. Bolu'ya annemlerin yanına gideceğimmm.");
                break;
            case 3:
                System.out.println("Daha Ankara'ya dönme vakti gelmedi.Bolu'ya annemlerin yanına gideceğimmm.");
                break;
            case 4:
                System.out.println("Vay be, doğru bildin! Bolu'ya annemlerin yanına gideceğimmm.");
                break;
            default:
                System.out.println("Geçerli bir seçenek tuşlamadın ama yine de nereye gideceğimi söyleyeyim. Bolu'ya annemlerin yanına gideceğimmm..");
        }
        System.out.println("**************************************************************************************************************");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    @Override
    public void aksamYemegi() {
        System.out.println("Varır varmaz otelin restorantında akşam yemeği yedik. Yemek çok lezzetliydi!");
        System.out.println("**************************************************************************************************************");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void havuz(){
        System.out.println("Günümüz boşa geçmesin diye hemen havuza gittik. Yüzmeyi baya özlemişim.");
        System.out.println("**************************************************************************************************************");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    @Override
    public void uyuma() {
        System.out.println("Bugün hiç ders çalışamadığım için vicdanım rahatsız. Ama çok da yorgunum. Sence ne yapmalıyım?");
        System.out.println("1. İçin rahat değilse biraz kendini zorla az da olsa ders çalış öyle uyu bence.\n"
                + "2. Zaten çok yoruldun. Yatıp dinlenmelisin.\n");
        int uyku = scanner.nextInt();
        switch (uyku){
            case 1:
                System.out.println("Haklısın, biraz kendimi zorladım ve bir saat kadar ders çalıştım. Artık uyku vakti!");
                break;
            case 2:
                System.out.println("Haklısın ama ders konusunda bahanelere sığınmamak gerekiyor. O yüzden bir saat kadar ders çalışacağım ve sonra uyuyacağım. İyi geceler!");
                break;
            default:
                System.out.println("Geçerli bir seçenek tuşlamadın ama yine de ne yapacağımı söyleyeyim. Biraz kendimi zorladım ve bir saat kadar ders çalıştım.");
        }
        System.out.println("Haftanın altıncı gününün sonuna geldik! Beraber son bir günümüz kaldı. Hazırsan haftanın son güne geçiyoruuuuzzzz!!!!");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("**************************************************************************************************************");

        }
    }

