package com.proyecto404.finalProjectJP.core.domain.services

import com.proyecto404.finalProjectJP.core.domain.exceptions.EmptyPostError
import com.proyecto404.finalProjectJP.core.domain.exceptions.PostMaxedLengthError
import java.time.Duration
import java.time.LocalDateTime
import java.util.*

class PostService {
    fun isEmpty(content: String): Boolean {
        if (content.isEmpty()) throw EmptyPostError()
        else return true
    }

    fun hasValidLength(content: String): Boolean {
        if (content.length > 140) throw PostMaxedLengthError()
        else return true
    }

    fun calculateTimePassedFromPosting(postDate: LocalDateTime): Duration {
        return Duration.between(postDate, LocalDateTime.now())
    }
}
