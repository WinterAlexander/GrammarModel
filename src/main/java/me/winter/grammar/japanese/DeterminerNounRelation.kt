package me.winter.grammar.japanese

/**
 * Undocumented :(
 * <p>
 * Created by Alexander Winter on 2017-05-26.
 */
class DeterminerNounRelation(private val det: Determiner, private val noun: Noun) : Subject
{
    override fun toString(): String {
        return det.toString() + noun.toString()
    }

    override fun containsQuestionWord(): Boolean {
        return det.isQuestionWord()
    }
}