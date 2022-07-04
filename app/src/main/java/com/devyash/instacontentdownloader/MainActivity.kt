package com.devyash.instacontentdownloader

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    var tabLayout: TabLayout? = null
    var viewPager: ViewPager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         tabLayout=findViewById<TabLayout>(R.id.tabLayout)
         viewPager=findViewById<ViewPager>(R.id.viewPager)

        tabLayout!!.addTab(tabLayout!!.newTab().setText("Reel"))
        tabLayout!!.addTab(tabLayout!!.newTab().setText("IGTV"))
        tabLayout!!.addTab(tabLayout!!.newTab().setText("Video"))
        tabLayout!!.addTab(tabLayout!!.newTab().setText("Photo"))
        tabLayout!!.addTab(tabLayout!!.newTab().setText("Pic"))
        tabLayout!!.tabGravity=TabLayout.GRAVITY_FILL


        val adatpter=fragAdapter(this,supportFragmentManager,tabLayout!!.tabCount)
        viewPager!!.adapter=adatpter

        viewPager!!.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tabLayout))

        tabLayout!!.addOnTabSelectedListener(object :TabLayout.OnTabSelectedListener{
            override fun onTabSelected(tab: TabLayout.Tab) {
                viewPager!!.currentItem = tab.position
            }

            override fun onTabUnselected(tab: TabLayout.Tab) {

            }

            override fun onTabReselected(tab: TabLayout.Tab) {

            }
        })


    }

}