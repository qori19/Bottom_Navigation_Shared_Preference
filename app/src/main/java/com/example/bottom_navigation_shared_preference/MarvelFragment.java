package com.example.bottom_navigation_shared_preference;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class MarvelFragment extends Fragment implements MainView{
    List<MarvelModel> marvelModels = new ArrayList<>();
    MarvelAdapter adapter;

    public MarvelFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_marvel, container, false);
        return view;
    }
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rcv);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getContext()));
        adapter = new MarvelAdapter(getContext(), marvelModels);
        recyclerView.setAdapter(adapter);
        MarvelPresenter data = new MarvelPresenter(this,getContext());
        data.setData();
    }

    public void onSuccess(List<MarvelModel> marvelModels){
        this.marvelModels.clear();
        this.marvelModels.addAll(marvelModels);
        this.adapter.notifyDataSetChanged();
    }

    @Override
    public void onSucsess(List<MarvelModel> marvelModels) {

    }
}
