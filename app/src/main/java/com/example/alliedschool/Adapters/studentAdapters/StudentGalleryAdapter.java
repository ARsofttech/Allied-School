package com.example.alliedschool.Adapters.studentAdapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.alliedschool.R;
import com.example.alliedschool.activities.GalleryDetailsActivity;

public class StudentGalleryAdapter extends RecyclerView.Adapter<StudentGalleryAdapter.ViewHolder> {
Context context;
String[] events;
    public StudentGalleryAdapter(Context context, String[] events) {
        this.context =context;
        this.events = events;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item_student_gallery,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.textView.setText(events[position]);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, GalleryDetailsActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.putExtra("event name",events[position]);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return events.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private TextView textView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.tv_gallery_e_name);
        }
    }
}
