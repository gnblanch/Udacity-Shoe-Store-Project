package com.example.shoestore

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.shoestore.databinding.LoginScreenFragmentBinding
import androidx.databinding.DataBindingUtil


class LoginScreenFragment : Fragment() {

    companion object {
        fun newInstance() = LoginScreenFragment()
    }

    private lateinit var viewModel: LoginScreenViewModel
    private lateinit var binding: LoginScreenFragmentBinding


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.login_screen_fragment,
            container,
            false
        )
        viewModel = ViewModelProvider(this).get(LoginScreenViewModel::class.java)

        binding.loginScreenViewModel = viewModel

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