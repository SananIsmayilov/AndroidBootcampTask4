package com.sananismayilov.task4.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.sananismayilov.task4.R
import com.sananismayilov.task4.databinding.FragmentPageABinding
import com.sananismayilov.task4.util.Util.getFragments

class PageA : Fragment() {
    lateinit var binding : FragmentPageABinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPageABinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        binding.buttontoB.setOnClickListener{
        Navigation.getFragments(binding.buttontoB,R.id.actionAtoB)}
        return binding.root
    }


}