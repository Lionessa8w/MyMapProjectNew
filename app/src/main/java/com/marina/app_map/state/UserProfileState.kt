package com.marina.app_map.state

import ru.marina_w.my_map.UserModel

sealed class UserProfileState {
    data class Error(val message: String) : UserProfileState()
    data class Success(val userModel: UserModel) : UserProfileState()
    class Loading : UserProfileState()
}