package me.winter.grammar.japanese

/**
 * Undocumented :(
 *
 * Created by Alexander Winter on 2017-05-26.
 */
class TopicDeclaration(
        val subject: Subject,
        val type: TopicDeclarationType = TopicDeclarationType.INITIATIVE) {

    override fun toString(): String {
        return subject.toString() + type.toString()
    }
}