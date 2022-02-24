package com.pikachu.myutils;

import android.content.Context;
import android.view.View;

import com.pikachu.myutils.databinding.ActivityMainBinding;
import com.pikachu.utils.base.BaseBottomSheetDialog;
import com.pikachu.utils.base.BaseDialog;
import com.pikachu.utils.base.BasePopupWindow;

public class TestDialog {

    private final Context context;

    public TestDialog(Context context) {
        this.context = context;
    }


    /**
     * 普通对话框
     * 背景默认透明
     */
    public void testBaseDialog(){
        BaseDialog<ActivityMainBinding> dialog = new BaseDialog<ActivityMainBinding>(context) {
            @Override
            protected void onViewCreate(ActivityMainBinding binding) {
                // 业务逻辑
                // binding.getRoot().setOnClickListener();
            }
        };
        dialog.show();
    }


    /**
     * 底部弹出对话框
     * 背景默认透明
     */
    public void testBaseBottomSheetDialog(){
        BaseBottomSheetDialog<ActivityMainBinding> dialog = new BaseBottomSheetDialog<ActivityMainBinding>(context) {
            @Override
            protected void onViewCreate(ActivityMainBinding binding) {
                // 业务逻辑
                // binding.getRoot().setOnClickListener();
            }
        };
        dialog.show();
    }


    /**
     * 控件悬浮对话框
     * 背景默认透明
     */
    public void testBasePopupWindow(View view){
        BasePopupWindow<ActivityMainBinding> dialog = new BasePopupWindow<ActivityMainBinding>(context) {
            @Override
            public void onViewCreate(ActivityMainBinding binding) {
                // 业务逻辑
                // binding.getRoot().setOnClickListener();
            }
        };

        dialog.showAsTop(view);
    }



}
