package com.example.android.lab1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
//import android.widget.myListView;
import android.widget.ListView;
import android.widget.ArrayAdapter;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final String[] COUNTRIES = new String[] {
              "Afghanistan","Albania","Algeria","American Samoa","Andorra",
                "Angola","Anguilla","Austria"
      };
       ListView myListView =  findViewById(R.id.country_list_view);
        final ArrayAdapter<String> aa;
        aa = new ArrayAdapter<String>(this ,android.R.layout.simple_list_item_1,
        COUNTRIES);
        myListView.setAdapter(aa);
    }
}
