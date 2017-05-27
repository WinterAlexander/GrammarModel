package me.winter.grammar.japanese

import me.winter.grammar.japanese.exception.InvalidSubjectListException

/**
 * Undocumented :(
 *
 * Created by Alexander Winter on 2017-05-26.
 */
class SubjectListing(val type: SubjectJunctionType,
                     val politeness: PolitenessLevel,
                     vararg val subjects: Subject) : Subject
{
    constructor(type: SubjectJunctionType, vararg subjects: Noun)
            : this(type, PolitenessLevel.NEUTRAL, *subjects)

    init {
        if(subjects.size < 2)
            throw InvalidSubjectListException()
    }

    override fun toString(): String {
        return subjects.joinToString(type.toString(politeness))
    }

    override fun containsQuestionWord(): Boolean {
        return subjects.any(Subject::containsQuestionWord)
    }
}

