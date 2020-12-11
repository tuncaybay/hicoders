package ch.hicoders.jam101.week02;

import ch.hicoders.jam101.week02.kisi.Ogrenci;
import java.util.LinkedList;
import java.util.List;

public class Okul {
    public static void main(String[] args) {

        //Ögrenci objeleri icin arraylist olusturma
        List<Ogrenci> ogrenciler = new LinkedList<>();

        //ögrenci sayisini belirleme
        int k = (int)(Math.random() * 50);
        System.out.println("----------------------------------------");
        System.out.println("Toplam ögrenci sayisi: " + k);

        //Almance ve Matematik not ortalamalari icin degiskenlerin olusturulmasi
        double almOrtalama = 0.0;
        double matOrtalama = 0.0;

        //Ögrenci objelerini olusturma, (isim, Almanca Notu, Matematik Notu)
        for (int i = 0; i < k; i++){
            ogrenciler.add(new Ogrenci("ogr"+(i), (int)(Math.random() * 7),(int)(Math.random() * 7)));
            //not ortalamalari icin notlarin toplanmasi
            almOrtalama += ogrenciler.get(i).getAlmNot();
            matOrtalama += ogrenciler.get(i).getMatNot();
        }

        //Not ortalamalarinin hesaplanmasi
        almOrtalama = (int)(almOrtalama/k*10.0)/10.0;
        matOrtalama = (int)(matOrtalama/k*10.0)/10.0;

        //Not ortalamalarinin ekrana yazilmasi
        System.out.println("----------------------------------------");
        System.out.println("Almanca ortalama: " + almOrtalama);
        System.out.println("Matematik ortalama: " + matOrtalama);

        //Almancadan kalan ögrencilerin notlari ile beraber ekrana yazilmasi
        System.out.println("----------------------------------------");
        System.out.println("Almancadan kalan ögrenciler");
        for (int i = 0; i < k; i++) {
            if (ogrenciler.get(i).getAlmNot() < almOrtalama) {
                System.out.println(ogrenciler.get(i).getIsim() + ", Not:" + ogrenciler.get(i).getAlmNot());
            }
        }

        //Almancadan gecen ögrencilerin notlari ile beraber ekrana yazilmasi
        System.out.println("----------------------------------------");
        System.out.println("Almancadan gecen ögrenciler");
        for (int i = 0; i < k; i++) {
            if (ogrenciler.get(i).getAlmNot() >= almOrtalama) {
                System.out.println(ogrenciler.get(i).getIsim() + ", Not: " + ogrenciler.get(i).getAlmNot());
            }
        }

        //Matematikten kalan ögrencilerin notlari ile beraber ekrana yazilmasi
        System.out.println("----------------------------------------");
        System.out.println("Matematikten kalan ögrenciler");
        for (int i = 0; i < k; i++) {
            if (ogrenciler.get(i).getMatNot() < matOrtalama) {
                System.out.println(ogrenciler.get(i).getIsim() + ", Not:" + ogrenciler.get(i).getMatNot());
            }
        }

        //Matematikten gecen ögrencilerin notlari ile beraber ekrana yazilmasi
        System.out.println("----------------------------------------");
        System.out.println("Matematikten gecen ögrenciler");
        for (int i = 0; i < k; i++) {
            if (ogrenciler.get(i).getMatNot() >= matOrtalama) {
                System.out.println(ogrenciler.get(i).getIsim() + ", Not: " + ogrenciler.get(i).getMatNot());
            }
        }

        //min, max not degiskenlerinin olusturulmasi
        int almMinNot = 6;
        int almMaxNot = 0;
        int matMinNot = 6;
        int matMaxNot = 0;
        for (int i = 0; i < k; i++) {
           if (ogrenciler.get(i).getAlmNot() < almMinNot ) {
               almMinNot = ogrenciler.get(i).getAlmNot();
           }
            if (ogrenciler.get(i).getAlmNot() > almMaxNot ) {
                almMaxNot = ogrenciler.get(i).getAlmNot();
            }
            if (ogrenciler.get(i).getMatNot() < matMinNot ) {
                matMinNot = ogrenciler.get(i).getMatNot();
            }
            if (ogrenciler.get(i).getMatNot() > matMaxNot ) {
                matMaxNot = ogrenciler.get(i).getMatNot();
            }
        }

        //min, max not degiskenlerinin ekrana yazilmasi
        System.out.println("----------------------------------------");
        System.out.println("Almanca en kötü not: " + almMinNot);
        System.out.println("Almanca en iyi not: " + almMaxNot);
        System.out.println("Matematik en kötü not: " + matMinNot);
        System.out.println("Matematik en iyi not: " + matMaxNot);

        //Almancadan en kötü not alan ögrencilerin notlari ile beraber ekrana yazilmasi
        System.out.println("----------------------------------------");
        System.out.println("Almancadan en kötü not alan ögrenciler");
        for (int i = 0; i < k; i++) {
            if (ogrenciler.get(i).getAlmNot() == almMinNot ) {
                System.out.println(ogrenciler.get(i).getIsim() + " Not: " + ogrenciler.get(i).getAlmNot());
            }
        }

        //Almancadan en iyi not alan ögrencilerin notlari ile beraber ekrana yazilmasi
        System.out.println("----------------------------------------");
        System.out.println("Almancadan en iyi not alan ögrenciler");
        for (int i = 0; i < k; i++) {
            if (ogrenciler.get(i).getAlmNot() == almMaxNot ) {
                System.out.println(ogrenciler.get(i).getIsim() + " Not: " + ogrenciler.get(i).getAlmNot());
            }
        }

        //Matematikten en kötü not alan ögrencilerin notlari ile beraber ekrana yazilmasi
        System.out.println("----------------------------------------");
        System.out.println("Matematikten en kötü not alan ögrenciler");
        for (int i = 0; i < k; i++) {
            if (ogrenciler.get(i).getMatNot() == matMinNot ) {
                System.out.println(ogrenciler.get(i).getIsim() + " Not: " + ogrenciler.get(i).getMatNot());
            }
        }

        //Matematikten en iyi not alan ögrencilerin notlari ile beraber ekrana yazilmasi
        System.out.println("----------------------------------------");
        System.out.println("Matematikten en iyi not alan ögrenciler");
        for (int i = 0; i < k; i++) {
            if (ogrenciler.get(i).getMatNot() == matMaxNot ) {
                System.out.println(ogrenciler.get(i).getIsim() + " Not: " + ogrenciler.get(i).getMatNot());
            }
        }
    }
}
