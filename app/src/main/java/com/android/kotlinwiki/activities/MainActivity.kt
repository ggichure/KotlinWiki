package com.android.kotlinwiki.activities

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import com.android.kotlinwiki.ExploreFragment
import com.android.kotlinwiki.FavouriteFragment
import com.android.kotlinwiki.HistoryFragment
import com.android.kotlinwiki.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var textMessage: TextView
    private val exploreFrgament: ExploreFragment
    private val favouriteFragment : FavouriteFragment
    private val historyFragment: HistoryFragment

    init {
        exploreFrgament = ExploreFragment()
        favouriteFragment= FavouriteFragment()
        historyFragment = HistoryFragment()
    }
    private val onNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        val  transaction = supportFragmentManager.beginTransaction()
        transaction.setCustomAnimations(android.R.anim.fade_in ,android.R.anim.fade_out)

        when (item.itemId) {
            R.id.navigation_exp -> {
               transaction.replace(R.id.fragment_container, exploreFrgament)

            }
            R.id.navigation_fav -> {
                transaction.replace(R.id.fragment_container, favouriteFragment)
            }
            R.id.navigation_hist -> {
                transaction.replace(R.id.fragment_container,historyFragment)
            }

        }
        transaction.commit()
        true
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navView: BottomNavigationView = findViewById(R.id.nav_view)


        navView.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener)
        val transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.fragment_container, exploreFrgament)
        transaction.commit()
    }
}
