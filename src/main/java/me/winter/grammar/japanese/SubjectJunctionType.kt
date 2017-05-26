package me.winter.grammar.japanese

/**
 * Undocumented :(
 *
 * Created by Alexander Winter on 2017-05-26.
 */
enum class SubjectJunctionType(val value: String)
{
    ADD("と"),
    OR("か"),
    VAGUE_AND("や") {
        override fun toString(politeness: PolitenessLevel): String
        {
            if(politeness == PolitenessLevel.DIRECT)
                return "とか"
            return value
        }
    },

    ;

    open fun toString(politeness: PolitenessLevel): String
    {
        return value
    }

    override fun toString(): String {
        return toString(PolitenessLevel.NEUTRAL)
    }
}