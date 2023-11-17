package com.example.homework_61

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    var counter = 0
    val counterLV = MutableLiveData<Int>()

    fun inc(){
        counter +=1
        counterLV.value = counter
    }

    fun dec(){
        counter -=1
        counterLV.value = counter
    }
}