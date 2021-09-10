package com.example.explorestudios;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

public class JampadFragment extends Fragment {
    public static JampadFragment getInstance(){
        JampadFragment jampadFragment=new JampadFragment();
        return jampadFragment;
    }
    EditText Location,Genre;
    RecyclerView recyclerView;
    RecyclerAdapter recyclerAdapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_jampad,container,false);
        Location=view.findViewById(R.id.location);
        Genre=view.findViewById(R.id.genre);
        recyclerView=view.findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(),
                RecyclerView.VERTICAL,
                false));
          recyclerAdapter=new RecyclerAdapter();
          recyclerView.setAdapter(recyclerAdapter);
        return view;
    }
}