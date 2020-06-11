package com.sun.dialogactiviy

import android.annotation.TargetApi
import android.app.Activity
import android.app.Fragment
import android.os.Build
import android.os.Bundle
import android.view.Gravity
import android.view.WindowManager


class DialogActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dialog)
        windowColor()
//        val myPageAdapter = MyPagerAdapter(fragmentManager)
//
//        val datas: ArrayList<Fragment> = ArrayList<Fragment>()
//        datas.add(BlankFragment())
//        datas.add(BlankFragment2())
//        myPageAdapter.setData(datas)
//
//        val titles = ArrayList<String>()
//        titles.add("A")
//        titles.add("B")
//        titles.add("C")
//        myPageAdapter.setTitles(titles)

    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    fun windowColor() {
        val window = window
        //取消设置Window半透明的Flag
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
        //添加Flag把状态栏设为可绘制模式
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        //设置状态栏为透明/或者需要的颜色
//        window.setStatusBarColor(getResources().getColor(Color.TRANSPARENT));
        getWindow().setGravity(Gravity.BOTTOM) //设置显示在底部 默认在中间
        val lp = getWindow().attributes
        lp.width = WindowManager.LayoutParams.MATCH_PARENT //设置宽度满屏
        lp.height = WindowManager.LayoutParams.WRAP_CONTENT
        getWindow().attributes = lp
        setFinishOnTouchOutside(true) //允许点击空白处关闭
    }
}