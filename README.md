圆形按钮
========

该仓库用来实现圆形按钮，参考项目：<https://github.com/markushi/android-circlebutton><br/>
[示例下载](https://github.com/david-loman/CircleButton/blob/master/CircleButton/CircleButton-samples/target/CircleButton-samples.apk)<br/>
目前测试通过的版本为：4.4,4.0，由于个人手头机子有限，其它Android版本的仍未测试

=======

###说明
按钮可以添加文字或图片，通过如下代码来实现自定义按钮

1 对文字进行编辑：
```java
// 设置文字内容(居中显示)
public void set_text(String text);
// 设置字体大小(单位是dp)
public void set_text_size_dp(int dp);
// 设置字体
public void set_typeface(Typeface typeFace);
// 设置文字颜色
public void set_text_color(int color);
```

2 对于图片的设置：
```java
public void set_fg_drawable(Drawable drawable);
```

3 设置背景颜色与按钮散开大小：
```java
//设置背景颜色
public void set_bg_color(int color);
//设置按钮散开大小
public void set_pressed_ring_width(int dp);
``` 

同时可以通过xml的方式来实现按钮:
```xml
<!-- 显示 drawable-->
<com.mindpin.android.circlebutton.CircleButton
  android:layout_width="64dip"
  android:layout_height="64dip"
  android:src="@drawable/ic_action_tick"
  cb:bg_color="#99CC00"
  cb:pressed_ring_width="8dip"
  />

<!-- 显示文字-->
<com.mindpin.android.circlebutton.CircleButton
  android:layout_width="64dip"
  android:layout_height="64dip"
  cb:bg_color="#99CC00"
  cb:text_color="#ffffff"
  cb:text="xxx"
  cb:text_size_dp="12dp"
  cb:pressed_ring_width="8dip"
  />
```
===========

###如何使用

1 下载完工程后，在Eclipse中导入CircleButton <br/>
2 选中CircleButton工程右击-->Properties-->Android,将Is library项选中，而后Apply <br/>
3 选中你要使用该按钮的工程右击-->Properties-->Android,在Is library项下选 Add,将CircleButton加入，点击Apply即可 <br/>

=========

###更新说明

2014-8-12<br/>
1 完成通过maven+Eclipse环境完成 <br/>
2 由于系统自动生成的原因CircleButton-it为Sample工程，关于组件的使用请参照Mainactivity中的案例来完成 <br/>
3 修正了动画和字体显示的问题<br/>
<br/>
2014-8-18<br/>
1 通过maven+Android studio环境来完成<br/>
2 CircleButton为libary工程，Simple工程为演示工程<br/>
3 这回应该解决maven不能使用的问题了<br/>
4 修正了字体大小问题<br/>
4 修正了字体大小问题
