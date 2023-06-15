package com.main.bluchat.main.presentation.communication

import com.main.bluchat.main.presentation.core.NavigationStrategy
import com.main.bluchat.main.presentation.core.Communication

interface NavigationCommunication {

    interface Observe : Communication.Observe<NavigationStrategy>

    interface Mutate : Communication.Mutate<NavigationStrategy>

    interface Mutable : Observe, Mutate

    class Base : Communication.SingleUi<NavigationStrategy>(), Mutable
}