package carlos.jimenezp.vasscompany.mykmm

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform