package com.codeclan.cakeapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by user on 15/03/2017.
 */

public class TopCakesAdapter extends ArrayAdapter<Cake> {

    public TopCakesAdapter(Context context, ArrayList<Cake> cakes){
        super(context, 0, cakes);
    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent){

        // This section is recycling views, so that only the right number of views for the screen have
        // to be created, rather than for your entire list. It saves memory.

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.cakes_item, parent, false);
        }

//        .inflate - Inflate populates with data

        Cake currentCake = getItem(position); // inheriting getItem from array adapter

        TextView ranking = (TextView) listItemView.findViewById(R.id.ranking);
        ranking.setText(currentCake.getRanking().toString());

        TextView title = (TextView) listItemView.findViewById(R.id.title);
        title.setText(currentCake.getName());

        return listItemView;

    }

}
