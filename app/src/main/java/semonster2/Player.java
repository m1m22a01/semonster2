package semonster2;

import java.util.ArrayList;

public class Player {
  String name; // 名前
  ArrayList<Monster> deck = new ArrayList<Monster>(); // デッキ
  int level; // レベル
  int deckNum = 5; // デッキ内のモンスター数

  // コンストラクタ
  public Player(String name) {
    this.name = name;
    this.level = 1;
    setDeck();
  }

  // デッキ生成
  public void setDeck() {
    for (int i = 0; i < deckNum; i++) {
      // モンスターの生成
      Monster monster = new Monster("スライム", 1);

      // デッキに登録
      this.deck.add(monster);
    }
  }

  // デッキ内容出力
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

}
