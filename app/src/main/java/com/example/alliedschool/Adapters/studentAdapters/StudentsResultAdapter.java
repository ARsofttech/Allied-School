package com.example.alliedschool.Adapters.studentAdapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.alliedschool.R;

public class StudentsResultAdapter extends RecyclerView.Adapter<StudentsResultAdapter.ViewHolder> {
    String[] subjects;
    Context context;

    public StudentsResultAdapter(Context context, String[] subjects) {
        this.subjects = subjects;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_student_result, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.textView.setText(subjects[position]);
    }

    @Override
    public int getItemCount() {
        return subjects.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.tv_subject_name);
        }
    }
}
