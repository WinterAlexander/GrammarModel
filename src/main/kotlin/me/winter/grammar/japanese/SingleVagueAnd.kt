package me.winter.grammar.japanese

/**
 * Undocumented :(
 *
 * Created by Alexander Winter on 2017-05-27.
 */
class SingleVagueAnd(val subject: Subject) : Subject
{
    override fun toString(): String {
        return subject.toString() + "とか"
    }

    override fun containsQuestionWord(): Boolean {
        return subject.containsQuestionWord()
    }
}