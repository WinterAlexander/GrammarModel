package me.winter.grammar.japanese

/**
 * Undocumented :(
 * <p>
 * Created by Alexander Winter on 2017-05-26.
 */
enum class Demonstrative(value: String, question: Boolean = false)
{
    KO("こ"),
    SO("そ"),
    A("あ"),
    DO("ど", true)
    ;
    private val value = value
    public val question = question

    override fun toString(): String {
        return value
    }
}