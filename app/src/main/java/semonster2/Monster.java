package semonster2;

import java.util.Random;

public class Monster {
  String name;
  int rare;// 1:normal,2:uncommon,3:rare,4:ultra rare

  Monster() {
    Random random = new Random();
    this.name = this.summonMonster(random.nextInt(5));
    this.rare = random.nextInt(5);
  }

  Monster(String name, int rare) {
    this.name = name;
    this.rare = rare;
    System.out.println(this.name + Integer.toString(this.rare));
  }

  String summonMonster(int mnumber) {
    String monsters[] = { "スライム", "サハギン", "ドラゴン", "デュラハン", "シーサーペント" };
    return monsters[mnumber];
  }

  String showMonster() {
    return this.summonMonster(3) + ":レア度[0]";
  }
}
