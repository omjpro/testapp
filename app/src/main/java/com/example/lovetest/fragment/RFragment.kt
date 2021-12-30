package com.example.lovetest.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.lovetest.R
import kotlinx.android.synthetic.main.fragment_q.*
import kotlinx.android.synthetic.main.fragment_r.*

class RFragment : Fragment() {

    var option = -1
    
    lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        option = arguments?.getInt("index")?:-1

        return inflater.inflate(R.layout.fragment_r, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        
        navController = Navigation.findNavController(view)
        
        setResult(option)
        
        btn_home.setOnClickListener { 
            navController.navigate(R.id.action_RFragment_to_mainFragment)
        }
    }
    
    fun setResult(option : Int) {
        
        when(option) {
            1 -> {
                tv_main.text = "Result 1"
                tv_sub.text = "Description 1"
            }
            2 -> {
                tv_main.text = "Result 2"
                tv_sub.text = "Description 2"
            }
            3 -> {
                tv_main.text = "Result 3"
                tv_sub.text = "Description 3"
            }
            4 -> {
                tv_main.text = "Result 4"
                tv_sub.text = "Description 4"
            }
        }
        
    }
    
}