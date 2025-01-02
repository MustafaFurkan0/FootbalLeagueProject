package Text;

import java.util.*;
import main.*;

public class Match {

    public ArrayList<QueueTeam> queueTeams = new ArrayList<>();
    public Team team1;
    public Team team2;
    public Team form1;
    public Team form2;

    int team1Score;
    int team2Score;

    public Match(Team team1, Team team2) {
        this.team1 = team1;
        this.team2 = team2;
        simulate();
    }

    public Match() {
    }

    public static QueueTeam createFixtures(TeamList teams) {
        int totalTeams = teams.size();
        if (totalTeams % 2 != 0) {
            throw new IllegalArgumentException("Takım sayısı çift olmalıdır.");
        }

        QueueTeam queue = new QueueTeam();

        for (int i = 0; i < totalTeams / 2; i++) {
            Team team1 = teams.get(i);
            Team team2 = teams.get(totalTeams - 1 - i);
            queue.enqueue(new Match(team1, team2));
        }

        return queue;

    }

    public void rotateTeams(TeamList teamList) {
        if (teamList.head == null || teamList.head.next == null) {
            return;
        }

        Node prev = null;
        Node current = teamList.head;

        while (current.next != null) {
            prev = current;
            current = current.next;
        }

        if (prev != null) {
            prev.next = null;
        }
        current.next = teamList.head;
        teamList.head = current;
    }

    public void simulate() {
        team1Score = (int) (Math.random() * 4);
        team2Score = (int) (Math.random() * 4);
        team1.scoreGoal += team1Score;
        team2.scoreGoal += team2Score;
        team1.concededGoal += team2Score;
        team2.concededGoal += team1Score; 
        
        if (team1Score > team2Score) {
            team1.totalPoints += 3;
            team1.form += "W - ";
            team2.form += "L - ";

        } else if (team2Score > team1Score) {
            team2.totalPoints += 3;
            team1.form += "L - ";
            team2.form += "W - ";

        } else {
            team1.totalPoints += 1;
            team2.totalPoints += 1;
            team1.form += "D - ";
            team2.form += "D - ";

        }
        team1.setForm(team1.form);
        team2.setForm(team2.form);
    }

    public int getTeam1Score() {
        return team1Score;
    }

    public void setTeam1Score(int team1Score) {
        this.team1Score = team1Score;
    }

    public int getTeam2Score() {
        return team2Score;
    }

    public void setTeam2Score(int team2Score) {
        this.team2Score = team2Score;
    }

}
