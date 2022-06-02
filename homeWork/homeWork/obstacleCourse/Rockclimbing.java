package ru.geekbrains.qa.java2.lesson1.homeWork.obstacleCourse;


import ru.geekbrains.qa.java2.lesson1.homeWork.team.TeamMember;

public class Rockclimbing extends Obstacle {
    public Rockclimbing(int difficulty) {
        super(difficulty);
    }

    @Override
    public void goChallenge(TeamMember member) {
        member.rockclimbing(super.getDifficulty());
    }
}
