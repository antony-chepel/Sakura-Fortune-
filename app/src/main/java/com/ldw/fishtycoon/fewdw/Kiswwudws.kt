package com.ldw.fishtycoon.fewdw

import android.app.Application
import com.onesignal.OneSignal
import com.orhanobut.hawk.Hawk

class Kiswwudws : Application() {
    companion object {
        var vobvijvbuhvkofkd: String? = "d11"
        var xcoxczs: String? = "c11"
        var xoskdokwopdl = "appsChecker"

        const val zspdodskdsko = "ff522733-fb53-45d2-9f24-8f2d56f5016c"
        var qpwoksdsijad: String? = ""

        var jidsidusduhsd = "link"

    }

    override fun onCreate() {
        super.onCreate()
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE)
        OneSignal.initWithContext(this)
        OneSignal.setAppId(zspdodskdsko)

        Hawk.init(this).build()


    }
}