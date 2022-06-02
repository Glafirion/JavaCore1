package ru.geekbrains.qa.java2.lesson1.homeWork.team;


import ru.geekbrains.qa.java2.lesson1.homeWork.Status;

public class Team {
    private TeamMember[] members;
    private final String name;

    public Team(String name, TeamMember... members) {
        this.members = members;
        this.name = name;
    }

    public TeamMember[] getMembers() {
        return members;
    }

    public void showResults() {
        printDivider();
        System.out.println("Obstacle course overcame: " + name);
        for (TeamMember member: members) {
            if (member.getStatus() == Status.NoPassedDistance) {
                showResultMemberNoPassed(member);
            }
            else {
                showResultMemberPassed(member);
            }
        }
        printDivider();
    }

    private void showResultMemberNoPassed(TeamMember member) {
        printDivider();
        System.out.println(member.getName() + " haven't enough strength");
    }

    private void showResultMemberPassed(TeamMember member) {
        printDivider();
        System.out.println(member.getName() + " Succefully finish exercise");
    }

    private void printDivider() {
        System.out.println("-----------------------------------------------------------");
    }
}
