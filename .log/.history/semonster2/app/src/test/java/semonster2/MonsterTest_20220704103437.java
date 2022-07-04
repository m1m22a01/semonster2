package semonster2;

import org.junit.Test;

public class MonsterTest {
  @Test
  public void appHasAGreeting() {
    Monster classMonsterTest = new Monster();
    assertEquals("こんにちは SEMonster", classUnderTest.getGreeting());
  }
  // "スライム", "サハギン", "ドラゴン", "デュラハン", "シーサーペント"
}
