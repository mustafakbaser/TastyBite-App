package net.mustafabaser.tastybite.ui.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import net.mustafabaser.tastybite.R;
import net.mustafabaser.tastybite.databinding.FragmentHomepageBinding;
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

        return binding.getRoot();
    }
}