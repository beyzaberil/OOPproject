import java.util.Scanner;

public class day2 implements Iactivities {
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

   public void ziyaret(){

       System.out.println("Peki bugünün ilk aktivitesi ne olsun?");
       System.out.println("1. Kahvaltı yap.\n"
               + "2. Arkadaşlarınla buluşmaya git.\n"
               + "3. Bütün gün evde yat.\n"
               + "4. Kütüphaneye git.\n");
       int ilkAktivite = scanner.nextInt();
       System.out.println("Acil bir telefon geldi, halam rahatsızlanmış.O yüzden halamın yanına gidiyorum");

       System.out.println("**************************************************************************************************************");
       try {
           Thread.sleep(3000);
       } catch (InterruptedException e) {
           throw new RuntimeException(e);
       }
   }
    @Override
    public void kahvalti() {
        System.out.println("Halama geldim, çok şükür iyiymiş. Şimdi ne yapsam?");
        System.out.println("1. Kahvaltı yap artık enerjin bitmiştir.\n"
                + "2. Halanla otur.\n"
                + "3. Madem iyi eve dön, yat dinlen.\n"
                + "4. Bence gününü ziyan etme ders çalış.\n");
        int ikinciAktivite = scanner.nextInt();
        switch (ikinciAktivite){
            case 1:
                System.out.println("Ufaktan acıkmaya başladım, halamla kahvaltı hazırlayacağız şimdi.");
                break;
            case 2:
                System.out.println("Halamla vakit geçirmeyi çok severim ama karnım acıkmaya başladı. Beraber kahvaltı hazırlayacağız şimdi.");
                break;
            case 3:
                System.out.println("Hemen dönersem aklım halamda kalır. Biraz daha yanında kalayım belki bir şeye ihtiyacı olur. O sırada kahvaltı hazırlamaya başlayalım biz de.");
                break;
            case 4:
                System.out.println("Evet bugün hiç çalışamadım ama karnım acıktı. Halamla kahvaltı hazırlayacağız şimdi.");
                break;
            default:
                System.out.println("Geçerli bir seçenek tuşlamadın ama ne yapacağımı söyleyeyim. Halama kahvaltı hazırlayacağım.");
        }
        System.out.println("**************************************************************************************************************");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public void kahve(){
        System.out.println("Kahvaltımızı yaptık karnım doydu. Şimdi ne yapsam?");
        System.out.println("1. Kahvaltının peşine kahve iyi gider.\n"
                + "2. Biraz da eniştenle otur.\n"
                + "3. Kahvaltı da yaptığınıza göre artık evine dön bence.\n"
                + "4. Bence gününü ziyan etme ders çalış.\n");
        int ucuncuAktivite = scanner.nextInt();
        switch (ucuncuAktivite){
            case 1:
                System.out.println("Çok doğru söylüyorsun. Kahveleri pişirmeye başladım bile :)");
                break;
            case 2:
                System.out.println("Şimdi enişteme kahve götürüyorum, o genelde bizden ayrı takılır. Biz de halamla kahvelerimizi içip fal bakacağız.");
                break;
            case 3:
                System.out.println("Dediğim gibi hemen dönersem aklım halamda kalır. Hem şimdi kahve yapacağım, birbirimizin falına bakacağız.");
                break;
            case 4:
                System.out.println("Evet bugün hiç çalışamadım haklısın ama ekstrem bir olay sonuçta. Kahvaltını peşine kahvelerimizi yapıyorum, onları içince derse geçmeye çalışacağım.");
                break;
            default:
                System.out.println("Geçerli bir seçenek tuşlamadın ama ne yapacağımı söyleyeyim. Halama kahve yapacağım.");
        }
        System.out.println("**************************************************************************************************************");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public void dersCalisma(){
        System.out.println("Kahvelerimizi de içtik. Şimdi ne yapsam?");
        System.out.println("1. Dışarı çıkıp biraz yürüyüş yapabilirsin.\n"
                + "2. Evi incele, yapabileceğin bir hobi vardır belki.\n"
                + "3. Beraber dizi veya film izleyebilirsiniz.\n"
                + "4. Artık ders çalışma vaktin geldi bence.\n");
        int dorduncuAktivite = scanner.nextInt();
        switch (dorduncuAktivite){
            case 1:
                System.out.println("Aslında yürüyüş yapmayı severim fakat tek başımayken değil... Ayrıca ders de çalışmam gerekiyor o yüzden artık ders çalışmaya başlayacağım.");
                break;
            case 2:
                System.out.println("Aslında ilk kez gittiğim evleri incelemeyi gerçekten çok severim. Fakat halamın evine yıllardır geliyorum ve maalesef bir hobi yok. En iyi ders çalışmaya başlayayım.");
                break;
            case 3:
                System.out.println("Halamın dizi zevkiyle benimki maalesef pek uymuyor... O yüzden bu fikre uyamayacağım, ders çalışmaya başlıyorum.");
                break;
            case 4:
                System.out.println("Çok haklısın, bahanelerin arkasına sığınmamak lazım. Kahveleri de içtiğimize göre artık ders çalışmaya geçiyorum.");
                break;
            default:
                System.out.println("Geçerli bir seçenek tuşlamadın ama ne yapacağımı söyleyeyim. Ders çalışmaya başlıyorum.");
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
        System.out.println("Dersimi çalıştım ve saat 18.00 oldu. Şimdi ne yapsam?");
        System.out.println("1. Artık iyice karnın acıkmıştır, yemek mi yesen?\n"
                + "2. Saat geç olmaya başlamış eve dönmelisin bence.\n");
        int besinciAktivite = scanner.nextInt();
        switch (besinciAktivite){
            case 1:
                System.out.println("Evet gerçekten karnım çok acıktı, çok iştahlı bir insanım o yüzden yemek benim için çok önemli. Halama yardım edeyim de bir an önce yemeği hazırlayalım.");
                break;
            case 2:
                System.out.println("Halam beni bırakmak istemiyor... Şimdi bir akşam yemeği yiyelim dönüşe sonra bakarız.");
                break;
            default:
                System.out.println("Geçerli bir seçenek tuşlamadın ama ne yapacağımı söyleyeyim. Halamla beraber akşam yemeği yiyeceğiz.");
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
        System.out.println("Akşam yemeğimizi yedik ve saat 20.00 oldu halam gitmemem için çok ısrar etti o yüzden bu akşam halamda kalmaya karar verdim.");
        System.out.println("Artık biraz kitap okuyup uyumaya gidiyorum.");
        System.out.println("**************************************************************************************************************");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("İkinci günümün sonuna geldik! Umarım beni tanımaktan keyif alıyorsundur. Hazırsan üçüncü güne geçiyoruuummmmmm.");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("**************************************************************************************************************");
    }
    }


