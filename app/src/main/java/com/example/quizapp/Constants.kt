package com.example.quizapp

import java.util.*

object Constants {
    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        // Mario Kart questions
        val q1 = Question(
            1, "How many courses are there in Super Mario Kart?",
            R.drawable.ic_super_mario_kart,
            "15", "20", "25", "10",
            2
        )
        val q2 = Question(
            2, "Which character is NOT playable in Super Mario Kart",
            R.drawable.ic_super_mario_kart,
            "Bowser",
            "Donkey Kong",
            "Princess Peach/Toadstool",
            "Koopa Troopa",
            2
        )
        val q3 = Question(
            3, "How many tracks per cup are in Super Mario Kart",
            R.drawable.ic_super_mario_kart,
            "3", "4", "5", "6",
            3
        )
        val q4 = Question(
            4, "Which item did the first Super Mario Kart instruction booklet " +
                    "incorrectly say only appeared in Battle Mode?",
            R.drawable.ic_super_mario_kart,
            "Ghost", "Banana", "Red Shell", "Blue Shell",
            3
        )
        val q5 = Question(
            5, "What game was Super Mario Kart originally conceived as a sequel to?",
            R.drawable.ic_super_mario_kart,
            "Stunt Race FX", "Uniracers", "Excite Bike", "F-Zero",
            4
        )
        val q6 = Question(
            6, "What happens in Super Mario Kart when you complete the Mushroom, Flower, and Star" +
                    " Cups in GP mode?",
            R.drawable.ic_super_mario_kart,
            "The credits roll",
            "Victory Parade",
            "Unlock Special Cup",
            "The game crashes",
            3
        )

        // Chrono Trigger questions
        val q7 = Question(
            7, "In the English version of Chrono Trigger, what does Crono drink at the party in " +
                    "the prehistoric era?",
            R.drawable.ic_chrono_trigger,
            "Alcohol",
            "Soda",
            "Water",
            "Soup",
            4
        )
        val q8 = Question(
            8, "In the Japanese version of Chrono Trigger, what does Crono drink at the party in " +
                    "the prehistoric era?",
            R.drawable.ic_chrono_trigger,
            "Alcohol",
            "Soda",
            "Water",
            "Soup",
            1
        )
        val q9 = Question(
            9, "In the English version of Chrono Trigger, what does Crono drink at the Millenial " +
                    "Faire?",
            R.drawable.ic_chrono_trigger,
            "Alcohol",
            "Soda",
            "Water",
            "Soup",
            2
        )
        val q10 = Question(
            10, "In the Japanese version of Chrono Trigger, what does Crono drink at the Millenial " +
                    "Faire?",
            R.drawable.ic_chrono_trigger,
            "Alcohol",
            "Soda",
            "Water",
            "Soup",
            1
        )
        val q11 = Question(
            11, "In Chrono Trigger, what is Lucca's mother's name?",
            R.drawable.ic_chrono_trigger,
            "Laura",
            "Betty",
            "Lara",
            "Gwen",
            3
        )
        val q12 = Question(
            12, "In Chrono Trigger, how many silver points do you win by beating Gato?",
            R.drawable.ic_chrono_trigger,
            "15",
            "10",
            "12",
            "20",
            1
        )
        val q13 = Question(
            13, "In Chrono Trigger, how many silver points does it cost to challenge Crono's doll?",
            R.drawable.ic_chrono_trigger,
            "25",
            "30",
            "40",
            "20",
            3
        )
        val q14 = Question(
            14, "In Chrono Trigger, in what time period can you fight the sand monster to save " +
                    "the forest?",
            R.drawable.ic_chrono_trigger,
            "600 A.D.",
            "1000 A.D.",
            "2300 A.D.",
            "12,000 B.C.",
            1
        )
        val q15 = Question(
            15, "In Chrono Trigger, what can you ask King Guardia XXI to keep for you?",
            R.drawable.ic_chrono_trigger,
            "Masamune",
            "Dream Stone",
            "Sun Stone",
            "Rainbow Shell",
            4
        )


        questionsList.add(q1)
        questionsList.add(q2)
        questionsList.add(q3)
        questionsList.add(q4)
        questionsList.add(q5)
        questionsList.add(q6)
        questionsList.add(q7)
        questionsList.add(q8)
        questionsList.add(q9)
        questionsList.add(q10)
        questionsList.add(q11)
        questionsList.add(q12)
        questionsList.add(q13)
        questionsList.add(q14)
        questionsList.add(q15)
        questionsList.shuffle()
        return questionsList
    }
}