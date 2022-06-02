package ru.geekbrains.qa.java2.lesson1.homeWork.obstacleCourse;


import ru.geekbrains.qa.java2.lesson1.homeWork.team.TeamMember;

public class Jumping extends Obstacle {

    public Jumping(int difficulty) {
        super(difficulty);
    }

    @Override
    public void goChallenge(TeamMember member) {
        member.jump(super.getDifficulty());
    }
}
