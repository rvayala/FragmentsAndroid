package com.rvag.fragmentsandroid.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.rvag.fragmentsandroid.R;
import com.rvag.fragmentsandroid.model.Amigo;


/**
 * A simple {@link Fragment} subclass.
 */
public class DetalleFragment extends Fragment {


    public DetalleFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_detalle, container, false);
        View view = inflater.inflate(R.layout.fragment_detalle, container, false);

        /*TextView tvNombre = (TextView) view.findViewById(R.id.lblNombre);
        TextView tvTwiter = (TextView) view.findViewById(R.id.lblTwiter);
        TextView tvTelefono = (TextView) view.findViewById(R.id.lblTelefono);

        if(getActivity().getIntent().getExtras() != null){
            Amigo amigo = (Amigo) getArguments().getSerializable(getString(R.string.amigo));
            tvNombre.setText(amigo.getNombre());
            tvTwiter.setText(amigo.getTwiter());
            tvTelefono.setText(amigo.getTelefono());
        }*/
        return  view;
    }
}
