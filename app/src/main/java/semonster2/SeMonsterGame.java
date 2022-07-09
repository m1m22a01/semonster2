package semonster2;

import java.util.Scanner;

public class SeMonsterGame {
  Player player;
  Monster my_monster;
  Monster monster;
  Scanner scanner = new Scanner(System.in);

  public void addPlayer(String name) {
    player = new Player(name);
  }

  public void draw(String name) {
    player.showDeck();
  }

  public void battle(Monster monster) {
    player.showDeck();
    this.monster = monster;
    int num = scanner.nextInt();
    my_monster = player.deck.get(num);
    while (true) {
      System.out.printf("--Summon Monster %s--\n", my_monster.name);
      this.monster.HP -= my_monster.attack;
      System.out.printf("my monster attack %d\n", my_monster.attack);
      my_monster.HP -= this.monster.attack;
      System.out.printf("monster attack %d\n", my_monster.attack);

      if (my_monster.HP <= 0) {
        System.out.println("lose");
        break;
      } else if (monster.HP <= 0) {
        System.out.println("win");
        player.levelUp();
        break;
      }
    }
  }
}
