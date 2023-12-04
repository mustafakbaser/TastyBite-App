package net.mustafabaser.tastybite.ui.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import net.mustafabaser.tastybite.R;
import net.mustafabaser.tastybite.databinding.FragmentCartBinding;
import net.mustafabaser.tastybite.databinding.FragmentFoodDetailBinding;
import net.mustafabaser.tastybite.ui.viewmodel.CartViewModel;

public class CartFragment extends Fragment {
    private FragmentCartBinding binding;
    private CartViewModel viewModel;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentCartBinding.inflate(inflater, container, false);

        return binding.getRoot();
    }
}