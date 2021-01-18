package com.apps65.mvitemplate.presentation.blank

import com.apps65.mvi.BaseView
import com.apps65.mvitemplate.data.ResultCharacter
import com.apps65.mvitemplate.domain.blank.store.BlankStore.DiceState

interface BlankView : BaseView<BlankView.Model, BlankView.Event> {

    data class Model(
        val character: ResultCharacter?,
        val connection: Boolean,
        val diceState: DiceState?
    )

    sealed class Event {
        //object OnResultClick : Event()
        //object RollDice : Event()
        //object SubNavigation : Event()
    }
}
