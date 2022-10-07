package com.example.odev4

import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.navigation.Navigation
import com.example.odev4.databinding.FragmentAnaSayfaBinding
import com.google.android.material.snackbar.Snackbar

class AnaSayfaFragment : Fragment() {
    private lateinit var design:FragmentAnaSayfaBinding
    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        design=FragmentAnaSayfaBinding.inflate(inflater, container, false)

        design.anasayfaButtonA.setOnContextClickListener {
            Navigation.findNavController(it).navigate(R.id.action_anaSayfa_to_sayfaA)
        }
        design.anasayfaButtonX.setOnContextClickListener {
            Navigation.findNavController(it).navigate(R.id.action_anaSayfa_to_sayfaX)
        }

        return design.root
    }
}