package com.pikachu.myutils;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.pikachu.myutils.databinding.FragmentMainBinding;
import com.pikachu.utils.base.BaseFragment;


public class MainFragment extends BaseFragment<FragmentMainBinding> {

    @Override
    protected void onInitView(Bundle savedInstanceState, FragmentMainBinding binding, FragmentActivity activity) {
        // 业务逻辑
        // binding.getRoot().setVisibility(View.VISIBLE);
    }

    @Override
    protected void lazyLoad() {
        // 懒加载 第一次对用户可见时调用
        // binding.getRoot().setVisibility(View.VISIBLE);
    }
}