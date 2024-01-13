fun main() {
        val seconds = 0
        agoToText(seconds)
}

fun agoToText(seconds: Int) = when(seconds) {
        in 0..60 -> println("был(а) только что")
        in 61..60 * 60 -> println("был(а) ${seconds / 60} ${endOfMinutes(seconds / 60)} назад")
        in 60 * 60 + 1..24 * 60 * 60 -> println("был(а) ${seconds / 60 / 60} ${endOfHours(seconds / 60 / 60)} назад")
        in 24 * 60 * 60 + 1..48 * 60 * 60 -> println("был(а) вчера")
        in 48 * 60 * 60 + 1..72 * 60 * 60 -> println("был(а) позавчера")
        else -> println("был(а) давно")
}

fun endOfMinutes(minutes: Int) = when {
        minutes in 11..13 -> "минут"
        minutes % 10 == 1 -> "минуту"
        minutes % 10 in 2..3 -> "минуты"
        else -> "минут"
}

fun endOfHours(hours: Int) = when {
        hours in 11..14 -> "часов"
        hours % 10 == 1 -> "час"
        hours % 10 in 2..4 -> "часа"
        else -> "часов"
}