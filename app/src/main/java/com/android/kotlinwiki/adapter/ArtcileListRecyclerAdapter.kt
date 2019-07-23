package com.android.kotlinwiki.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.android.kotlinwiki.R
import com.android.kotlinwiki.hlder.CardHolder

class ArtcileListRecyclerAdapter : RecyclerView.Adapter<CardHolder> (){
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): CardHolder {
        var cardItem =LayoutInflater.from(p0?.context).inflate(R.layout.article_list_item,p0,false)
        return CardHolder( cardItem)
    }

    override fun getItemCount(): Int {
        return 15
    }

    override fun onBindViewHolder(p0: CardHolder, p1: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


}