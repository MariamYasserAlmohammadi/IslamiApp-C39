package com.route.week4_islami.ui.home.tasbeh

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.fragment.app.Fragment
import com.route.week4_islami.R
import com.route.week4_islami.databinding.FragmentTasbehBinding

class TasbehFragment :Fragment() {
    lateinit var viewBinding: FragmentTasbehBinding
     var tasbehCount :Int = 0

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewBinding = FragmentTasbehBinding.inflate(inflater,container,false)
        return  viewBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewBinding.btnTasbehCount.setOnClickListener {
             tasbehCount = tasbehCount +1
            viewBinding.tvTasbehCount.text = tasbehCount.toString()


            // assigning that animation to
            // the image and start animation
            viewBinding.imvSebhaBody.startAnimation(AnimationUtils.loadAnimation(activity ,R.anim.rotate_clockwise))
            if (tasbehCount>33&& tasbehCount<=66){
                viewBinding.btnTasbehCount.setText("الحمد لله")
            }else if(tasbehCount>66 && tasbehCount <=99){
                viewBinding.btnTasbehCount.setText("الله اكبر")
            }
            if (tasbehCount>99){
                tasbehCount =0
            }

        }
    }
}