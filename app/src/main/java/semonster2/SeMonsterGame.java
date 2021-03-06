package semonster2;

import java.util.Scanner;

public class SeMonsterGame {
  // 初期設定
  Monster monster;
  Monster my_monster;
  Player player;
  Scanner scanner = new Scanner(System.in);

  // 名前追加メソッド
  public void addPlayer(String playerName) {
    // Scanner scan = new Scanner(System.in); //
    Player add_player = new Player(playerName);
    this.player = add_player;
  }

  // 自身のモンスターdrawメソッド
  public void draw(String playerName) {
    this.player.showDeck();
  }

  public void battle(Monster monster) {
    this.monster = monster;
    int num;

    System.out.println("\n----------------------------------------------");
    // 以下対戦処理
    System.out.println(this.monster.showMonster());
    // 敵のHPがゼロになるまで繰り返す
    while (true) {
      this.player.showDeck();
      System.out.println("\n--Summon Monster in deck(1-5)--");
      // num = scanner.nextInt();
      num = 0;// 標準入力ができないため変更しました
      my_monster = player.deck.get(num);
      this.monster.HP -= my_monster.attack;
      System.out.printf("%sで攻撃 %dのダメージ\n", my_monster.name, this.monster.attack);

      if (monster.HP <= 0) {
        System.out.println("勝ち");
        player.levelUp();
      }

      my_monster.HP -= this.monster.attack;
      System.out.printf("%sに%dのダメージ\n", this.monster.name, my_monster.attack);

      // 自分の手持ちがのHPがゼロになったら負け
      if (my_monster.HP <= 0) {
        System.out.println("負け");
        break;
      }

    }
  }
}
