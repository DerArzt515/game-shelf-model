import kotlinx.serialization.Serializable

@Serializable
data class Game(
    val id: Int?,
    val title: String,
    val playerCount: MinMax,
    val playTime: MinMax,
    val publishers: List<String>,
    val designers: List<String>
)

@Serializable
data class MinMax(
    val min: Int,
    val max: Int
)


