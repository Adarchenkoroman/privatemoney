package app.adachenko.privatemoney.screens.start

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import app.adachenko.privatemoney.R
import app.adachenko.privatemoney.model.nalichka.NalichkaItem
import java.util.Collections.emptyList



class StartAdapter:RecyclerView.Adapter<StartAdapter.StartViewHolder>() {
    var liststart= emptyList<NalichkaItem>()

    class StartViewHolder(view:View):RecyclerView.ViewHolder(view){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StartViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.item_money_layout,parent,false)
        return StartViewHolder(view)

    }

    override fun onBindViewHolder(holder: StartViewHolder, position: Int) {
       holder.itemView.item_name.text=liststart[position].ccy
        holder.itemView.item_buy.text=liststart[position].buy
        holder.itemView.item_sale.text=liststart[position].sale


    }

    override fun getItemCount(): Int {
        return liststart.size

    }

    @SuppressLint("NotifyDataSetChanged")
    fun setList(list: List<NalichkaItem>) {
          liststart=list
        notifyDataSetChanged()

    }
}