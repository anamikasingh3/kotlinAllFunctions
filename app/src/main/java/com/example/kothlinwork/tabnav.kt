package com.example.kothlinwork

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentTransaction
import android.widget.FrameLayout

class tabnav : AppCompatActivity() {
    var tabLayout: TabLayout? = null
    var frameLayout: FrameLayout? = null
    var fragment: Fragment? = null
    var fragmentManager: FragmentManager? = null
    var fragmentTransaction: FragmentTransaction? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tabnav)

        tabLayout = findViewById<TabLayout>(R.id.tabLayout)
        frameLayout = findViewById<FrameLayout>(R.id.frameLayout)

        fragment = home()
        fragmentManager = supportFragmentManager

        fragmentTransaction = fragmentManager!!.beginTransaction()

        fragmentTransaction!!.replace(R.id.frameLayout, home())
        fragmentTransaction!!.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
        fragmentTransaction!!.commit()
        //adding listener for tab select
        tabLayout!!.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {
                // creating cases for fragment
                val fm = supportFragmentManager
                val ft = fm.beginTransaction()
                when (tab.position) {
                    0 ->{ fragment = home()
                    ft.replace(R.id.frameLayout,home())}
                    1 ->{ fragment = midfrag()
                    ft.replace(R.id.frameLayout,midfrag() )}
                    2 -> {fragment = helpfrag()
                        ft.replace(R.id.frameLayout,helpfrag())}

                }


                ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                ft.commit()
            }

            override fun onTabUnselected(tab: TabLayout.Tab) {

            }

            override fun onTabReselected(tab: TabLayout.Tab) {

            }
        })

    }

}
