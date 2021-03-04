package com.example.alliedschool.Adapters.teacherAdapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.alliedschool.Adapters.studentAdapters.StudentStudyMtAdapter;
import com.example.alliedschool.R;

public class TeacherSalaryAdapter extends RecyclerView.Adapter<TeacherSalaryAdapter.ViewHolder> {

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item_teacher_salary,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 12;
    }

    public static class ViewHolder extends StudentStudyMtAdapter.ViewHolder {
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
