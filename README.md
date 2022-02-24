自用Android工具类
=====
[![第版本4](https://jitpack.io/v/pikachu0621/MyUtils.svg)](https://jitpack.io/#pikachu0621/MyUtils)
<br>
[Github地址](https://github.com/pikachu0621)




适配器
------
>RecyclerView 适配器 
`BaseAdapter` <br>
`QuickAdapter`

>PagerView 适配器
`PagerAdapter` <br>
`PagerAdapter2`

基类
------
>Activity <br>
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
```java
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
```

2. app build.gradle导入
```java
dependencies {
    implementation 'com.github.pikachu0621:MyUtils:0.0.4'
}
```

3. 在app build.gradle 开启 viewBinding
```java
android {
    ...
    viewBinding {
        enabled = true
    }
}
```





QuickAdapter  (单布局)
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









混淆
-------
```pro
-keep class  com.pikachu.databinding.* {*;}
```