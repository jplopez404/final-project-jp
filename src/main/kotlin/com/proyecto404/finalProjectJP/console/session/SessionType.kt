package com.proyecto404.finalProjectJP.console.session

abstract class SessionType {
    abstract fun isAuthenticated(): Boolean

    abstract fun getSession(): UserSession

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        return true
    }

    override fun hashCode(): Int {
        return javaClass.hashCode()
    }
}
