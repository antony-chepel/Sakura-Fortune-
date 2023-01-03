package com.ldw.fishtycoon.fewdw
import org.json.JSONException
import org.json.JSONObject
import java.io.File
import java.io.IOException

import com.ldw.fishtycoon.jhgf.Xsijwdw.lsoapdsakosa
import com.ldw.fishtycoon.jhgf.Xsijwdw.hdsaidjsa
import com.ldw.fishtycoon.jhgf.Xsijwdw.uhdfisjd

import com.appsflyer.AppsFlyerLib
import com.google.android.material.snackbar.Snackbar
import com.onesignal.OneSignal

import com.orhanobut.hawk.Hawk
import com.ldw.fishtycoon.jhgf.Xsijwdw.wokskoad
import com.ldw.fishtycoon.jhgf.Xsijwdw.ovkbokv
import com.ldw.fishtycoon.jhgf.Xsijwdw.zoplapsld

import android.app.Activity

import android.content.Intent

import android.content.pm.PackageManager
import android.net.Uri
import com.ldw.fishtycoon.jhgf.Xsijwdw.obkvnokbn
import com.ldw.fishtycoon.jhgf.Xsijwdw.sudh
import com.ldw.fishtycoon.jhgf.Xsijwdw.qok
import android.os.*
import androidx.appcompat.app.AppCompatActivity
import android.provider.MediaStore
import android.util.Log

import android.webkit.*
import com.ldw.fishtycoon.fewdw.Kiswwudws.Companion.xcoxczs
import com.ldw.fishtycoon.fewdw.Kiswwudws.Companion.vobvijvbuhvkofkd
import com.ldw.fishtycoon.fewdw.Kiswwudws.Companion.qpwoksdsijad
import android.widget.Toast
import com.ldw.fishtycoon.R
import com.ldw.fishtycoon.databinding.ActivityJyrgrreBinding
import com.ldw.fishtycoon.jhgf.Xsijwdw.rokdokf
import com.ldw.fishtycoon.jhgf.Xsijwdw.xcuiij



class Lopsijdw : AppCompatActivity() {
    var qpowkkod = ""
    private val apsdplsd = 1
    private var cjnvnxc = false
    lateinit var obkvonkijvjnivb: WebView

    var doekfeko: ValueCallback<Array<Uri>>? = null
    lateinit var viockbcko: ActivityJyrgrreBinding

    var tokod: String? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viockbcko = ActivityJyrgrreBinding.inflate(layoutInflater)
        setContentView(viockbcko.root)

        obkvonkijvjnivb = viockbcko.triods
        Snackbar.make(
            viockbcko.root, "Loading...",
            Snackbar.LENGTH_LONG
        ).show()


