package com.example.kelvinng.exerciseone;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.

 */
public class RecyclerView2 extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private View mMainView;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private ArrayList<Integer> RvImage=new ArrayList<>();
    private ArrayList<String> RvName=new ArrayList<>();




    public RecyclerView2() {
        // Required empty public constructor
    }






    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        mMainView = inflater.inflate(R.layout.fragment_recycler_view2, container, false);
        RvImage.add(R.drawable.java);
        RvName.add("JAVA");

        RvImage.add(R.drawable.cshark);
        RvName.add("C#");

        RvImage.add(R.drawable.javascript);
        RvName.add("JavaScript");

        RvImage.add(R.drawable.php);
        RvName.add("php");



        RecyclerView recyclerView = mMainView.findViewById(R.id.recyclerViewLayout);
        RecyclerViewAdapter adapter= new RecyclerViewAdapter(RvImage,RvName,getContext());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        return mMainView;
    }
}
