package com.example.kelvinng.exerciseone;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class RecyclerViewAdapter extends  RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    private static final  String TAG="RecyclerViewAdapter";

    private ArrayList<Integer> mImage=new ArrayList<>();
    private ArrayList<String> mName=new ArrayList<>();
    private Context mContext;

    public RecyclerViewAdapter(ArrayList<Integer> mImage, ArrayList<String> mName,Context mContext) {
        this.mImage = mImage;
        this.mName = mName;
        
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view_layout,parent,false);
        ViewHolder holder=new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        Log.d(TAG,"onBindViewHolder: called.");
        holder.recycler_view_adapter_image.setImageResource(mImage.get(position));
        holder.recycler_view_adapter_name.setText(mName.get(position));
        

        holder.recycler_view_adapter_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Log.i("點擊了",""+mName.get(position));
            }
        });

    }

    @Override
    public int getItemCount() {
        return mName.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView recycler_view_adapter_image;
        TextView recycler_view_adapter_name;

        LinearLayout recycler_view_adapter_layout;
        public ViewHolder(View itemView){
            super(itemView);
            recycler_view_adapter_image=itemView.findViewById(R.id.recycler_view_layout_image_view);
            recycler_view_adapter_name=itemView.findViewById(R.id.recycler_view_layout_text_view);
            recycler_view_adapter_layout=itemView.findViewById(R.id.recycler_view_layout);
        }
    }
}
