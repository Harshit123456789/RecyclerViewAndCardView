package com.example.hp.recyclerviewandcardview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by HP on 17-07-2017.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>
{

    private List<NatureModel> objectList;
    private LayoutInflater inflater;

    public MyAdapter(Context c,List<NatureModel> objectList) {
        this.objectList = objectList;
        inflater = LayoutInflater.from(c);
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_item,parent,false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        NatureModel current = objectList.get(position);
        holder.setData(current);
        //holder.setListeners();
    }

    @Override
    public int getItemCount() {
        return objectList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

        private TextView title;
        private ImageView imgThumb,imgdelete,imgcopy;
        private int position;
        private NatureModel currentObject;

        public MyViewHolder(View itemView)
        {
            super(itemView);
            title = (TextView)itemView.findViewById(R.id.tv_title);
            imgThumb = (ImageView)itemView.findViewById(R.id.img_thumb);
            imgdelete = (ImageView) itemView.findViewById(R.id.img_delete);
            imgcopy = (ImageView)itemView.findViewById(R.id.img_copy);
        }

        public void setData(NatureModel currentObject)
        {
            this.title.setText(currentObject.getTitle());
            this.imgThumb.setImageResource(currentObject.getImageID());
            this.position = position;
            this.currentObject = currentObject;
        }

//        public void setListeners()
//        {
//            imgcopy.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    addItem(position,currentObject);
//                }
//            });
//            imgdelete.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    removeItem(position);
//                }
//            });
//        }
//
//        public  void removeItem(int position)
//        {
//            objectList.remove(position);
//            notifyItemRemoved(position);
//            notifyItemRangeChanged(position,objectList.size());
//            notifyDataSetChanged();
//        }
//
//        public void addItem(int position,NatureModel currentObject)
//        {
//            objectList.add(position,currentObject);
//            notifyItemInserted(position);
//            notifyItemRangeChanged(position,objectList.size());
//            notifyDataSetChanged();
//        }

    }
}