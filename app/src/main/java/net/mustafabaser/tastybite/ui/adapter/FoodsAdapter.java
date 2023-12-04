package net.mustafabaser.tastybite.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import net.mustafabaser.tastybite.data.entity.Foods;
import net.mustafabaser.tastybite.databinding.CardDesignBinding;
import net.mustafabaser.tastybite.ui.fragment.HomepageFragment;
import net.mustafabaser.tastybite.ui.viewmodel.HomepageViewModel;

import java.util.List;

public class FoodsAdapter extends RecyclerView.Adapter<FoodsAdapter.CardDesignHolder>{
    private List<Foods> foodsList;
    private Context mContext;
    private HomepageViewModel viewModel;

    public FoodsAdapter(List<Foods> foodsList, Context mContext,HomepageViewModel viewModel){
        this.foodsList = foodsList;
        this.mContext = mContext;
        this.viewModel = viewModel;
    }


    public class CardDesignHolder extends RecyclerView.ViewHolder {
        private CardDesignBinding binding;

        public CardDesignHolder(CardDesignBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }

    @NonNull
    @Override
    public FoodsAdapter.CardDesignHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        CardDesignBinding binding = CardDesignBinding.inflate(LayoutInflater.from(mContext), parent, false);
        return new CardDesignHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull FoodsAdapter.CardDesignHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return foodsList.size();
    }
}
