package com.sananismayilov.task4.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.sananismayilov.task4.R
import com.sananismayilov.task4.databinding.FragmentPageABinding
import com.sananismayilov.task4.databinding.FragmentPageBBinding
import com.sananismayilov.task4.util.Util.getFragments


class PageB : Fragment() {
lateinit var binding : FragmentPageBBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPageBBinding.inflate(inflater, container, false)

        binding.buttontoY.setOnClickListener{
            Navigation.getFragments(binding.buttontoY,R.id.actionBtoY)}
        return binding.root

    }


}