package me.winter.grammar.japanese

/**
 * Undocumented :(
 * <p>
 * Created by Alexander Winter on 2017-05-26.
 */
class Noun(value: String) : Subject {
    private val value = value

    override fun toString(): String {
        return value
    }

    override fun containsQuestionWord(): Boolean {
        return false
    }
}