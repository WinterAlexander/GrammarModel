package me.winter.grammar.japanese

/**
 * Undocumented :(
 *
 * Created by Alexander Winter on 2017-05-26.
 */
interface Topic
{
    override fun toString(): String

    fun containsQuestionWord(): Boolean
}
