package com.android.kotlinwiki.hlder

import android.support.v7.view.menu.ActionMenuItemView
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.android.kotlinwiki.R
import kotlinx.android.synthetic.main.article_card_view_item.view.*

class CardHolder(itemView: View) :RecyclerView.ViewHolder(itemView) {
    private val artcileImageVew :ImageView = itemView.findViewById(R.id.article_image)
    private  val titleTextView:TextView = itemView.findViewById(R.id.article_title)

}