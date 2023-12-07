package net.mustafabaser.tastybite.ui.fragment;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import net.mustafabaser.tastybite.R;
import net.mustafabaser.tastybite.databinding.FragmentHomepageBinding;
import net.mustafabaser.tastybite.ui.adapter.FoodsAdapter;
import net.mustafabaser.tastybite.ui.viewmodel.HomepageViewModel;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class HomepageFragment extends Fragment {
    private FragmentHomepageBinding binding;
    private HomepageViewModel viewModel;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentHomepageBinding.inflate(inflater, container, false);

        binding.recyclerViewFoods.setLayoutManager(new LinearLayoutManager(requireContext()));
        // binding.recyclerViewFoods.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));

        viewModel.foodsList.observe(getViewLifecycleOwner(),foodsList -> {
            FoodsAdapter adapter = new FoodsAdapter(foodsList,requireContext(),viewModel);
            binding.recyclerViewFoods.setAdapter(adapter);
        });

        return binding.getRoot();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewModel = new ViewModelProvider(this).get(HomepageViewModel.class);
    }

    /*
    @Override
    public void onResume() {
        super.onResume();
        viewModel.loadFoods();
    }*/
}