package com.pikachu.myutils.adapter;

import android.view.ViewGroup;

import androidx.viewbinding.ViewBinding;

import com.pikachu.myutils.databinding.ActivityMainBinding;
import com.pikachu.utils.adapter.BaseAdapter;

import java.util.List;

public class Test2QuickAdapter extends BaseAdapter<String> {

    public Test2QuickAdapter(List<String> data) {
        super(data);
    }

    @Override
    public Class<? extends ViewBinding> onCreateView(ViewGroup parent, int viewType) {
        // 根据 viewType 返回布局 Binding
        if (viewType == 1){
            return ActivityMainBinding.class;
        }else if (viewType == 10){
            return ActivityMainBinding.class;
        }
        return ActivityMainBinding.class;
    }

    @Override
    public void onBindView(ViewBinding binding, String itemData, int position, int itemViewType, List<String> data) {

    }

    @Override
    public int getItemViewType(int position, String itemData) {
        //根据position 返回 viewType

        return 0;
    }


}
