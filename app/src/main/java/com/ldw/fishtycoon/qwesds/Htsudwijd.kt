package com.ldw.fishtycoon.qwesds
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ldw.fishtycoon.databinding.ItmYsusidwBinding
import com.ldw.fishtycoon.fewdw.Htrsydus
import com.ldw.fishtycoon.resdsa.Nopsdowj
import com.squareup.picasso.Callback
import com.squareup.picasso.Picasso
import java.lang.Exception
import java.util.*

class Htsudwijd(val dgasdashuasduasduisad :ArrayList<Htrsydus>) : RecyclerView.Adapter<Htsudwijd.MiracleHolder>(),
    Nopsdowj.Iokasdjasdjasdjasdj {
    class MiracleHolder(val wpsaodasldalasdl : ItmYsusidwBinding) : RecyclerView.ViewHolder(wpsaodasldalasdl.root) {

        fun hsdiwqdiqwidiq(odwoqdoqwd : Htrsydus) = with(wpsaodasldalasdl){
            Picasso.get().load(odwoqdoqwd.rasdtasdyasdu)
                .into(ywydyqwd,object : Callback {
                    override fun onSuccess() {
                        oodwiqdiqw.visibility = View.INVISIBLE
                    }

                    override fun onError(e: Exception?) {

                    }

                } )


        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MiracleHolder {
        val weeodpasdlasdask = ItmYsusidwBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return MiracleHolder(weeodpasdlasdask)
    }

    override fun onBindViewHolder(holder: MiracleHolder, position: Int) {
        holder.hsdiwqdiqwidiq(dgasdashuasduasduisad[position])

    }

    override fun getItemCount() = dgasdashuasduasduisad.size
    override fun onMove(pasdoasdlasdl: Int, rstdaydyaus: Int) {
        val serasdhasdhjasjdjasd = dgasdashuasduasduisad[rstdaydyaus]
        dgasdashuasduasduisad[rstdaydyaus] = dgasdashuasduasduisad[pasdoasdlasdl]
        dgasdashuasduasduisad[pasdoasdlasdl] = serasdhasdhjasjdjasd
        notifyItemMoved(pasdoasdlasdl,rstdaydyaus)

    }

    override fun onClear() {

    }


}