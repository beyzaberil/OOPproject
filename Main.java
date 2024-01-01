

public class Main {
    public static void main(String[] args) {
        day1 day1 = new day1();
        day2 day2 = new day2();
        day3 day3 = new day3();
        day4 day4 = new day4();
        day5 day5 = new day5();
        day6 day6 = new day6();
        day7 day7 = new day7();

        System.out.println("Merhaba, ben Beyza Beril Yalçınkaya, günlüğüme hoş geldiniz! Bu günlük 12.12.2023 tarihinden başlayarak bir haftamı özetleyecek.");
        System.out.println("Bu sayede bir haftamdan çıkarımlar yaparak beni daha iyi tanımış olacaksınız.");
        System.out.println("Hadi başlayalım!");
        System.out.println("********************************************************************************************");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Bu gün 12 Aralık 2023. ");
        day1.uyanma();
        day1.kutuphane();
        day1.kahvalti();
        day1.eveDon();
        day1.aksamYemegi();
        day1.uyuma();
        System.out.println("Bu gün 13 Aralık 2023. ");
        day2.uyanma();
        day2.ziyaret();
        day2.kahvalti();
        day2.kahve();
        day2.dersCalisma();
        day2.aksamYemegi();
        day2.uyuma();
        System.out.println("Bu gün 14 Aralık 2023. ");
        day3.uyanma();
        day3.kahvalti();
        day3.dersVakti();
        day3.alisveris();
        day3.aksamYemegi();
        day3.uyuma();
        System.out.println("Bu gün 15 Aralık 2023. ");
        day4.uyanma();
        day4.kahvalti();
        day4.dersCalisma();
        day4.valizHazirla();
        day4.aksamYemegi();
        day4.uyuma();
        System.out.println("Bu gün 16 Aralık 2023. ");
        day5.uyanma();
        day5.yolculuk();
        day5.kahvalti();
        day5.nisan();
        day5.aksamYemegi();
        day5.uyuma();
        System.out.println("Bu gün 17 Aralık 2023. ");
        day6.uyanma();
        day6.kahvalti();
        day6.kahve();
        day6.yolculuk();
        day6.aksamYemegi();
        day6.havuz();
        day6.uyuma();
        System.out.println("Bu gün 18 Aralık 2023. ");
        day7.uyanma();
        day7.dersCalisma();
        day7.kahvalti();
        day7.havuz();
        day7.aksamYemegi();
        day7.uyuma();
    }
}