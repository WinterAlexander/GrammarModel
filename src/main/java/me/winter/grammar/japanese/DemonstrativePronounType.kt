package me.winter.grammar.japanese

/**
 * Undocumented :(
 * <p>
 * Created by Alexander Winter on 2017-05-26.
 */
enum class DemonstrativePronounType(private val suffix: String) {
    THING("れ"),
    LOCATION("お"),
    DIRECTION("ちら"),
    ;

    override fun toString(): String {
        return suffix
    }
}