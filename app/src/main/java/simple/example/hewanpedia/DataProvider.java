package simple.example.hewanpedia;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import simple.example.hewanpedia.model.Anjing;
import simple.example.hewanpedia.model.Hewan;
import simple.example.hewanpedia.model.Kucing;
import simple.example.hewanpedia.model.Ular;

public class DataProvider {
    private static List<Hewan> hewans = new ArrayList<>();

    private static List<Kucing> initDataKucing(Context ctx) {
        List<Kucing> kucings = new ArrayList<>();
        kucings.add(new Kucing("Angora", "Turki",
                "Aslinya berasal dari Ankara, Turki dengan ciri khas berbulu panjang dan lembut", R.drawable.cat_angora));
        kucings.add(new Kucing("Bengal", "Inggris",
                "Merupakan hasil persilangan antara Kucing Leopard Asia dengan kucing domestik Inggris", R.drawable.cat_bengal));
        kucings.add(new Kucing("Birmani", "Birma/Myanmar",
                "Konon awalnya merupakan ras kucing yand biasa menemani para biksu yang menetap pada kuil di Birma", R.drawable.cat_birman));
        kucings.add(new Kucing("Persia", "Iran",
                "Kucing berbulu panjang dengan wajah bundar dan hidung pesek. Awalnya berasal dari Iran kemudian diimpor ke Italia", R.drawable.cat_persia));
        kucings.add(new Kucing("Siam", "Thailand",
                "Kucing hasil turunan dari Wichian Maat (Kucing Thailand) dengan ciri khas berbadan panjang dan langsing, wajah lonjong, telinga lebar, dan mata kebiruan", R.drawable.cat_siam));
        kucings.add(new Kucing("Siberia", "Rusia",
                "Kucing domestik Rusia dengan bulu lebat dan badan besar tapi sangat lincah dan terkenal dengan kemampuan melompatnya ", R.drawable.cat_siberian));
        return kucings;
    }

    private static List<Anjing> initDataAnjing(Context ctx) {
        List<Anjing> anjings = new ArrayList<>();
        anjings.add(new Anjing("Bulldog", "Inggris",
                "Anjing populer yang dikenal dengan badan yang gemuk berotot, wajah seperti kain kusut, dan hidung yang pesek", R.drawable.dog_bulldog));
        anjings.add(new Anjing("Husky", "Alaska,Siberia,Finlandia (daerah bersalju) ",
                "Anjing jenis khusus yang awalnya digunakan untuk menarik kereta salju", R.drawable.dog_husky));
        anjings.add(new Anjing("Kintamani", "Indonesia",
                "Ras anjing asli pulau Bali ", R.drawable.dog_kintamani));
        anjings.add(new Anjing("Samoyed", "Rusia",
                "Anjing yang berasal dari Siberia yang awalnya biasa digunakan untuk menjaga ternak oleh suku Samoyed", R.drawable.dog_samoyed));
        anjings.add(new Anjing("Shepherd", "Jerman",
                "Anjing pintar dan kuat, sekarang banyak digunakan sebagai anjing penjaga, pengawal, dan anjing polisi (K9)", R.drawable.dog_shepherd));
        anjings.add(new Anjing("Shiba", "Jepang",
                "Anjing dari daerah Shiba ini gesit dan lincah sehingga awalnya banyak digunakan untuk berburu ", R.drawable.dog_shiba));
        return anjings;
    }

    private static List<Ular> initDataAyam(Context ctx) {
        List<Ular> ayams = new ArrayList<>();
        ayams.add(new Ular("Cabe", "Bali",
                "Ular ini gampang banget dikenali yaitu dari pola kulitnya yang belang-belang berwarna hitam dan merah. Ukurannya lumayan kecil, paling panjang maksimal hanya sekitar 50 cm jadi lo harus hati-hati dan jeli untuk melihat lingkungan sekitar.", R.drawable.ular_cabe));
        ayams.add(new Ular("Welang", "Banten",
                "Ular welang atau banded snake juga memiliki pola kulit yang belang-belang. Belangnya biasanya berwarna kuning-hitam dengan panjang ular bisa sampai 1 hingga 2 meter. Ular welang ini biasanya ngumpet di sawah atau di antara pohon bambu.", R.drawable.ular_welang));
        ayams.add(new Ular("Cobra", "Jawa Timur",
                "Ular kobra termasuk jenis ular yang paling berbisa di dunia. Kobra bisa hidup di persawahan hingga ke pemukiman semi-urban. Lo pasti tahu bentuknya kobra kayak apa karena gampang banget dengan ciri khas kepalanya yang bisa mengembang seperti sendok.", R.drawable.ular_cobra));
        ayams.add(new Ular("Hijau Mira", "Jawa Tengah",
                "Ular hijau ekor mira punya beberapa nama lain yaitu ular bangkai laut dan green pit viper. Ular ini juga punya kerabat dekat yaitu Malayan pit viper yang bisa dibedakan dari warnanya yang agak merah kecoklatan.", R.drawable.ular_hijau_mira));
        ayams.add(new Ular("Sanca Keling", "Karawang, Jawa Barat",
                "Walau tidak memiliki bisa atau racun yang mematikan, namun lilitan kuat dari Ular Sanca Keling bisa mematahkan tulang-tulang lo dengan sekejap. Oleh karena itu, ular ini memang patut diwaspadai saat berada di alam bebas.", R.drawable.ular_sanca_keling));
        ayams.add(new Ular("Black Mamba", "Pontianak, Kalimantan Barat",
                "Dengan warna yang hitam legam, ular ini dapat ditemukan di Benua Afrika. Kecepatan ular Black Mamba dapat mencapai 16 km/jam dan ketika menyuntikkan racun antara 100 - 120 mg per gigitan.", R.drawable.ular_black_mamba));
        return ayams;
    }

    private static void initAllHewans(Context ctx) {
        hewans.addAll(initDataKucing(ctx));
        hewans.addAll(initDataAnjing(ctx));
        hewans.addAll(initDataAyam(ctx));
    }

    public static List<Hewan> getAllHewan(Context ctx) {
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        return  hewans;
    }

    public static List<Hewan> getHewansByTipe(Context ctx, String jenis) {
        List<Hewan> hewansByType = new ArrayList<>();
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        for (Hewan h : hewans) {
            if (h.getJenis().equals(jenis)) {
                hewansByType.add(h);
            }
        }
        return hewansByType;
    }

}
