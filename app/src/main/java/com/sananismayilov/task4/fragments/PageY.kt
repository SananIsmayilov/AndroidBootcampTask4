package com.sananismayilov.task4.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.navigation.Navigation
import com.sananismayilov.task4.R
import com.sananismayilov.task4.databinding.ActivityMainBinding
import com.sananismayilov.task4.databinding.FragmentPageXBinding
import com.sananismayilov.task4.databinding.FragmentPageYBinding
import com.sananismayilov.task4.util.Util.getFragments


class PageY : Fragment() {
 lateinit var binding: FragmentPageYBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPageYBinding.inflate(inflater,container,false)
        val backpress = object : OnBackPressedCallback(true){
            override fun handleOnBackPressed() {
                isEnabled = false
                Navigation.getFragments(binding.root,R.id.actionYtoMain)
            }

        }

        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner,backpress)


        return binding.root
    }


}