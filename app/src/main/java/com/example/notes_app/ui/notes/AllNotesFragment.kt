package com.example.notes_app.ui.notes

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.notes_app.R
import com.example.notes_app.databinding.FragmentAllNotesBinding
import com.example.notes_app.databinding.FragmentCreateAccountBinding

class AllNotesFragment : Fragment(R.layout.fragment_all_notes) {
    private var _binding : FragmentAllNotesBinding?= null
    val binding: FragmentAllNotesBinding?
        get() = _binding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentAllNotesBinding.bind(view)
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}