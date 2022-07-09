package semonster2;

import java.util.ArrayList;

public class Player {
  String name; // 名前(朝野)
  ArrayList<Monster> deck = new ArrayList<Monster>(); // デッキ(朝野)
  int level; // レベル(朝野)
  int deckNum = 5; // デッキ内のモンスター数(朝野)

  // コンストラクタ(朝野)
  public Player(String name) {
    this.name = name;
    this.level = 1;
    setDeck();
  }

  // デッキ生成(朝野)
  public void setDeck() {
    for (int i = 0; i < deckNum; i++) {
      // モンスターの生成
      Monster monster = new Monster("スライム", 1);

      // デッキに登録
      this.deck.add(monster);
    }
  }

  // デッキ内容出力(朝野)
  public String showDeck() {
    String showString = "";

    System.out.println(this.name + "のデッキ");

    for (int i = 0; i < deckNum; i++) {
      // テスト用の戻り値
      showString += this.deck.get(i).name + Integer.toString(this.deck.get(i).rare);

      // デッキの内容を一行ずつ出力
      System.out.println(this.deck.get(i).name + this.deck.get(i).rare);
    }

    // テスト用の戻り値
    return showString;
  }

  // レベルアップ処理(宮田)
  public void levelUp() {
    this.level = this.level + 1;
    System.out.println("レベルが1上がった");
  }
}
