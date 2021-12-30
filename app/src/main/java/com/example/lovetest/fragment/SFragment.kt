package com.example.lovetest.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.lovetest.R
import kotlinx.android.synthetic.main.fragment_q.*
import kotlinx.android.synthetic.main.fragment_s.*

class SFragment : Fragment(), View.OnClickListener {

    lateinit var navController : NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_s, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = Navigation.findNavController(view)

        btn_back.setOnClickListener(this)
        button.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
    }

    override fun onClick(v: View?) {

        when(v?.id) {
            R.id.button -> {navigateWithIndex(1)}
            R.id.button2 -> {navigateWithIndex(2)}
            R.id.button3 -> {navigateWithIndex(3)}
            R.id.button4 -> {navigateWithIndex(4)}
            R.id.btn_back -> {
                navController.popBackStack()
            }
        }
    }
    
    fun navigateWithIndex(index : Int) {
        val bundle = bundleOf("index" to index)
        navController.navigate(R.id.action_SFragment_to_RFragment, bundle)
    }

}