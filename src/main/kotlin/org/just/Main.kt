package org.just

fun main() {

    while (true) {
        println("Введите количество секунд, когда вы были в последний раз на сайте.")
        var input = Integer.parseInt(readLine());
        println(time(input))
    }
}

fun time(input: Int): String {
    return when (input) {
        in 1..60 -> "только что"
        in 61..60 * 60 -> minutes(input) + " назад"
        in 60 * 60 + 1..24 * 60 * 60 -> " " + hours(input) + " назад"
        in 24 * 60 * 60 + 1..24 * 60 * 60 * 2 -> "сегодня"
        in 24 * 60 * 60 * 2 + 1..24 * 60 * 60 * 3 -> "вчера"
        in 24 * 60 * 60 * 3 + 1..24 * 60 * 60 * 360 -> "давно"
        else -> "Вас тут вас тут никто не помнит!!!"
    }
}

fun minutes(input: Int): String {
    return when {
        input / 60 == 1 || input / 60 > 20 && (input / 60 % 10 == 1) -> " " + input / 60 + " минуту"
        input / 60 == 2 || input / 60 == 3 || input / 60 == 4 -> " " + input / 60 + " минуты"
        input / 60 > 20 && (input / 60 % 10 == 2 || input / 60 % 10 == 3 || input / 60 % 10 == 4) -> " " + input / 60 + " минуты"
        else -> " " + input / 60 + " минут"
    }
}

fun hours(input: Int): String {
    return when {
        input / (60 * 60) == 1 || input / (60 * 60) > 20 && (input / (60 * 60) % 10 == 1) -> " " + input / (60 * 60) + " час"
        input / (60 * 60) == 2 || input / (60 * 60) == 3 || input / (60 * 60) == 4 -> " " + input / (60 * 60) + " часа"
        input / (60 * 60) > 20 && (input / (60 * 60) % 10 == 2 || input / (60 * 60) % 10 == 3 || input / (60 * 60) % 10 == 4) -> " " + input / (60 * 60) + " часа"
        else -> " " + input / (60 * 60) + " часов"
    }
}


