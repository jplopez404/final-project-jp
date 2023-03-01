package com.proyecto404.finalProjectJP.console.session

open class SessionState {
    var identity: Session = Anonymous()

    fun authenticate(user: User) {
        this.identity = user
    }

    fun logout() {
        this.identity = Anonymous()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as SessionState

        if (identity != other.identity) return false

        return true
    }

    override fun hashCode(): Int {
        return identity.hashCode()
    }
}
