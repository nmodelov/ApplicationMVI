package com.apps65.mvitemplate.presentation.blank

import android.annotation.SuppressLint
import android.text.Editable
import android.text.TextWatcher
import androidx.core.view.isVisible
import androidx.core.widget.doAfterTextChanged
import androidx.core.widget.doOnTextChanged
import com.apps65.mvi.binding.BindingView
import com.apps65.mvitemplate.R
import com.apps65.mvitemplate.databinding.FragmentBlankBinding
import com.apps65.mvitemplate.domain.blank.store.BlankStore

class BlankViewImpl(binding: () -> FragmentBlankBinding) :
    BindingView<FragmentBlankBinding, BlankView.Model, BlankView.Event>(binding), BlankView {


    init {
        with(binding()) {

        }
    }

    @SuppressLint("SetTextI18n")
    override fun render(binding: FragmentBlankBinding, model: BlankView.Model) {

        with(binding) {
            progressBar.isVisible = model.connection
            characterFrame.isVisible = !model.connection

            characterName.text = model.character?.properties?.name ?: "Name"
            characterBirthYear.text =
                "Год рождения: ${model.character?.properties?.birthYear ?: "год"}"
            characterDescription.text = model.character?.description ?: "описание"
            characterEyeColor.text = "Цвет глаз: ${model.character?.properties?.eyeColor ?: "цвет"}"
            characterHairColor.text =
                "Цвет волос: ${model.character?.properties?.hairColor ?: "цвет"}"
            characterMass.text = "Вес: ${model.character?.properties?.mass ?: "вес"}"
            characterGender.text = "Пол: ${model.character?.properties?.gender ?: "пол"}"
            characterSkinColor.text =
                "Цвет кожи: ${model.character?.properties?.skinColor ?: "цвет"}"
            characterHeight.text = "Рост: ${model.character?.properties?.height ?: "цвет"}"
        }
    }

    private fun BlankStore.DiceState?.diceStateLabel(): String {
        return when (this) {
            is BlankStore.DiceState.Spinning -> {
                context.getString(R.string.dice_spinning)
            }
            is BlankStore.DiceState.DiceIdle -> {
                value.toString()
            }
            null -> {
                ""
            }
        }
    }
}
