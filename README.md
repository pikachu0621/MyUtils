适配器
------
BaseAdapter
QuickAdapter
PagerAdapter
PagerAdapter2


基类
------
Activity
BaseFragment
BasePopupWindow
BaseBottomSheetDialog
BaseDialog


工具类
-------



地址
------
[Github](https://github.com/pikachu0621)




用法
-----
1. 导入
```java


```

2. 开启 viewBinding
```java
    viewBinding {
        enabled = true
    }
```







QuickAdapter  (单布局)
-----
```java
public class TestQuickAdapter extends QuickAdapter<ActivityMainBinding, String> {
    
    public TestQuickAdapter(List<String> data) {
        super(data);
    }

    @Override
    public void onQuickBindView(ActivityMainBinding binding, String itemData, int position, List<String> data) {
        
    }
}
```









混淆
-------
```pro
-keep class  com.pikachu.databinding.* {*;}
```