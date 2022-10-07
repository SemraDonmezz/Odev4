package com.example.odev4

import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.navigation.Navigation
import com.example.odev4.databinding.FragmentSayfaABinding


class SayfaAFragment : Fragment() {
    private lateinit var design:FragmentSayfaABinding
    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        design=FragmentSayfaABinding.inflate(inflater, container, false)

        design.sayfaAButton.setOnContextClickListener {
            Navigation.findNavController(it).navigate(R.id.action_sayfaA_to_sayfaB)
        }
        return design.root
    }
}