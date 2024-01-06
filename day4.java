import java.util.Scanner;
public class day4 implements Iactivities {
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
                System.out.println("Biraz erken değil mi? 11.00'da kalkmayı tercih ederim.");
                break;
            case 2:
                System.out.println("Ben de tam olarak böyle düşünüyordum!");
                break;
            case 3:
                System.out.println("Düşündüğümden daha uykucuymuşsun. Ben 11.00'da kalktım.");
                break;
            case 4:
                System.out.println("Ohooo bütün gün bitti. Ben 11.00'da uyandım.");
                break;
            default:
                System.out.println("Geçerli bir seçenek tuşlamadın ama kaçta kalkacağımı söyleyeyim. Bugün 11.00'da uyandım.");
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
        System.out.println("Bugün ders çalışmaya gideceğim ama gitmeden önce ne yapsam?");
        System.out.println("1. Ne kadar erken başlarsan o kadar iyi. Hemen evden çık.\n"
                + "2. Hızlıca bir şeyler atıştır, aç aç gitme.\n");
        int birinciAktivite = scanner.nextInt();
        switch (birinciAktivite) {
            case 1:
                System.out.println("Haklısın ama bu sabah çok aç uyandım o yüzden önce bir şeyler atıştırıp öyle derse başlayacağım.");
                break;
            case 2:
                System.out.println("Ben de tam olarak böyle düşünüyordum!");
                break;
            default:
                System.out.println("Geçerli bir seçenek tuşlamadın ama kaçta kalkacağımı söyleyeyim. Hızlıca bir şeyler atıştırıp derse başlayacağım.");
        }
        System.out.println("**************************************************************************************************************");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void dersCalisma(){
        System.out.println("OOP mantığı kafamda çok oturmamıştı o yüzden bir süredir BTK'nın OOP eğitimini izliyordum. Bu gün bunu bitirdim ve bence çok faydalı oldu.");
        System.out.println("**************************************************************************************************************");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void valizHazirla(){
        System.out.println("Ailem boluda termal otel tutmuş ve beni yanlarına çağırdılar. Sence ne yapsam?");
        System.out.println("1. Kim uğraşacak şimdi yolculuk, valiz falan. Boşver bence otur evinde.\n"
                + "2. Çok keyifli bir aktiviteye benziyor. Bence kaçırma!");
        int ikinciAktivite = scanner.nextInt();
        switch (ikinciAktivite) {
            case 1:
                System.out.println("Bu konuda aynı düşünmüyoruz sanırım. Ben yolculuk yapmayı ve tatile gitmeyi çok severim ve bu etkinlik için çok heyecanlıyım. O yüzden hemen valizimi hazırladım ve bir süre burada olmayacağım için evi toparladım.");
                break;
            case 2:
                System.out.println("Kesinlikle katılıyorum! Ben yolculuk yapmaya ve tatile gitmeye bayılırım ve bu etkinlik için çok heyecanlıyım. O yüzden hemen valizimi hazırladım ve bir süre burada olmayacağım için evi toparladım.");
                break;
            default:
                System.out.println("Geçerli bir seçenek tuşlamadın ama ne yapacağımı söyleyeyim. Hemen valizimi hazırlayıp evi toparlayacağım. Tatile gidiyoruuuuzzzz!!!!");
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
        System.out.println("Ev arkadaşım yemek hazırlamayı unuttu o yüzden hızlıca bir şeyler hazırlayıp yedik.");
        System.out.println("**************************************************************************************************************");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    @Override
    public void uyuma() {
        System.out.println("Saat iyice geç oldu o yüzden biraz kitap okuyup hemen uyumaya geçtim. Yarın güzel bir gün olur umarım!");
        System.out.println("**************************************************************************************************************");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Veeeeee dördüncü günümün de sonuna geldik! Haftamın yarısından çoğunu beraber geçirmiş olduk. Hazırsan beşinci günüme başlıyoruuuzzz!!!!!.");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("**************************************************************************************************************");
    }

}
