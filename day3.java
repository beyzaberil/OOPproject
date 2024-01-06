import java.util.Scanner;

public class day3 implements Iactivities {
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
                System.out.println("Geçerli bir seçenek tuşlamadın ama ne yapacağımı söyleyeyim. Bugün 11.00'da kalkacağım.");
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
        System.out.println("Saat 12.00'da halamla güzel bir kahvaltı yaptık.");
        System.out.println("**************************************************************************************************************");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void dersVakti(){
        System.out.println("Bugün okula gitmem gerekiyor fakat hiç gidesim yok. Sence ne yapsam?");
        System.out.println("1. Her gün her gün okula mı gidilir? Boşver yat dinlen.\n"
                + "2. Dersi boşver arkadaşlarınla buluşmaya git.\n"
                + "3. Hemen eve dön, yat dinlen.\n"
                + "4. Bence dersine girmelisin.\n");
        int ikinciAktivite = scanner.nextInt();
        switch (ikinciAktivite){
            case 1:
                System.out.println("Maalesef gitmem gerekiyor. Hemen hazırlanıp evden çıktım ve okula geldim.");
                break;
            case 2:
                System.out.println("Arkadaşlarımla vakit geçirmeyi çok severim fakat dersim varken olmaz. Hemen hazırlanıp evden çıktım ve okula geldim.");
                break;
            case 3:
                System.out.println("Dersim varken ne eve dönmesinden bahsediyorsun? Hemen hazırlanıp evden çıktım ve okula geldim.");
                break;
            case 4:
                System.out.println("Sanırım haklısın. Hemen hazırlanıp evden çıktım ve okula geldim.");
                break;
            default:
                System.out.println("Hatalı tuşlama yaptın ama ben ne yaptığımı söyleyeyim.Hemen hazırlanıp evden çıktım ve okula geldim.");
        }
        System.out.println("**************************************************************************************************************");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void alisveris(){
        System.out.println("Okuldan döndüm ve halam alışverişe çağırdı. Sence ne alsam?");
        System.out.println("1. Yeni bir pantolon alabilirsin.\n"
                + "2. Yeni telefon al.\n"
                + "3. Yeni bir kazak alabilirsin, havalar çok soğuk bu sıralar.\n"
                + "4. Alışveriş ne ya ben hiç sevmem.\n");
        int ucuncuAktivite = scanner.nextInt();
        switch (ucuncuAktivite){
            case 1:
                System.out.println("Haklısın yeni bir pantolona ihtiyacım vardı. Yeni bir pantolon, tişört ve kazak aldım.");
                break;
            case 2:
                System.out.println("Genelde teknolojik aletleri internetten almayı tercih ederim. Onun yerine yeni bir pantolon, tişört ve kazak aldım.");
                break;
            case 3:
                System.out.println("Haklısın yeni bir kazağa ihtiyacım vardı. Yeni bir pantolon, tişört ve kazak aldım.");
                break;
            case 4:
                System.out.println("Aslında mağazadan alışveriş yapmayı ben de sevmem ama internetten alışveriş yapmaya bayılırım. Yine de halam çağırdığı için geldim ve yHaklısın yeni bir pantolona ihtiyacım vardı. Yeni bir pantolon, tişört ve kazak aldım.");
                break;
            default:
                System.out.println("Hatalı tuşlama yaptın ama ben ne yaptığımı söyleyeyim.Yeni bir pantolon, tişört ve kazak aldım.");
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
        System.out.println("Alışveriş bitip eve döndüğümde deli gibi acıkmıştım. Önce markete gidip ihtiyaçları aldım sonra ise ev arkadaşlarıma yemek hazırladım.\nAfiyetle yedik!");
        System.out.println("**************************************************************************************************************");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    @Override
    public void uyuma() {
        System.out.println("Karnım da doyduğuna göre şimdi ne yapsam?");
        System.out.println("1. Uzun bir gün oldu bence artık yatıp uyuma vakti.\n"
                          + "2. Karnın doyduğuna göre biraz ders çalış.\n");
        int besinciAktivite = scanner.nextInt();
        switch (besinciAktivite){
            case 1:
                System.out.println("Aynen öyle, günün en güzel anı geldi. Kedilerimi de yanıma alıp güzelce uyuyacağım.");
                break;
            case 2:
                System.out.println("Her ne kadar karnımı doyurmuş olsam da kafam çok yoruldu. Erken yatıp biraz dinleneyim ki yarın ders çalışabileyim. O yüzden uyumaya gidiyorum şimdi.");
                break;
            default:
                System.out.println("Geçerli bir seçenek tuşlamadın ama ne yapacağımı söyleyeyim. Erken yatıp dinleneceğim.");
        }
        System.out.println("**************************************************************************************************************");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Üçüncü günümün de sonuna geldik! Biraz fazla soru soruyorum, umarım sıkılmıyorsundur. Hazırsan dördüncü günüme başlıyoruuuzzz!!!!!.");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("**************************************************************************************************************");
    }
}