        val forkkodijf = CookieManager.getInstance()
        forkkodijf.setAcceptCookie(true)
        forkkodijf.setAcceptThirdPartyCookies(obkvonkijvjnivb, true)
        tyokfdjifjigd()
        val nokbonkb: Activity = this
        obkvonkijvjnivb.webViewClient = object : WebViewClient() {


            override fun shouldOverrideUrlLoading(ocxkv: WebView, rpld: String): Boolean {
                try {
                    if (URLUtil.isNetworkUrl(rpld)) {
                        return false
                    }
                    if (tirjokfosd(rpld)) {

                        val omkbnjibn = Intent(Intent.ACTION_VIEW)
                        omkbnjibn.data = Uri.parse(rpld)
                        startActivity(omkbnjibn)
                    } else {

                        Toast.makeText(
                            applicationContext,
                            "Application is not installed",
                            Toast.LENGTH_LONG
                        ).show()
                        startActivity(
                            Intent(
                                Intent.ACTION_VIEW,
                                Uri.parse("https://play.google.com/store/apps/details?id=org.telegram.messenger")
                            )
                        )
                    }
                    return true
                } catch (e: Exception) {
                    return false
                }
                ocxkv.loadUrl(rpld)
            }


            override fun onPageFinished(rokkodf: WebView, zopxkzokxz: String) {
                super.onPageFinished(rokkodf, zopxkzokxz)
                fiorkkofds(zopxkzokxz)
            }

            override fun onReceivedError(
                fokdf: WebView,
                wplsd: Int,
                onkbkobn: String,
                idso: String
            ) {
                Toast.makeText(nokbonkb, onkbkobn, Toast.LENGTH_SHORT).show()
            }


        }
        obkvonkijvjnivb.webChromeClient = object : WebChromeClient() {
            override fun onShowFileChooser(
                fidj: WebView, vock: ValueCallback<Array<Uri>>,
                spd: FileChooserParams
            ): Boolean {
                doekfeko?.onReceiveValue(null)
                doekfeko = vock
                var vicjvbjicvbjiok: Intent? = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                if (vicjvbjicvbjiok!!.resolveActivity(packageManager) != null) {

                    var dokekof: File? = null
                    try {
                        dokekof = gtoirkfod()
                        vicjvbjicvbjiok.putExtra("PhotoPath", tokod)
                    } catch (ex: IOException) {

                    }


                    if (dokekof != null) {
                        tokod = "file:" + dokekof.absolutePath
                        vicjvbjicvbjiok.putExtra(
                            MediaStore.EXTRA_OUTPUT,
                            Uri.fromFile(dokekof)
                        )
                    } else {
                        vicjvbjicvbjiok = null
                    }
                }
                val ozxkzkoc = Intent(Intent.ACTION_GET_CONTENT)
                ozxkzkoc.addCategory(Intent.CATEGORY_OPENABLE)
                ozxkzkoc.type = "image/*"
                val doekkosdjdis: Array<Intent?> =
                    vicjvbjicvbjiok?.let { arrayOf(it) } ?: arrayOfNulls(0)
                val kcxivokxc = Intent(Intent.ACTION_CHOOSER)
                kcxivokxc.putExtra(Intent.EXTRA_INTENT, ozxkzkoc)
                kcxivokxc.putExtra(Intent.EXTRA_TITLE, getString(R.string.image_chooser))
                kcxivokxc.putExtra(Intent.EXTRA_INITIAL_INTENTS, doekkosdjdis)
                startActivityForResult(
                    kcxivokxc, apsdplsd
                )
                return true
            }


            @Throws(IOException::class)
            private fun gtoirkfod(): File {
                var nokbobnij = File(
                    Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES),
                    "DirectoryNameHere"
                )
                if (!nokbobnij.exists()) {
                    nokbobnij.mkdirs()
                }


                nokbobnij =
                    File(nokbobnij.toString() + File.separator + "IMG_" + System.currentTimeMillis() + ".jpg")
                return nokbobnij
            }

        }

        obkvonkijvjnivb.loadUrl(mcixoxc())
    }





    private fun sowokskodijds(frkgo: String) {

        OneSignal.setExternalUserId(
            frkgo,
            object : OneSignal.OSExternalUserIdUpdateCompletionHandler {
                override fun onSuccess(fokdg: JSONObject) {
                    try {
                        if (fokdg.has("push") && fokdg.getJSONObject("push").has("success")) {
                            val ijjivuchhuxvc = fokdg.getJSONObject("push").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for push status: $ijjivuchhuxvc"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (fokdg.has("email") && fokdg.getJSONObject("email").has("success")) {
                            val sokdkoskosdko =
                                fokdg.getJSONObject("email").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for email status: $sokdkoskosdko"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (fokdg.has("sms") && fokdg.getJSONObject("sms").has("success")) {
                            val xozoxkcijxzjizx = fokdg.getJSONObject("sms").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for sms status: $xozoxkcijxzjizx"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                }

                override fun onFailure(error: OneSignal.ExternalIdError) {
                    OneSignal.onesignalLog(
                        OneSignal.LOG_LEVEL.VERBOSE,
                        "Set external user id done with error: $error"
                    )
                }
            })
    }

    private fun mcixoxc(): String {

        val eijji = getSharedPreferences("SP_WEBVIEW_PREFS", AppCompatActivity.MODE_PRIVATE)

        val dijeokkfjidf: String? = Hawk.get(vobvijvbuhvkofkd, "null")
        val obkvnko:String? = Hawk.get(xcoxczs, "null")
        val riokdofkodfjis: String? = Hawk.get(qpwoksdsijad, "null")


        val fiogkjidffkofko = AppsFlyerLib.getInstance().getAppsFlyerUID(this)


        AppsFlyerLib.getInstance().setCollectAndroidID(true)


        var fijjiijjicv = ""
        if (obkvnko != "null"){
            fijjiijjicv = "$hdsaidjsa$wokskoad$obkvnko&$ovkbokv$fiogkjidffkofko&$zoplapsld$riokdofkodfjis&$obkvnokbn$uhdfisjd&$rokdokf$lsoapdsakosa&$qok$xcuiij"
            sowokskodijds(fiogkjidffkofko.toString())
        } else {
            fijjiijjicv = "$hdsaidjsa$wokskoad$dijeokkfjidf&$ovkbokv$fiogkjidffkofko&$zoplapsld$riokdofkodfjis&$obkvnokbn$uhdfisjd&$rokdokf$lsoapdsakosa&$qok$sudh"
            sowokskodijds(fiogkjidffkofko.toString())
        }

        Log.d("TESTAG", "Test Result $fijjiijjicv")
        return eijji.getString("SAVED_URL", fijjiijjicv).toString()
    }




    override fun onActivityResult(didf: Int, bokvnnobk: Int, wkod: Intent?) {
        if (didf != apsdplsd || doekfeko == null) {
            super.onActivityResult(didf, bokvnnobk, wkod)
            return
        }
        var fokdgo: Array<Uri>? = null


        if (bokvnnobk == AppCompatActivity.RESULT_OK) {
            if (wkod == null || wkod.data == null) {
                fokdgo = arrayOf(Uri.parse(tokod))
            } else {
                val kcovpxl = wkod.dataString
                if (kcovpxl != null) {
                    fokdgo = arrayOf(Uri.parse(kcovpxl))
                }
            }
        }
        doekfeko?.onReceiveValue(fokdgo)
        doekfeko = null
    }


    private fun tyokfdjifjigd() {
        val fropdlf = obkvonkijvjnivb.settings

        fropdlf.allowContentAccess = true
        fropdlf.builtInZoomControls = true
        fropdlf.displayZoomControls = false


        fropdlf.allowFileAccess = true
        fropdlf.javaScriptEnabled = true
        fropdlf.setSupportZoom(true)
        fropdlf.userAgentString = fropdlf.userAgentString.replace("; wv", "")
        fropdlf.useWideViewPort = true


        fropdlf.mixedContentMode = WebSettings.MIXED_CONTENT_ALWAYS_ALLOW
        fropdlf.pluginState = WebSettings.PluginState.ON
        fropdlf.loadWithOverviewMode = true


        fropdlf.setAppCacheEnabled(true)
        fropdlf.domStorageEnabled = true
        fropdlf.javaScriptCanOpenWindowsAutomatically = true
        fropdlf.setSupportMultipleWindows(false)




    }

    override fun onBackPressed() {


        if (obkvonkijvjnivb.canGoBack()) {
            if (cjnvnxc) {
                obkvonkijvjnivb.stopLoading()
                obkvonkijvjnivb.loadUrl(qpowkkod)
            }
            this.cjnvnxc = true
            obkvonkijvjnivb.goBack()
            Handler(Looper.getMainLooper()).postDelayed(Runnable {
                cjnvnxc = false
            }, 2000)

        } else {
            super.onBackPressed()
        }
    }


    fun fiorkkofds(vockcvko: String?) {
        if (!vockcvko!!.contains("t.me")) {

            if (qpowkkod == "") {
                qpowkkod = getSharedPreferences(
                    "SP_WEBVIEW_PREFS",
                    AppCompatActivity.MODE_PRIVATE
                ).getString(
                    "SAVED_URL",
                    vockcvko
                ).toString()

                val dofkdskoskd = getSharedPreferences("SP_WEBVIEW_PREFS", AppCompatActivity.MODE_PRIVATE)
                val vockbocv = dofkdskoskd.edit()
                vockbocv.putString("SAVED_URL", vockcvko)
                vockbocv.apply()
            }
        }
    }

    private fun tirjokfosd(voic: String): Boolean {

        val fodfkdflpdf = packageManager
        try {

            fodfkdflpdf.getPackageInfo("org.telegram.messenger", PackageManager.GET_ACTIVITIES)


            return true
        } catch (e: PackageManager.NameNotFoundException) {

        }
        return false
    }





}