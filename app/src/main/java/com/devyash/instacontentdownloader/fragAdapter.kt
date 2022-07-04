package com.devyash.instacontentdownloader

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class fragAdapter(private val myContext: Context, fm: FragmentManager, internal var totalTabs: Int) : FragmentPagerAdapter(fm) {

    // this is for fragment tabs
    override fun getItem(position: Int): Fragment {
        when (position) {
            0 -> {
                //  val homeFragment: HomeFragment = HomeFragment()
                return ReelFragment()
            }
            1 -> {
                return IGTVFrag()
            }
            2 -> {
                // val movieFragment = MovieFragment()
                return VideoFrag()
            }
            3 ->{
                return PhotoFrag()
            }
            4 ->{
                return PicFrag()
            }
            else -> return Fragment()
        }
    }

    // this counts total number of tabs
    override fun getCount(): Int {
        return totalTabs
    }
}