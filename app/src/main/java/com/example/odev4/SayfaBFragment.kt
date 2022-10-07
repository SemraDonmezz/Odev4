package com.example.odev4

import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.navigation.Navigation
import com.example.odev4.databinding.FragmentSayfaBBinding

class SayfaBFragment : Fragment() {
    private lateinit var design:FragmentSayfaBBinding
    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        design=FragmentSayfaBBinding.inflate(inflater, container, false)
        design.sayfaBButton.setOnContextClickListener{
            Navigation.findNavController(it).navigate(R.id.action_sayfaB_to_sayfaY)
        }
        return design.root
    }
}