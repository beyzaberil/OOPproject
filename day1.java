import java.util.Scanner;

public class day1 implements Iactivities{

    Scanner scanner = new Scanner(System.in);
    @Override
    public void uyanma(){
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


    public void kutuphane(){
        System.out.println("Peki bugünün ilk aktivitesi ne olsun?");
        System.out.println("1. Kahvaltı yap.\n"
                + "2. Arkadaşlarınla buluşmaya git.\n"
                + "3. Bütün gün evde yat.\n"
                + "4. Kütüphaneye git.\n");
        int ilkAktivite = scanner.nextInt();
        switch (ilkAktivite){
            case 1:
                System.out.println("Uyanır uyanmaz kahvaltı yapmayı pek sevmiyorum. Önce kütüphaneye gidip biraz ders çalışayım.");
                break;
            case 2:
                System.out.println("Arkadaşlarımla vakit geçirmeyi çok severim fakat şu sıralar derslerime ağırlık vermem gerekiyor bu yüzden kütüphaneye gideceğim.");
                break;
                case 3:
                System.out.println("Pineklemeyi pek sevmem. İşleyen demir ışıldarmış, hadi kütüphaneye gidiyoruz!");
                break;
                case 4:
                System.out.println("Aklımı okudun! Bu günkü planım arkadaşımla kütüphaneye gitmekti. Hadi geç olmadan gidelim.");
                break;
            default:
                System.out.println("Geçerli bir seçenek tuşlamadın ama ne yapacağımı söyleyeyim. Bugün kütüphaneye gideceğim.");
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
        System.out.println("Kütüphanede 1 saat kadar ders çalıştım. Şimdi ne yapsam?");
        System.out.println("1. Kahvaltı yap artık enerjin bitmiştir.\n"
                + "2. Dersi boşver arkadaşlarınla buluşmaya git.\n"
                + "3. Hemen eve dön, yat dinlen.\n"
                + "4. Az çalışmışsın bence biraz daha devam et.\n");
        int ikinciAktivite = scanner.nextInt();
        switch (ikinciAktivite){
            case 1:
                System.out.println("Haklısın gerçekten enerjim bitti. Şimdi aşağıdaki fırından simit ve çay alıp kahvaltı yapacağım.");
                break;
            case 2:
                System.out.println("Arkadaşlarımla vakit geçirmeyi çok severim fakat şu sıralar derslerime ağırlık vermem gerekiyor. Sadece bir yemek molası verip kahvaltı yapacağım.");
                break;
            case 3:
                System.out.println("Daha kütüphaneye yeni geldim, ne eve dönmesinden bahsediyorsun? Aşağıdaki fırından bir şeyler alıp kahvaltı yapacağım.");
                break;
            case 4:
                System.out.println("Evet istediğim kadar çok çalışamadım ama karnım acıktı. Aşağıdaki fırından bir şeyler alıp kahvaltı yapacağım sonra ders çalışmaya devam edeceğim.");
                break;
            default:
                System.out.println("Hatalı tuşlama yaptın ama ben ne yaptığımı söyleyeyim.Aşağıdaki fırından bir şeyler alıp kahvaltı yapacağım.");
        }
        System.out.println("**************************************************************************************************************");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void eveDon(){
        System.out.println("Saat 20.00 oldu. Çok güzel ders çalıştım fakat iyice yoruldum. Şimdi ne yapsam?");
        System.out.println("1. Artık karnın acıkmıştır. Yemek yemeye git istersen.\n"
                + "2. Dersi boşver çok bile çalışmışsın arkadaşlarınla buluşmaya git.\n"
                + "3. Hemen eve dön, yat dinlen.\n"
                + "4. Az çalışmışsın bence biraz daha devam et.\n");
        int ucuncuAktivite = scanner.nextInt();
        switch (ucuncuAktivite){
            case 1:
                System.out.println("Haklısın karnım acıktı ama dışarda para harcamak istemiyorum. En iyisi eve döneyim.");
                break;
            case 2:
                System.out.println("Hem saat çok geç oldu hem de çok yorgunum. Eve döneceğim.");
                break;
            case 3:
                System.out.println("Sanırım haklısın, zaten evime 5 dakika uzaklıktayım. Bir taksi çağırayım da eve döneyim.");
                break;
            case 4:
                System.out.println("Hem karnım aç hem de kafam çok yoruldu. En iyisi eve geçmek olur sanırım o yüzden eve döneceğim.");
                break;
            default:
                System.out.println("Geçerli bir seçenek tuşlamadın ama ne yapacağımı söyleyeyim. Yorulduğum için eve döneceğim.");
        }
        System.out.println("**************************************************************************************************************");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    @Override
    public void aksamYemegi(){
        System.out.println("Ben eve dönene kadar saat 22.00 oldu. Kedilerim acıkmış onlara mama verdim, şimdi ne yapsam?");
        System.out.println("1. Artık senin de karnın acıkmıştır. Evde yemek var mı? Bir şeyler yemelisin.\n"
                + "2. Kedilerinle yat uyu bence yorulmuşsundur.\n"
                + "3. Kendine güzel bir yemek hazırla, ziyafet çek.\n"
                + "4. Evde de dersine devam et.\n");
        int dorduncuAktivite = scanner.nextInt();
        switch (dorduncuAktivite){
            case 1:
                System.out.println("Haklısın karnım acıktı ve ev arkadaşım yemek hazırlamış! Hemen yiyeceğim.");
                break;
            case 2:
                System.out.println("Kedilerimle yatmak her zaman cazip bir teklif fakat karnım çok aç. Ev arkadaşımın yaptığı yemekten yiyeceğim.");
                break;
            case 3:
                System.out.println("Karnım çok aç ama zaten ev arkadaşım yemek yapmış o yüzden direkt onu yiyeceğim.");
                break;
            case 4:
                System.out.println("Hem karnım aç hem de kafam çok yoruldu. Evdeki yemeği yiyeceğim şimdi, daha fazla ders çalışamam.");
                break;
            default:
                System.out.println("Geçerli bir seçenek tuşlamadın ama ne yapacağımı söyleyeyim. Evde hazır yemek varmış onu yiyeceğim.");
        }
        System.out.println("**************************************************************************************************************");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void uyuma() {
        System.out.println("Yemeğimi afiyetle yedim. Karnım da doyduğuna göre şimdi ne yapsam?");
        System.out.println("1. Biraz evi toplayabilirsin.\n"
                + "2. Uzun bir gün oldu bence artık yatıp uyuma vakti.\n"
                + "3. Yemeğin üstüne tatlı iyi gider. Bence kendine bir tatlı yap.\n"
                + "4. Karnın doyduğuna göre dersine devam et.\n");
        int besinciAktivite = scanner.nextInt();
        switch (besinciAktivite){
            case 1:
                System.out.println("Evet evi toplasam iyi olurdu fakat çok yorgunum. Bu konularda biraz tembelim maalesef... Yatıp uyumaya karar verdim.");
                break;
            case 2:
                System.out.println("Aynen öyle, günün en güzel anı geldi. Kedilerimi de yanıma alıp güzelce uyuyacağım.");
                break;
            case 3:
                System.out.println("Tatlıyla pek aram olduğu söylenemez. Yemek de gayet yeterliydi. Yatıp uyuyacağım.");
                break;
            case 4:
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
        System.out.println("Birinci günümün sonuna geldik! Umarım hakkımda biraz bilgi sahibi olabilmişsindir. Hazırsan ikinci güne geçiyorum.");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("**************************************************************************************************************");
    }

}
