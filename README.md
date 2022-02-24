自用Android工具类
=====
[![第版本4](https://jitpack.io/v/pikachu0621/MyUtils.svg)](https://jitpack.io/#pikachu0621/MyUtils)
<br>
[Github地址](https://github.com/pikachu0621)




适配器
------
>RecyclerView 适配器 
`BaseAdapter`
`QuickAdapter`

>PagerView 适配器
`PagerAdapter`
`PagerAdapter2`

基类
------
>Activity
`BaseActivity`
> Fragment
`BaseFragment`
> 对话框
`BaseDialog`
`BaseBottomSheetDialog`
`BasePopupWindow`

工具类
-------
> Activity堆栈管理
`AppManagerUtils`
> Assets文件管理
`AssetsUtils`
> Base64工具
`Base64Utils`
> bitmap图片工具类
`BitmapUtils`
> 设备工具信息工具
`EquipmentUtils`
> 文件工具类
`FileUtils`
> glide图片加载工具类
`GlideUtils`
> 系统http工具类
`LoadUrlUtils`
> log日志工具类
`LogsUtils`
> 网络检测工具类
`NetUtils`
> SharedPreferences本地xml储存工具类
`SharedPreferencesUtils`
> 时间工具类
`TimeUtils`
> Toast工具类
`ToastUtils`
> Ui相关工具类
`UiUtils`


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