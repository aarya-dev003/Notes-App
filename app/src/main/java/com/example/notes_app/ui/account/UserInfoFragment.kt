package com.example.notes_app.ui.account

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.notes_app.R
import com.example.notes_app.databinding.FragmentCreateAccountBinding
import com.example.notes_app.databinding.FragmentUserInfoBinding

class UserInfoFragment : Fragment(R.layout.fragment_user_info) {
    private var _binding : FragmentUserInfoBinding?= null
    val binding: FragmentUserInfoBinding?
        get() = _binding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentUserInfoBinding.bind(view)
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}