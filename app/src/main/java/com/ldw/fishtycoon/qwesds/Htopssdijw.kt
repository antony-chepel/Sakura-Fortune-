package com.ldw.fishtycoon.qwesds

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ldw.fishtycoon.databinding.ActivityUsdowoBinding
import com.ldw.fishtycoon.resdsa.Jusidhuwu
import kotlin.random.Random

class Htopssdijw : AppCompatActivity() {
    private lateinit var rasdtasdyasdhasj : ActivityUsdowoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        rasdtasdyasdhasj = ActivityUsdowoBinding.inflate(layoutInflater)
        setContentView(rasdtasdyasdhasj.root)
        rasdtasdyasdhasj.dpsaodslasdld.text = Gtrsudwi.l_enig_p[Random.nextInt(4)]
        rasdtasdyasdhasj.hasdasudasdi.setOnClickListener {
            startActivity(Intent(this,Jusidhuwu::class.java))
        }
    }
}