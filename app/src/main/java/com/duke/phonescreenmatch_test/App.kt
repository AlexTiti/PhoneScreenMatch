package com.duke.phonescreenmatch_test

import android.app.Application
import android.content.Context

/**
 * @author  : Alex
 * @date    : 2018/08/22
 * @version : V 2.0.0
 */


class App : Application() {
    companion object {
        lateinit var context: Context
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }


}