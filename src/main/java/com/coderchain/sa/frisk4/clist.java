package com.coderchain.sa.frisk4;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;


public class clist extends Fragment {
    public static String ti;
    public static String cont;

    public static clist newInstance(String title,String content) {
        clist fragment = new clist();
        ti=title;
        cont=content;

        return fragment;
    }

    public clist() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_clist, container, false);
        TextView t=(TextView)v.findViewById(R.id.head);
        TextView t1=(TextView)v.findViewById(R.id.content);
        t.setText(ti);
        t1.setText(cont);
        return v;
    }
}
