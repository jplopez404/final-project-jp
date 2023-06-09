@file:Suppress("PrivatePropertyName")

package com.proyecto404.finalProjectJP.core.domain.services

import com.proyecto404.finalProjectJP.core.domain.User
import com.proyecto404.finalProjectJP.core.domain.exceptions.InvalidLoginCredentialsError
import com.proyecto404.finalProjectJP.core.domain.exceptions.InvalidPasswordError
import com.proyecto404.finalProjectJP.core.domain.exceptions.InvalidUsernameError
import com.proyecto404.finalProjectJP.core.domain.exceptions.UserNotAuthenticatedError
import com.proyecto404.finalProjectJP.core.useCases.Login.*
import org.eclipse.jetty.util.security.Password

class AuthService {
    private val ARGS_MIN_LENGTH = 4

    fun checkCredentials(name: String, password: String) {
        if (name.isEmpty()) throw InvalidUsernameError()
        if (password.isEmpty()) throw InvalidPasswordError()
        if (name.first().toString() != "@") throw InvalidUsernameError()
        if (name.length < ARGS_MIN_LENGTH) throw InvalidUsernameError()
        if (password.length < ARGS_MIN_LENGTH) throw InvalidPasswordError()
    }

    fun generateSessionToken(user: User) = SessionToken(user.name.reversed())

    fun isValidCredentialRequest(request: Request, user: User): Boolean {
        if ( request.userName != user.name || request.password != user.password ) throw InvalidLoginCredentialsError()
        else return true
    }

    fun validateToken(token: SessionToken, user: User): Boolean {
        if (token != user.token()) throw UserNotAuthenticatedError()
        else return true
    }
}
