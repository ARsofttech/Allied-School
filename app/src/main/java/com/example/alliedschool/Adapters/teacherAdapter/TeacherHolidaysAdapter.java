package com.example.alliedschool.Adapters.teacherAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.alliedschool.R;

public class TeacherHolidaysAdapter extends RecyclerView.Adapter<TeacherHolidaysAdapter.ViewHolder> {
    Context context;
    String[] holidays;

    public TeacherHolidaysAdapter(Context context, String[] holidays) {
        this.context = context;
        this.holidays = holidays;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item_teachers_holidys, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.textView.setText(holidays[position]);
    }

    @Override
    public int getItemCount() {
        return holidays.length;
    }

    public static class ViewHolder extends TeacherSalaryAdapter.ViewHolder {
        private TextView textView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.tv_holiday);
        }
    }
}
