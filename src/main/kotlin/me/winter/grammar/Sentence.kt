package me.winter.grammar

/**
 * Undocumented :(
 *
 * Created by Alexander Winter on 2017-05-26.
 */
interface Sentence
{
    override fun toString(): String

    fun isValid(): Boolean

    fun getErrors(): List<String>
}