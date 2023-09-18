package com.sananismayilov.task4.util

import android.view.View
import androidx.navigation.Navigation

object Util {
    fun Navigation.getFragments(view : View,id : Int){
        Navigation.findNavController(view).navigate(id)
    }
}