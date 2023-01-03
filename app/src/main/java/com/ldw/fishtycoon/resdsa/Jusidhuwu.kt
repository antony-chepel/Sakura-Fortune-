package com.ldw.fishtycoon.resdsa

import android.annotation.SuppressLint
import android.content.Intent
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import com.ldw.fishtycoon.R
import com.ldw.fishtycoon.databinding.ActivityNiduidsjfeuBinding
import com.ldw.fishtycoon.qwesds.Htsudwijd
import com.ldw.fishtycoon.qwesds.Gtrsudwi
import com.ldw.fishtycoon.qwesds.Htopssdijw


class Jusidhuwu : AppCompatActivity() {
    private var ksdaodaspasdpsdapasd : Htsudwijd? = null
    private var pasdoasdlaslasdlasdl: CountDownTimer? = null
    private lateinit var tasdrasgdhashasd: ActivityNiduidsjfeuBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasdrasgdhashasd = ActivityNiduidsjfeuBinding.inflate(layoutInflater)
        setContentView(tasdrasgdhashasd.root)
        wosdlsadllsdalasd()
        tasdrasgdhashasd.bReady.setOnClickListener{
            startActivity(Intent(this, Jusidhuwu::class.java))
        }
        hsadisdaosdaosoadoasd()
    }


    private fun wosdlsadllsdalasd() =with(tasdrasgdhashasd){
        var mdksosdalsdoasdo = 15
        pasdoasdlaslasdlasdl?.cancel()
        pasdoasdlaslasdlasdl = object : CountDownTimer(15000,1000){
            @SuppressLint("SetTextI18n")
            override fun onTick(millisUntilFinished: Long) {
                mdksosdalsdoasdo--
                if(mdksosdalsdoasdo >= 0) {
                    val count = mdksosdalsdoasdo.toString()
                    ewodwqpdlsasdkka.text = "Time : $count sec"

                    when(mdksosdalsdoasdo){
                        3-> ewodwqpdlsasdkka.setTextColor(resources.getColor(R.color.sak_red))
                        2-> ewodwqpdlsasdkka.setTextColor(resources.getColor(R.color.sak_red))
                        1-> ewodwqpdlsasdkka.setTextColor(resources.getColor(R.color.sak_red))
                        0-> ewodwqpdlsasdkka.setTextColor(resources.getColor(R.color.sak_red))
                    }
                }
            }

            override fun onFinish() {
                ewodwqpdlsasdkka.setTextColor(resources.getColor(R.color.white))
                if(mdksosdalsdoasdo==0){
                    mdksosdalsdoasdo = 10
                    startActivity(Intent(this@Jusidhuwu, Htopssdijw::class.java)
                        .putExtra("bad","bad")
                    )
                }


            }

        }.start()
    }

    private fun hsadisdaosdaosoadoasd() = with(tasdrasgdhashasd){
        ksdaodaspasdpsdapasd = Htsudwijd(Gtrsudwi.l_enig)
        pasdosadlsadlsd.layoutManager = GridLayoutManager(this@Jusidhuwu,3)
        pasdosadlsadlsd.adapter = ksdaodaspasdpsdapasd
        val rsardtdasyuasduasd = Nopsdowj(ksdaodaspasdpsdapasd!!)
        val woqdwpdwqldsllasdlasd = ItemTouchHelper(rsardtdasyuasduasd)
        woqdwpdwqldsllasdlasd.attachToRecyclerView(pasdosadlsadlsd)

    }


}