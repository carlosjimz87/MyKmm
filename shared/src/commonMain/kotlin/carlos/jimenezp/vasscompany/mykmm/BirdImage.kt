package carlos.jimenezp.vasscompany.mykmm

import kotlinx.serialization.Serializable

@Serializable
data class BirdImage(
    val id: String,
    val author: String,
    val path: String,
)
