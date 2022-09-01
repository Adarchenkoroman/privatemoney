package app.adachenko.privatemoney.screens.root

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentActivity
import app.adachenko.privatemoney.R
import app.adachenko.privatemoney.ViewPagerAdapter
import com.google.android.material.tabs.TabLayoutMediator


class RootFragment : Fragment() {

    private var ctx:Context?=null

    override fun onAttach(context: Context) {
        super.onAttach(context)
        ctx=context
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view=inflater.inflate(R.layout.fragment_root, container, false)
        // Inflate the layout for this fragment
        view.tab_layout.tabIconTint=null


        view.view_pager.adapter=ViewPagerAdapter(ctx as FragmentActivity)

        TabLayoutMediator(view.tab_layout,view.view_pager){

                tab,pos->
            when(pos){
                0->{
                  tab.setIcon(R.drawable.ic_baseline_monetization_on_24)
                }
                1->{
                     tab.setIcon(R.drawable.ic_baseline_attach_money_24)
                }
            }
        }.attach()


        return view
    }


}