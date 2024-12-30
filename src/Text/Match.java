package Text;

import java.util.*;

public class Match {

    public Team team1;
    public Team team2;
    public Team form1;
    public Team form2;
    int team1Score;
    int team2Score;
    public ArrayList<QueueTeam> queueTeams = new ArrayList<>();

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

    // Listeyi bir pozisyon kaydırma
    public void rotateTeams(TeamList teamList) {
        if (teamList.head == null || teamList.head.next == null) {
            return; // Liste boş veya tek elemanlıysa döndürme işlemi gereksiz
        }

        Node prev = null;
        Node current = teamList.head;

        // Listenin sonuna kadar ilerle
        while (current.next != null) {
            prev = current;
            current = current.next;
        }

        // Son düğümü başa taşı
        if (prev != null) {
            prev.next = null; // Son düğümün bağlantısını kopar
        }
        current.next = teamList.head; // Son düğümü listenin başına bağla
        teamList.head = current; // Yeni baş düğümü ayarla
    }

    // Maç simülasyonu: Rastgele gol sayısı
    public void simulate() {
        team1Score = (int) (Math.random() * 4);
        team2Score = (int) (Math.random() * 4);

        // Skorları güncelle
        team1.goalDifference = team2Score;
        team2.goalDifference = team1Score;

        // Puanları güncelle
        if (team1Score > team2Score) {
            team1.totalPoints += 3;
            team1.form = "W - ";
            team2.form = "L - ";

        } else if (team2Score > team1Score) {
            team2.totalPoints += 3;
            team1.form = "L - ";
            team2.form = "W - ";
        } else {
            team1.totalPoints += 1;
            team2.totalPoints += 1;
            team1.form = "D - ";
            team2.form = "D - ";
        }
        // Gol sayılarını guncelle
        team1.setGoalDifference(team1Score, team2Score);
        team2.setGoalDifference(team2Score, team1Score);
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
