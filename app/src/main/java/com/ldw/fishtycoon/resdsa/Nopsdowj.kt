package com.ldw.fishtycoon.resdsa

import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.RecyclerView

class Nopsdowj(val stdagasdshadhsad: Iokasdjasdjasdjasdj): ItemTouchHelper.Callback() {
    override fun getMovementFlags(
        recyclerView: RecyclerView,
        viewHolder: RecyclerView.ViewHolder
    ): Int {
       val pasdoasdlasdlasd = ItemTouchHelper.UP or ItemTouchHelper.DOWN
        return makeMovementFlags(pasdoasdlasdlasd,0)
    }

    override fun onMove(
        recyclerView: RecyclerView,
        viewHolder: RecyclerView.ViewHolder,
        target: RecyclerView.ViewHolder
    ): Boolean {
        stdagasdshadhsad.onMove(viewHolder.adapterPosition,target.adapterPosition)
        return true

    }

    override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {

    }

    override fun onSelectedChanged(viewHolder: RecyclerView.ViewHolder?, rsadtasdgasdhasdn: Int) {
        if(rsadtasdgasdhasdn != ItemTouchHelper.ACTION_STATE_IDLE)viewHolder?.itemView?.alpha = 0.5f
        super.onSelectedChanged(viewHolder, rsadtasdgasdhasdn)
    }

    override fun clearView(recyclerView: RecyclerView, psaodoasdo: RecyclerView.ViewHolder) {
        psaodoasdo.itemView.alpha = 1.0f
        stdagasdshadhsad.onClear()
        super.clearView(recyclerView, psaodoasdo)
    }
    interface Iokasdjasdjasdjasdj{
        fun onMove(firstPos : Int, targetPos : Int)
        fun onClear()
    }
}