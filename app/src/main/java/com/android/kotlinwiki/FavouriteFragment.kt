package com.android.kotlinwiki


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.android.kotlinwiki.adapter.ArtcileCardRecyclerAdapter
import com.android.kotlinwiki.adapter.ArtcileListRecyclerAdapter
import kotlinx.android.synthetic.main.fragment_favourite.*


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class FavouriteFragment : Fragment() {
var  recyclerViewfa :RecyclerView? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view = inflater.inflate(R.layout.fragment_favourite, container, false)
        recyclerViewfa = view.findViewById<RecyclerView>(R.id.recyclerViewFav)
        recyclerViewfa!!.layoutManager = LinearLayoutManager(context)
        recyclerViewfa!!.adapter  = ArtcileCardRecyclerAdapter()

        return view
    }


}
