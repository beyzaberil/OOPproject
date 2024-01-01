import java.util.Scanner;
public class day5 implements Iactivities {
Scanner scanner = new Scanner(System.in);
    @Override
    public void uyanma() {
        System.out.println("Bugün saat kaçta kalksam?");
        System.out.println("1. 10.00\n"
                + "2. 11.00\n"
                + "3. 12.00\n"
                + "4. 13.00\n");
        int saatKac = scanner.nextInt();
        System.out.println("Bu sefer seni biraz şaşırtacağım. 6.00'da uyandım.");
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
                + "3. Bursa\n"
                + "4. Bolu\n");
        int birinciAktivite = scanner.nextInt();
        switch (birinciAktivite) {
            case 1:
                System.out.println("Ereğlim de ereğlim <3 Ereğli doğup büyüdüğüm şehir ve bir şehir ne kadar sevilebilirse o kadar seviyorum fakat yolculuk oraya değil. Kuzenimin nişanına Bursa'ya gidiyorum.");
                break;
            case 2:
                System.out.println("İzmir'i çok severim fakat kışın gitmeyi tercih edeceğim bir yer pek değil. Bursa'ya kuzenimin nişanına gideceğim.");
                break;
            case 3:
                System.out.println("Vay be, doğru bildin! Bursa'ya gideceğim çünkü kuzenimin nişanı var.");
                break;
            case 4:
                System.out.println("Dün Bolu'ya gideceğimi söylediğim için Bolu'yu seçmekte haklısın fakat kuzenimin nişanı olduğu için ilk önce Bursa'ya, oradan boluya gideceğim.");
                break;
            default:
                System.out.println("Geçerli bir seçenek tuşlamadın ama yine de nereye gideceğimi söyleyeyim. Bugün Bursa'ya kuzenimin nişanına gideceğim.");
        }
        System.out.println("**************************************************************************************************************");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    @Override
    public void kahvalti() {
        System.out.println("Kahvaltı yapmayı çok severim fakat bugün yola erken çıkmamız gerektiği için kahvaltı yapamadım. Arabada giderken bir şeyler atıştırdık.");
        System.out.println("**************************************************************************************************************");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void nisan(){
        System.out.println("Bursa'ya vardık ve direkt nişana geçtik. Sence ben evlendiğimde nişan, düğün yapmak ister miyim?");
        System.out.println("1. Evet, tam kusursuz düğün isteyen bir insana benziyorsun.\n"
                + "2. Hayır, bence böyle şeyleri pek umursamıyor gibisin.\n");
        int nisanTercihi = scanner.nextInt();
        switch (nisanTercihi){
            case 1:
                System.out.println("Yanıldın. Bence düğün, nişan uğruna bu kadar para harcamak saçmalık.");
                break;
            case 2:
                System.out.println("Beni gerçekten iyi tanımışsın. Bence düğün, nişan uğruna bu kadar para harcamak saçmalık.");
                break;
            default:
                System.out.println("Geçerli bir seçenek tuşlamadın ama yine de fikrimi söyleyeyim. Bence düğün, nişan uğruna bu kadar para harcamak saçmalık.");
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
        System.out.println("Akşam yemeğimizi nişanda yedik. Nişandan sonra da kuzenlerime geçtim.");
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
        System.out.println("Koskoca beş günün sonuna geldik! Artık beni iyice tanıdığını düşünüyorum. Hazırsan altıncı güne geçiyoruuuummmm.");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("**************************************************************************************************************");

    }
}
