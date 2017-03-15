package com.codeclan.cakeapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;

public class CakeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cakes_list);

        TopCakes topCakes = new TopCakes();
        ArrayList<Cake> list = topCakes.getList();

        TopCakesAdapter cakesAdapter = new TopCakesAdapter(this, list);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(cakesAdapter);

    }

        public void nameClicked(View textView){
        TextView name = (TextView) textView;
        Log.d("Cake clicked", name.getText().toString());

    }
}
