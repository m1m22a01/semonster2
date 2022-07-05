package semonster2;

import java.util.Random;

public class Monster {
  String name;
  int rare;// 1:normal,2:uncommon,3:rare,4:ultra rare
  int HP;
  int attack;
  int mnumber;

  Monster() {
    Random random = new Random();
    this.name = this.summonMonster(random.nextInt(5));
    this.rare = random.nextInt(5);
    this.mnumber = random.nextInt(5);
  }

  Monster(String name, int rare) {
    this.name = name;
    this.rare = rare;
    System.out.println(this.name.toString() + Integer.toString(this.rare));
  }

  String summonMonster(int mnumber) {
    String monsters[] = { "スライム", "サハギン", "ドラゴン", "デュラハン", "シーサーペント" };
    if (mnumber == 0) {
      HP = 10;
      attack = 2;
      return monsters[mnumber];
    } else if (mnumber == 1) {
      HP = 20;
      attack = 4;
      return monsters[mnumber];
    } else if (mnumber == 2) {
      HP = 30;
      attack = 6;
      return monsters[mnumber];
    } else if (mnumber == 3) {
      HP = 40;
      attack = 8;
      return monsters[mnumber];
    } else {
      HP = 50;
      attack = 10;
      return monsters[mnumber];
    }
  }

  String showMonster() {
    return this.summonMonster(rare) + ":レア度[" + rare + "]" + " HP " + HP + " attack " + attack;
  }

  public static void main(String[] args) {
    new Monster();
    System.out.println(new Monster().showMonster());
  }

}
