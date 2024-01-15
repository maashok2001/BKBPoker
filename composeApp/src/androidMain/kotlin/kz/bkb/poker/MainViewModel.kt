package kz.bkb.poker

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class MainViewModel: ViewModel(), MainController {

    val state: StateFlow<SomeState> = MutableStateFlow(
        SomeState(
            playersList = listOf("Aoaoa")
        )
    )

    override fun onAddPlayerClicked() {

    }

    override fun onDeletePlayerClicked() {
        TODO("Not yet implemented")
    }
}