package com.example.profilkampus

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class ListKampusAdapter(private val listKampus : ArrayList<Universitas>) : RecyclerView.Adapter<ListKampusAdapter.ListViewHolder>(){
//    class ListViewHolder {
//
//    }

    private lateinit var onItemClickCallback : OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback){
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.list_each_campus, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val universitas = listKampus[position]

        Glide.with(holder.itemView.context)
                .load(universitas.logo)
                .into(holder.ivLogoListKampus)

        holder.tvNamaListKampus.text = universitas.nama
        holder.tvAlamatListKampus.text = universitas.alamat

//        holder.llItemList.setOnClickListener {
//            Toast.makeText(holder.itemView.context, "Klik : " + listKampus[holder.adapterPosition].alamat, Toast.LENGTH_SHORT).show()
//        }

        holder.llItemList.setOnClickListener { onItemClickCallback.onItemClicked(listKampus[holder.adapterPosition]) }
//        holder.itemView.setOnClickListener { onItemClickCallback.onItemClicked(universitas) }
    }

    override fun getItemCount(): Int {
        return listKampus.size
    }

    inner class ListViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        var tvNamaListKampus : TextView = itemView.findViewById(R.id.tvNamaListKampus)
        var tvAlamatListKampus : TextView = itemView.findViewById(R.id.tvAlamatListKampus)
        var ivLogoListKampus : ImageView = itemView.findViewById(R.id.ivLogoListKampus)

        var llItemList : LinearLayout = itemView.findViewById(R.id.llItemList)
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Universitas)
    }
}