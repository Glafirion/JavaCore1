package ru.geekbrains.qa.java2.lesson1.homeWork.team;


import ru.geekbrains.qa.java2.lesson1.homeWork.Status;

public class TeamMember {
    private Status status = Status.NoPassedDistance;
    private final String name;
    private final int crosspower;
    private final int jumpingpower;
    private final int rockclimbingpower;
    private final int swimmingpower;

    public TeamMember(String name, int crosspower, int jumpingpower, int rockclimbingpower, int swimmingpower) {
        this.name = name;
        this.crosspower = crosspower;
        this.jumpingpower = jumpingpower;
        this.rockclimbingpower = rockclimbingpower;
        this.swimmingpower = swimmingpower;
    }

    public Status getStatus() {
        return status;
    }

    public String getName() {
        return name;
    }

    public void rockclimbing(int courseDifficulty) {
        if (checkrcPower(courseDifficulty)) {
            changeStatus(Status.PassedDistance," REAL cliffhanger!");
        }
        else{
            changeStatus(Status.NoPassedDistance," fall in the void");
        }
    }

    public void jump(int courseDifficulty){
        if (checkjumpPower(courseDifficulty)) {
            changeStatus(Status.PassedDistance," jump like a kangoo!");
        }
        else{
            changeStatus(Status.NoPassedDistance," can't do it. Sow long loser!");
        }
    }

    public void run(int courseDifficulty) {
        if (checkcrossPower(courseDifficulty)) {
            changeStatus(Status.PassedDistance," was like a lighting!");
        }
        else{
            changeStatus(Status.NoPassedDistance," was like a big slow turtle!");
        }
    }

    public void swim(int courseDifficulty) {
        if (checkswimPower(courseDifficulty)) {
            changeStatus(Status.PassedDistance," wow! Its really human? More like fish!");
        }
        else{
            changeStatus(Status.NoPassedDistance," swiming like AXE!");
        }
    }

    private boolean checkcrossPower(int courseDifficulty) {
        return crosspower > courseDifficulty || crosspower == courseDifficulty;}
    private boolean checkjumpPower(int courseDifficulty) {
        return jumpingpower > courseDifficulty || jumpingpower == courseDifficulty;}
    private boolean checkrcPower(int courseDifficulty) {
        return !(rockclimbingpower > courseDifficulty || rockclimbingpower == courseDifficulty);}
    private boolean checkswimPower(int courseDifficulty) {
        return swimmingpower > courseDifficulty || swimmingpower == courseDifficulty;}



    private void changeStatus(Status newStatus, String message) {
        status = newStatus;
        System.out.println(name + message);
    }

}
