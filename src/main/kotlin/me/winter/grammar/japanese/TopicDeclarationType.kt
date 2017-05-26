package me.winter.grammar.japanese

/**
 * Undocumented :(
 *
 * Created by Alexander Winter on 2017-05-26.
 */
enum class TopicDeclarationType(val value: String)
{
    INITIATIVE("は"),
    ADDITIVE("も")
    ;

    override fun toString(): String {
        return value
    }
}
