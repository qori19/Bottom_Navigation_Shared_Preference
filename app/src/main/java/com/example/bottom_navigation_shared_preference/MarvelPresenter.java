package com.example.bottom_navigation_shared_preference;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

public class MarvelPresenter {
    Context context;
    List <MarvelModel> marvelModels = new ArrayList<>();
    MainView view;
    public MarvelPresenter(MainView view, Context context){
        this.view = view;
        this.context = context;
    }

    public void setData(){
        MarvelModel marvel;

        marvel= new MarvelModel("Captain America: The First Avengers (2011)",R.drawable.captain,"Diceritakan di Amerika pada tahun 1942 itu ada seorang pemuda bernama Steve Rogers yang walaupun berbadan kecil, kurus dan lemah tapi berkeinginan besar menjadi tentara untuk membela negaranya. \"Dengan fisiknya yang kecil dan penyakitan itu, Steve Rogers tentu saja selalu gagal dalam seleksi penerimaan tentara baru.  Untungnya Steve Rogers punya sahabat seorang tentara angkatan Darat Amerika yaitu Sersan  James Barnes yang selalu membesarkan hatinya sehingga Steve Rogers tidak pernah menyerah dan selalu mendaftar untuk menjadi tentara Amerika walaupun sudah 5 kali gagal.");
        marvelModels.add(marvel);
        marvel = new MarvelModel("Iron Man (2008)",R.drawable.ironman,"Diceritakan Tony Stark, seorang industrialis miliyuner dan pemilik perusahaan Stark Industries yang bergerak di bidang pembuatan senjata dan rudal untuk kepentingan pihak militer. Tony Stark yang kaya raya dan dikenal jenius dalam merancang senjata canggih ini diculik sekelompok penjahat yang didalangi Obadiah Stane, sahabat sekaligus pesaing bisnisnya. Ketika disekap, Tony dipaksa membuat senjata canggih yang mematikan. Namun ia enggan melakukan perintah Stane dan diam-diam merancang kostum baja berteknologi canggih yang digunakannya untuk melarikan diri dari para penculik. Tony Stark kemudian mengembangkan kostum tersebut hingga lahirlah superhero baru bernama Iron Man yang mampu terbang dengan kecepatan supersonik. Bahkan, kostum yang dirancangnya dapat mengeluarkan berbagai senjata canggih, seperti pelontar rudal antitank, penyembur api dan senjata sinar laser yang keluar dari lengannya. Di lain sisi, Obadiah Stane merasa iri dengan kehebatan Iron Man dan ingin mengalahkannya. Berbekal desain karya Stark yang tertinggal di tempat penyanderaan, Stane membuat kostum yang lebih kuat dan menjelma sebagai Iron Monger. Saat itulah, Tony Stark ingin mengungkapkan sebuah kejahatan dengan implikasi global, menggunakan baju baja dan kekuatannya untuk melindungi dunia sebagai Manusia Besi (Iron Man).");
        marvelModels.add(marvel);
        marvel = new MarvelModel("Iron Man 2 (2010)",R.drawable.ironman2,"Iron man 2 mengisahkan kembali tentang milyuner kaya raya bernama tony stark yang telah berhasil menciptakan baju besi tak terkalahkan bernama iron man. Karena tidak ingin terus menyembunyikan identitas dirinya sebagai iron man maka tony stark mengatakan kepada dunia bahwa dialah sang iron man. Tentu saja hal tersebut membuat dunia menjadi terkejut sekaligus beberapa pihak mencoba memanfaatkan hal tersebut. Termasuk salah satunya adalah pihak pemerintah amerika serikat. Karena ternyata mereka mencoba mengambil alih baju iron man milik tony stark. Mereka beralasan ingin meneliti baju besi tersebut demi kebaikan dunia.");
        marvelModels.add(marvel);
        marvel = new MarvelModel("The Avengers (2012)",R.drawable.avengers,"Nick Fury dan Mari Hillarive di fasilitas penelitian, dimana fisikawan Dr. Erik Selvig memimpin tim peneliti bereksperimen di Tesseract. Agen Phil Coulson menjelaskan objek telah mulai memancarkan energi tidak biasa. Tesseract mengaktifkan dan membuka wormhole memungkinkan Loki menuju Bumi. Loki meraih Tesseract dan memanfaatkan tongkatnya memperbudak Selvig dan agen lain termasuk Agen Barton. Fury mengaktifkan kembali Avengers Intitative. Natasha Romanoff dikirim menuju Calcutta, merekrut Bruce Banner melacak Tesseract melalui emisi radiasi gamma. Coulson mengunjungi Tony Stark meminta dia meninjau penelitian Selvig, Fury mendekati Steve Rogers.");
        marvelModels.add(marvel);
        marvel = new MarvelModel("Thor: The Dark World (2013)",R.drawable.thor,"Kisah dimulai ketika di masa lampau bangsa Asgard berperang melawan bangsa Dark Elf (peri hitam) yang dipimpin oleh Malekith (Christopher Eccleston). Dia mengandalkan senjata bernama Aether yang dapat menghancurkan seluruh Asgard. Sayangnya senjata tersebut dapat direbut oleh bangsa Asgard dan dia melarikan diri dengan mengorbankan pasukannya.");
        marvelModels.add(marvel);
        marvel = new MarvelModel("Ant Man (2015)",R.drawable.antman,"Scott Lang (Paul Rudd) harus membantu mentornya Dr Hank Pym (Michael Douglas) untuk menjaga teknologi Ant - Man yang memungkinkan penggunanya untuk mengecilkan ukuran tubuh tetapi meningkatkan kekuatan penggunanya. Scott Lang akan bertarung dengan Darren Cross (Yellowjacket) yang memiliki teknologi yang sama.");
        marvelModels.add(marvel);

        view.onSucsess(marvelModels);
    }
}
