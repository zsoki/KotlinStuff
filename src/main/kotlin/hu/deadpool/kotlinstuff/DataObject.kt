package hu.deadpool.kotlinstuff

import java.util.concurrent.ThreadLocalRandom


data class User(
        @JvmField val userName: String,
        var sessionToken: String,
        private var highScore: Int) {

    fun updateHighScore(score: Int) {
        highScore = maxOf(highScore, score)
    }

}

abstract class DataRepository {

    fun isOnline() = ThreadLocalRandom.current().nextBoolean()

}


object Singleton : DataRepository() {

    init {
        // static { }
        // Code you want to run at app initialization
    }

    fun getRepository(): String =
            if (isOnline()) {
                "apiDataSource"
            } else {
                "cacheDataSource"
            }

    fun funWithData(user: User) : Any? {

        val (_, sessionToken) = user
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

