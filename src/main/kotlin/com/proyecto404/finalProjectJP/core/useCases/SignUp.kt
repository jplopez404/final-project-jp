package com.proyecto404.finalProjectJP.core.useCases

import com.proyecto404.finalProjectJP.core.domain.User
import com.proyecto404.finalProjectJP.core.domain.Users
import com.proyecto404.finalProjectJP.core.domain.services.AuthService

class SignUp(private val users: Users) {
    private val authService: AuthService = AuthService()
    fun exec(request: Request) {
        val userName = request.userName
        val password = request.password
        authService.checkCredentials(User(userName, password))
        users.add(User(userName, password))
    }

    data class Request(val userName: String, val password: String)
}
