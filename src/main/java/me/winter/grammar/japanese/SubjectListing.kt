package me.winter.grammar.japanese

/**
 * Undocumented :(
 * <p>
 * Created by Alexander Winter on 2017-05-26.
 */
class SubjectListing(val type: SubjectJunctionType, vararg val nouns: Noun) : Subject
{
    override fun toString(): String {
        if(nouns.isEmpty())
            return ""

        return nouns.joinToString(type.toString())
    }

    override fun containsQuestionWord(): Boolean
    {
        return nouns.any(Noun::containsQuestionWord)
    }
}