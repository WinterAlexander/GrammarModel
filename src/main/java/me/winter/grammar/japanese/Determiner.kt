package me.winter.grammar.japanese

/**
 * Undocumented :(
 * <p>
 * Created by Alexander Winter on 2017-05-26.
 */
class Determiner(private val dem: Demonstrative)
{
    override fun toString(): String {
        return dem.toString() + "の"
    }

    fun isQuestionWord(): Boolean
    {
        return dem.question
    }
}