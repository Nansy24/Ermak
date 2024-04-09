package com.anasteisiamarionkina.ermak

import android.app.AlertDialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.anasteisiamarionkina.ermak.databinding.FragmentHomeBinding
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase


class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.buttonSendHome.setOnClickListener {
            val email = binding.editTextEmailHome.text.toString()
            val phone = binding.editTextPhoneHome.text.toString()
            val database = Firebase.database
            val myRef = database.getReference(phone)
            myRef.setValue("Email: $email, Номер телефона: $phone")
            binding.editTextEmailHome.text.clear()
            binding.editTextPhoneHome.text.clear()
            AlertDialog.Builder(this.context)
                .setMessage("Ваши данные успешно отправлены, " +
                        "менеджер свяжется с вами в течение дня.")
                .setPositiveButton("Ок") { dialog, _ ->
                    dialog.cancel()
                }.show()



        }
    }

}