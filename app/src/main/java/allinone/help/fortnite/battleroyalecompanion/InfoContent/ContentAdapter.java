package allinone.help.fortnite.battleroyalecompanion.InfoContent;

import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import allinone.help.fortnite.battleroyalecompanion.R;

public class ContentAdapter extends RecyclerView.Adapter<ContentAdapter.ViewHolder>  {

    private ArrayList<InfoContentItem> items = new ArrayList<InfoContentItem>();
    private static final String TAG = "MY LOG ADAPTER ";


    public ContentAdapter() {
        super();


    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    @Override
    public void onBindViewHolder(@NonNull ContentAdapter.ViewHolder holder, final int position) {
        Log.d(TAG, "onBindViewHolder");
        final int pos = position;
        final InfoContentItem item = items.get(position);

        Glide.with(holder.itemView.getContext()).load(item.getImageName1())
                .thumbnail(0.5f)
                .into(holder.imageName);

        holder.item_name.setText(item.getTxt_card());
        holder.char1_txt.setText(item.getChar1_txt());
        holder.char2_txt.setText(item.getChar2_txt());


    }

    @NonNull
    @Override
    public ContentAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Log.d(TAG, "onCreateViewHolder");
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_content, parent, false);

        return new ContentAdapter.ViewHolder(view);
    }


    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageName;
        TextView item_name;
        TextView char1_txt;
        TextView char2_txt;


        public ViewHolder(View itemView) {
            super(itemView);
            imageName = itemView.findViewById(R.id.imageName);
            item_name = itemView.findViewById(R.id.item_name);
            char1_txt = itemView.findViewById(R.id.char1_txt);
            char2_txt = itemView.findViewById(R.id.char2_txt);
        }

        public void bind(InfoContentItem allConstructionItem) {
            Log.d(TAG, "bind");

        }
    }

    public  void addMessage(InfoContentItem item) {
        Log.d(TAG, "addMessage");
        items.add(item);
        notifyItemChanged(items.size() - 1);
    }

}
