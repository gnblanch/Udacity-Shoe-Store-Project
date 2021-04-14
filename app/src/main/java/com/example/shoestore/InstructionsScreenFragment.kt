package com.example.shoestore

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import com.example.shoestore.databinding.WelcomeScreenFragmentBinding
import androidx.navigation.fragment.NavHostFragment.findNavController
import com.example.shoestore.databinding.InstructionsScreenFragmentBinding


class InstructionsScreenFragment : Fragment() {

    private lateinit var viewModel: InstructionsScreenViewModel
    private lateinit var binding: InstructionsScreenFragmentBinding

    companion object {
        fun newInstance() = InstructionsScreenFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.welcome_screen_fragment,
            container,
            false
        )
        viewModel = ViewModelProvider(this).get(InstructionsScreenViewModel::class.java)

        binding.instructionsScreenViewModel = viewModel
        binding.setLifecycleOwner (this)

        /* Sets up event listening to navigate the player when the game is finished

        viewModel.eventGameFinish.observe(viewLifecycleOwner, Observer { isFinished ->
            if (isFinished) {
                val currentScore = viewModel.score.value ?: 0
                val action = GameFragmentDirections.actionGameToScore(currentScore)
                findNavController(this).navigate(action)
                viewModel.onGameFinishComplete()
            }
        })
         */

        return binding.root

    }
}