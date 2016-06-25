package com.rvag.fragmentsandroid.fragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.rvag.fragmentsandroid.DetalleActivity;
import com.rvag.fragmentsandroid.R;
import com.rvag.fragmentsandroid.model.Amigo;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class ListaFragment extends Fragment {

    public ListaFragment() {
        // Required empty public constructor

    }

    private static final int ORIENTATION_PORT = 1;
    private static final int ORIENTATION_LAND = 2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_lista, container, false);
        View view = inflater.inflate(R.layout.fragment_lista, container, false);

        final ListView lstAmigos = (ListView) view.findViewById(R.id.lstAmigos);
        lstAmigos.setAdapter(new ArrayAdapter(getContext(),
                                android.R.layout.simple_list_item_1, setupListAmigosDummy()));

        lstAmigos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Amigo amigo = (Amigo) lstAmigos.getAdapter().getItem(position);

                if(getResources().getConfiguration().orientation == ORIENTATION_PORT)
                {
                    Intent i = new Intent(getContext(), DetalleActivity.class);
                    i.putExtra(getString(R.string.amigo), amigo);
                    startActivity(i);
                }else if(getResources().getConfiguration().orientation == ORIENTATION_LAND){
                    DetalleFragment detalleFragment = (DetalleFragment) getFragmentManager().findFragmentById(R.id.frgDetalle);

                    TextView tvNombre = (TextView) detalleFragment.getView().findViewById(R.id.lblNombre);
                    TextView tvTelefono = (TextView) detalleFragment.getView().findViewById(R.id.lblTelefono);
                    TextView tvTwiter = (TextView) detalleFragment.getView().findViewById(R.id.lblTwiter);

                    tvNombre.setText(amigo.getNombre());
                    tvTelefono.setText(amigo.getTelefono());
                    tvTwiter.setText(amigo.getTwiter());
                }
            }
        });

        return view;
    }

    public Amigo[] setupListAmigosDummy()
    {
        Amigo[] amigos = {new Amigo("Robert 0","@r0","5500000000"),
                        new Amigo("Robert 1","@r1","5511111111"),
                        new Amigo("Robert 2","@r2","5522222222"),
                        new Amigo("Robert 3","@r3","5533333333")};

        return amigos;
    }
}
