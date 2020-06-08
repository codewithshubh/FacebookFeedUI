package com.example.facebookfeed;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;

import java.util.ArrayList;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.MyViewHolder>{

    Context context;
    ArrayList<PostModel> postModelArrayList;
    RequestManager glide;

    public PostAdapter(Context context, ArrayList<PostModel> postModelArrayList) {
        this.context = context;
        this.postModelArrayList = postModelArrayList;
        glide = Glide.with(context);
    }

    @NonNull
    @Override
    public PostAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.post_layout, parent, false);
        MyViewHolder viewHolder = new MyViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull PostAdapter.MyViewHolder holder, int position) {
        final PostModel postModel = postModelArrayList.get(position);

        holder.tv_name.setText(postModel.getName());
        holder.tv_time.setText(postModel.getTime());
        holder.tv_status.setText(postModel.getStatus());
        holder.tv_like.setText(String.valueOf(postModel.getLikeCounts()));
        holder.tv_comment.setText(postModel.getCommentsCount() + " comments");

        glide.load(postModel.getUserProfilepic()).into(holder.iv_userProfile);

        if(postModel.getPostPic() == 0)
            holder.iv_postImg.setVisibility(View.GONE);
        else{
            holder.iv_postImg.setVisibility(View.VISIBLE);
            glide.load(postModel.getPostPic()).into(holder.iv_postImg);
        }

    }

    @Override
    public int getItemCount() {
        return postModelArrayList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView tv_name, tv_time, tv_status, tv_like, tv_comment;
        ImageView iv_userProfile, iv_postImg;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            tv_name = itemView.findViewById(R.id.tv_name);
            tv_time = itemView.findViewById(R.id.tv_time);
            tv_status = itemView.findViewById(R.id.tv_status);
            tv_like = itemView.findViewById(R.id.tv_like);
            tv_comment = itemView.findViewById(R.id.tv_comment);

            iv_userProfile = itemView.findViewById(R.id.iv_profilepic);
            iv_postImg = itemView.findViewById(R.id.iv_postpic);

        }
    }
}
