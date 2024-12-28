package Text;

import java.util.*;

public class Match {

    Team team1;
    Team team2;
    int team1Score;
    int team2Score;

    public Match(Team team1, Team team2) {
        this.team1 = team1;
        this.team2 = team2;
        simulate();
    }

    public Match() {
    }

    public void createFixtures(TeamList teamList, QueueTeam matchQueue, Hash hashTable) {
        int totalTeams = teamList.size();

        // Takımları bir listeye aktar
        ArrayList<Team> teams = new ArrayList<>();
        Node current = teamList.getHead();
        while (current != null) {
            teams.add(current.team);
            current = current.next;
        }

        // Haftalık eşleşmeler
        for (int i = 0; i < totalTeams / 2; i++) {
            Team team1 = teams.get(i);
            Team team2 = teams.get(totalTeams - 1 - i);
            matchQueue.enqueue(new Match(team1, team2));
            hashTable.ekle(i, teamList);
            matchQueue.clear();
        }

        // Bu hafta için eşleşmeleri tamamladıktan sonra, takımların sırasını kaydır
        rotateTeams(teams);
    }

    // Listeyi bir pozisyon kaydırma
    public static void rotateTeams(ArrayList<Team> teams) {
        if (teams == null || teams.size() <= 1) {
            return; // Boş veya tek elemanlı liste için işlem yapma
        }

        // İlk takımı alıyoruz
        Team firstTeam = teams.get(0);

        // Takımları bir pozisyon kaydırıyoruz
        for (int i = 0; i < teams.size() - 1; i++) {
            teams.set(i, teams.get(i + 1)); // Her takımı bir pozisyon sola kaydırıyoruz
        }

        // İlk takımı sona ekliyoruz
        teams.set(teams.size() - 1, firstTeam);
    }

    // Maç simülasyonu: Rastgele gol sayısı
    public void simulate() {
        team1Score = (int) (Math.random() * 3);  // 0-5 gol arası
        team2Score = (int) (Math.random() * 3);  // 0-5 gol arası

        // Skorları güncelle
        team1.goalDifference = team1Score - team2Score;
        team2.goalDifference = team2Score - team1Score;

        // Puanları güncelle
        if (team1Score > team2Score) {
            team1.totalPoints += 3;

        } else if (team2Score > team1Score) {
            team2.totalPoints += 3;
        } else {
            team1.totalPoints += 1;
            team2.totalPoints += 1;
        }
        // Gol sayılarını guncelle
        team1.setGoalDifference(team1Score);
        team2.setGoalDifference(team2Score);

    }

}
