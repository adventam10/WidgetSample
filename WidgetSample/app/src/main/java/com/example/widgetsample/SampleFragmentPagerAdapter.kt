package com.example.widgetsample

import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class SampleFragmentPagerAdapter(fm: FragmentManager) : FragmentStatePagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
    override fun getCount() = 3

    override fun getItem(position: Int) =
        when (position) {
            0 -> SampleFragment.newInstance(R.color.colorPrimary, "Sample Page 1")
            1 -> SampleFragment.newInstance(R.color.colorAccent, "Sample Page 2")
            2 -> SampleFragment.newInstance(R.color.colorPrimaryDark, "Sample Page 3")
            else -> SampleFragment.newInstance(R.color.colorPrimary, "Sample Page 1")
        }
}