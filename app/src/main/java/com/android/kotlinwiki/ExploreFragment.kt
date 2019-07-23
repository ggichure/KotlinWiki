package com.android.kotlinwiki


import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.CardView
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.android.kotlinwiki.adapter.ArtcileCardRecyclerAdapter
import kotlinx.android.synthetic.main.fragment_explore.*


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class ExploreFragment : Fragment() {
var search_cardView :CardView? = null
    var exprecylerView : RecyclerView? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view = inflater.inflate(R.layout.fragment_explore, container, false)
            search_cardView = view.findViewById<CardView>(R.id.search_cardView)
        exprecylerView = view.findViewById<RecyclerView>(R.id.exp_recyclerview)
        search_cardView!!.setOnClickListener{
            val  searchIntnet =Intent(context ,SearchActivity::class.java)
            context?.startActivity(searchIntnet)

        }
        exprecylerView !!.layoutManager = LinearLayoutManager(context)
        exprecylerView !!.adapter = ArtcileCardRecyclerAdapter ()

        return view
    }


}
