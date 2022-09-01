package app.adachenko.privatemoney.screens.second

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import app.adachenko.privatemoney.R
import app.adachenko.privatemoney.model.beznal.BeznalItem
import app.adachenko.privatemoney.model.nalichka.NalichkaItem
import java.util.*
import java.util.Collections.emptyList

class SecondAdapter:RecyclerView.Adapter<SecondAdapter.SecondViewHolder>(){
    var listsecond= emptyList<BeznalItem>()

    class SecondViewHolder(view: View): RecyclerView.ViewHolder(view){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SecondViewHolder {
        val view=
            LayoutInflater.from(parent.context).inflate(R.layout.item_money_layout,parent,false)
        return SecondViewHolder(view)

    }

    override fun onBindViewHolder(holder: SecondViewHolder, position: Int) {
        holder.itemView.item_name.text=listsecond[position].ccy
        holder.itemView.item_buy.text=listsecond[position].buy
        holder.itemView.item_sale.text=listsecond[position].sale


    }

    override fun getItemCount(): Int {
        return listsecond.size

    }

    @SuppressLint("NotifyDataSetChanged")
    fun setList(list: List<BeznalItem>) {
        listsecond=list
        notifyDataSetChanged()

    }
}