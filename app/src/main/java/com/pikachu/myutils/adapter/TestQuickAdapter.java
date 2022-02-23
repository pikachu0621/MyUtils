package com.pikachu.myutils.adapter;

import com.pikachu.myutils.databinding.ActivityMainBinding;
import com.pikachu.utils.adapter.QuickAdapter;

import java.util.List;

public class TestQuickAdapter extends QuickAdapter<ActivityMainBinding, String> {

    public TestQuickAdapter(List<String> data) {
        super(data);
    }

    @Override
    public void onQuickBindView(ActivityMainBinding binding, String itemData, int position, List<String> data) {

    }
}
