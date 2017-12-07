package hu.deadpool.kotlinstuff

import java.util.concurrent.ThreadLocalRandom

// TODO data class example
data class User(
        @JvmField val userName: String,
        var sessionToken: String,
        private var highScore: Int) {

    fun updateHighScore(score: Int) {
        highScore = maxOf(highScore, score)
    }

}


abstract class Repository {

    abstract fun getRepository(): String

    fun isOnline() = ThreadLocalRandom.current().nextBoolean()

}


object UserRepository : Repository() {

    init {
        // init inside an object: same as static { } in Java
        // Code you want to run at app initialization
    }

    override fun getRepository(): String =
            if (isOnline()) {
                "apiDataSource"
            } else {
                "cacheDataSource"
            }

    fun funWithData(user: User): Any? {

        val (userName, sessionToken) = user
        val newUser = User("Kati", sessionToken, 0)

        val friendZone = createFriendZone(user, newUser)

        friendZone.boy.updateHighScore(9999)
        friendZone.girl.updateHighScore(10000)

        return friendZone
    }

    private fun createFriendZone(user1: User, user2: User) =
            object {

                val boy = user1
                val girl = user2

                override fun toString(): String {
                    return "Boy: ${boy.userName}, Girl: ${girl.userName}"
                }
            }
}

