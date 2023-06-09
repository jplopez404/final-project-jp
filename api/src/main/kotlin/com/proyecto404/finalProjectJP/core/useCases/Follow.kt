package com.proyecto404.finalProjectJP.core.useCases

import com.proyecto404.finalProjectJP.core.domain.Relationship
import com.proyecto404.finalProjectJP.core.domain.repositories.Relationships
import com.proyecto404.finalProjectJP.core.domain.repositories.Users
import com.proyecto404.finalProjectJP.core.domain.services.AuthService
import com.proyecto404.finalProjectJP.core.domain.services.SessionToken

class Follow(private val relationships: Relationships, private val users: Users, private val authService: AuthService) {
    fun exec(request: Request) {
        val requestUser = users.get(request.follower)
        val followUser = users.get(request.followee)
        val token = request.token
        authService.validateToken(token, requestUser)
        relationships.add(Relationship(requestUser, followUser))
    }

    data class Request(val follower: String, val followee: String, val token: SessionToken)
}
