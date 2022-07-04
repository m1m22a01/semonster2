package semonster2;

import org.junit.Test;

public class MonsterTest {
  @Test
  public void appHasAGreeting() {
    Monster classMonsterTest = new Monster();
    assertEquals("デュラハン:レア度[0]", classUnderTest.showMonster());
  }
  // "スライム", "サハギン", "ドラゴン", "デュラハン", "シーサーペント"
}
