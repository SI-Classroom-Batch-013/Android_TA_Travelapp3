package de.syntax_institut.android_ta_travelapp.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import de.syntax_institut.android_ta_travelapp.R
import de.syntax_institut.android_ta_travelapp.databinding.FragmentDetailBinding


private lateinit var binding: FragmentDetailBinding
private var cityTitleID = 0
private var cityImageID = 0

/**
 * A simple [Fragment] subclass.
 * Use the [DetailFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class DetailFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            cityTitleID = it.getInt("titleId")
            cityImageID = it.getInt("imageId")
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_detail, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.detailTitleTv.text = getString(cityTitleID)
        binding.screenImageView.setImageResource(cityImageID)
        binding.backToHomeButton.setOnClickListener {
            val navController = this.findNavController()
            navController.navigate(DetailFragmentDirections.actionDetailFragmentToHomeFragment(

            ))
        }
    }
}