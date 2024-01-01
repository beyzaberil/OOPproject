import java.util.Scanner;
public class day7 implements Iactivities {
Scanner scanner = new Scanner(System.in);
    @Override
    public void uyanma() {
        System.out.println("Bugün saat kaçta kalksam?");
        System.out.println("1. 10.00\n"
                + "2. 11.00\n"
                + "3. 12.00\n"
                + "4. 13.00\n");
        int uyanmaSaati = scanner.nextInt();
        switch (uyanmaSaati) {
            case 1:
                System.out.println("Ben de tam olarak böyle düşünüyordum!");
                break;
            case 2:
                System.out.println("Güne erken başlamayı daha çok severim. O yüzden 10.00'da uyandım.");
                break;
            case 3:
                System.out.println("Düşündüğümden daha uykucuymuşsun. Ben 10.00'da kalktım.");
                break;
            case 4:
                System.out.println("Ohooo bütün gün bitti. Ben 10.00'da uyandım.");
                break;
            default:
                System.out.println("Geçerli bir seçenek tuşlamadın ama ne yapacağımı söyleyeyim. Bu gün 10.00'da uyanmayı tercih ettim.");
        }
        System.out.println("**************************************************************************************************************");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void dersCalisma(){
        System.out.println("Ders çalışmam gerektiği için herkesten önce güne başlayıp iki saat rahatça ders çalıştım.");
        System.out.println("**************************************************************************************************************");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    @Override
    public void kahvalti() {
        System.out.println("Kalabalık masaları çok sevdiğimi daha önce de söylemiştim, Bugün de tam sevdiğim gibi tüm aile masadaydık. Dedem, ananem, annem, teyzem, ablam ve ben. Çok keyifli bir kahvaltıydı.");
        System.out.println("**************************************************************************************************************");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void havuz(){
        System.out.println("Karnımızı doyurduktan sonra havuza indik ve 3-4 saat yüzdük.Peki sence termal havuzu mu daha çok seviyorum yoksa yüzme havuzunu mu?");
        System.out.println("1. Termal havuzu daha çok seversin gibi.\n"
                + "2. Bence sen yüzme havuzunu seversin.\n");
        int havuzTercihi = scanner.nextInt();
        switch (havuzTercihi) {
            case 1:
                System.out.println("Eskiden ananemlere çok şaşırırdım nasıl termali seviyorlar diye ama artık ben de termal havuzu tercih ediyorum... Doğru bildin!");
                break;
            case 2:
                System.out.println("Eskiden ananemlere çok şaşırırdım nasıl termali seviyorlar diye ama artık ben de termal havuzu tercih ediyorum...Bu sefer yanıldın.");
                break;
            default:
                System.out.println("Geçerli bir seçenek tuşlamadın ama ne yapacağımı söyleyeyim. Eskiden ananemlere çok şaşırırdım nasıl termali seviyorlar diye ama artık ben de termal havuzu tercih ediyorum...");
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
        System.out.println("Annemler akşam yemeği hazırlamış, havuzdan döner dönmez karnımı doyurdum.");
        System.out.println("**************************************************************************************************************");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void uyuma() {
        System.out.println("Bugün yine hiç ders çalışamadığım için vicdanım rahatsız. Ama çok da yorgunum. Sence ne yapmalıyım?");
        System.out.println("1. İçin rahat değilse biraz kendini zorla az da olsa ders çalış öyle uyu bence.\n"
                + "2. Zaten çok yoruldun. Yatıp dinlenmelisin.\n");
        int uyku = scanner.nextInt();
        switch (uyku){
            case 1:
                System.out.println("Haklısın ama gerçekten içimden gelmiyor. Bu günlük direkt uyuyacağım. Yarın telafi etmeye çalışırım.");
                break;
            case 2:
                System.out.println("Haklısın o yüzden bu günlük direkt uyuyacağım. Yarın telafi etmeye çalışırım:(");
                break;
            default:
                System.out.println("Geçerli bir seçenek tuşlamadın ama yine de ne yapacağımı söyleyeyim. Bu günlük direkt uyuyacağım. Yarın telafi etmeye çalışırım.");
        }
        System.out.println("**************************************************************************************************************");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Haftayı tamamen tamamladık! Umarım keyifli bir günlük uygulaması olmuştur. Ben seninle sohbet etmekten çok keyif aldım.");
        System.out.println("Kendine iyi bak!");
        System.out.println("**************************************************************************************************************");

    }
}
