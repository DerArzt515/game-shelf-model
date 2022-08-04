import kotlinx.serialization.Serializable

@Serializable
data class GameCreationRequest(
    val title: String,
    val playerCount: MinMax,
    val playTime: MinMax,
    val publishers: List<String>,
    val designers: List<String>
)

@Serializable
data class Game(
    val id: Int,
    val title: String,
    val playerCount: MinMax,
    val playTime: MinMax,
    val publishers: List<Publisher>,
    val designers: List<Designer>
)

@Serializable
data class Publisher(
    val id: Int,
    val name: String
)

@Serializable
data class Designer(
    val id: Int,
    val name: String
)

@Serializable
data class MinMax(
    val min: Int,
    val max: Int
)


