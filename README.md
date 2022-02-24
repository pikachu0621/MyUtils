自用Android工具类
=====
[![第版本4](https://jitpack.io/v/pikachu0621/MyUtils.svg)](https://jitpack.io/#pikachu0621/MyUtils)
<br>
[Github地址](https://github.com/pikachu0621)




适配器
------
> RecyclerView 适配器  <br>
`BaseAdapter` <br>
`QuickAdapter` <br>

> ViewPager 适配器 <br>
`PagerAdapter` <br>
`PagerAdapter2` <br>

基类
------
> Activity <br>
`BaseActivity` <br>

> Fragment <br>
`BaseFragment` <br>

> 对话框 <br>
`BaseDialog` <br>
`BaseBottomSheetDialog` <br>
`BasePopupWindow` <br>

工具类
-------
> Activity堆栈管理
`AppManagerUtils` <br>

> Assets文件管理
`AssetsUtils` <br>

> Base64工具
`Base64Utils` <br>

> bitmap图片工具类
`BitmapUtils` <br>

> 设备工具信息工具
`EquipmentUtils` <br>

> 文件工具类
`FileUtils` <br>

> glide图片加载工具类
`GlideUtils` <br>

> 系统http工具类
`LoadUrlUtils` <br>

> log日志工具类
`LogsUtils` <br>

> 网络检测工具类
`NetUtils` <br>

> SharedPreferences本地xml储存工具类
`SharedPreferencesUtils` <br>

> 时间工具类
`TimeUtils` <br>

> Toast工具类
`ToastUtils` <br>

> Ui相关工具类
`UiUtils` <br>


使用
====

导入
----

1. 项目build.gradle导入

```groovy
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```

2. app build.gradle导入

```groovy
dependencies {
    implementation 'com.github.pikachu0621:MyUtils:0.0.4'
}
```

3. 在app build.gradle 开启 viewBinding

```groovy
android {
    ...
    viewBinding {
        enabled = true
    }
}
```

QuickAdapter  (RecyclerView单布局)
---

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

BaseAdapter  (RecyclerView多布局)
---

```java
public class Test2QuickAdapter extends BaseAdapter<String> {

    public Test2QuickAdapter(List<String> data) {
        super(data);
    }

    @Override
    public Class<? extends ViewBinding> onCreateView(ViewGroup parent, int viewType) {
        // 根据 viewType 返回布局 Binding
        if (viewType == 1) {
            return ActivityMainBinding.class;
        } else if (viewType == 10) {
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
```

Activity用法
---

```java
public class MainActivity extends BaseActivity<ActivityMainBinding> {
    @Override
    protected void initActivity(Bundle savedInstanceState) {
        // 业务逻辑
        // binding.getRoot().setVisibility(View.VISIBLE);
    }
}
```

Fragment用法(支持懒加载)
----

```java
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
```

对话框
---

```java
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
```


持续添加中
---


混淆
-------

```pro
-keep class  com.pikachu.databinding.* {*;}
```