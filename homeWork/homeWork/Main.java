package ru.geekbrains.qa.java2.lesson1.homeWork;

import ru.geekbrains.qa.java2.lesson1.homeWork.obstacleCourse.*;
import ru.geekbrains.qa.java2.lesson1.homeWork.team.Team;
import ru.geekbrains.qa.java2.lesson1.homeWork.team.TeamMember;

public class Main {

    public static void main(String[] args) {
        Team dreamTeam = new Team("TradeguildTeam",
                new TeamMember("Cinnabone", 4,6,5,7),
                new TeamMember("Zara", 5,5,4,6),
                new TeamMember("Kari", 6,7,7,5),
                new TeamMember("GloryJeans" ,7,3,3,1));

        Course course = new Course(new Cross(5), new Swimming(5), new Rockclimbing(6), new Jumping(4));
        course.doIt(dreamTeam);

    }
}
