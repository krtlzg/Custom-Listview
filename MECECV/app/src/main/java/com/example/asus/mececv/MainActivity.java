package com.example.asus.mececv;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView liste;
    String Link;
    ArrayList<HocaModeli> hocalistesi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        liste=(ListView)findViewById(R.id.ListViewmain);
        hocalistesi= new ArrayList<>();
        hocalistesi.add(new HocaModeli("Prof. Dr. Müfit Gülgeç","http://mece.cankaya.edu.tr/files/MGulgecCV-Nisan%202015.pdf",R.drawable.mufit_gulgec));
        hocalistesi.add(new HocaModeli("Prof. Dr. Can Çoğun","http://mece.cankaya.edu.tr/files/cancogun.pdf",R.drawable.can_cogun));
        hocalistesi.add(new HocaModeli("Yrd. Doç Dr. Ulaş Beldek","http://mece.cankaya.edu.tr/files/ulas_beldek_cv_esas.pdf",R.drawable.ulas_beldek));
        hocalistesi.add(new HocaModeli("Yrd. Doç Dr. Çağlar Arpalı","http://mece.cankaya.edu.tr/files/CV_caglar_arpali.pdf",R.drawable.caglar_arapali));
        hocalistesi.add(new HocaModeli("Yrd. Doç Dr. Kerim Youde HAN","http://mece.cankaya.edu.tr/files/Kerim_Youde_Han.pdf",R.drawable.kerim_han));
        hocalistesi.add(new HocaModeli("Arş. Gör. Hilal Bingöl","http://mece.cankaya.edu.tr/files/Hilal_Bingol_CV_2016.pdf",R.drawable.hilal_bingol));



      CustomAdaptor adaptor= new CustomAdaptor(this,hocalistesi);
        liste.setAdapter(adaptor);

       liste.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


               Link=hocalistesi.get(position).getLinkId();

               Intent intent = new Intent(getApplicationContext(),WebActivity.class);
               intent.putExtra("LinkId",Link);
               startActivity(intent);

           }
       });



    }
}
