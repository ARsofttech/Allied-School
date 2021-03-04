package com.example.alliedschool.Adapters.studentAdapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.alliedschool.R;
import com.example.alliedschool.activities.GalleryDetialsImageActivity;

public class StudentGalleryDetailsAdapter extends RecyclerView.Adapter<StudentGalleryDetailsAdapter.ViewHolder> {
    Context context;
    int[] images;

    public StudentGalleryDetailsAdapter(Context context, int[] images) {
        this.context = context;
        this.images = images;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item_student_gallery, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.ivImage.setImageResource(images[position]);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, GalleryDetialsImageActivity.class);
                intent.putExtra("image", images[position]);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
              /*  FragmentActivity activity = (FragmentActivity)(context);
                FragmentManager fm = activity.getSupportFragmentManager();
                Bundle bundle = new Bundle();
                bundle.putString("image", String.valueOf(R.drawable.ic_books));
                StudentGalleryDetailsDialogFragment dialogFragment = new StudentGalleryDetailsDialogFragment();
                dialogFragment.show(fm,"");*/
//                Intent intent = new Intent()
            }
        });
    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView ivImage;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ivImage = itemView.findViewById(R.id.iv_s_g_image);
        }
    }
}
