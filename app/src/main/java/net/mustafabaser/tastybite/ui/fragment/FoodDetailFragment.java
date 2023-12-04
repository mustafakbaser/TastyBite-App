package net.mustafabaser.tastybite.ui.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import net.mustafabaser.tastybite.R;
import net.mustafabaser.tastybite.databinding.FragmentFoodDetailBinding;
import net.mustafabaser.tastybite.databinding.FragmentHomepageBinding;
import net.mustafabaser.tastybite.ui.viewmodel.FoodDetailViewModel;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class FoodDetailFragment extends Fragment {
    private FragmentFoodDetailBinding binding;
    private FoodDetailViewModel viewModel;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentFoodDetailBinding.inflate(inflater, container, false);

        return binding.getRoot();
    }
}