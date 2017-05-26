package me.winter.grammar.japanese

/**
 * Undocumented :(
 *
 * Created by Alexander Winter on 2017-05-26.
 */
class Adjective(private val value: String, private val type: AdjectiveType) : Object
{
    override fun toString(): String {
        return value
    }

    override fun containsQuestionWord(): Boolean {
        return false
    }
}