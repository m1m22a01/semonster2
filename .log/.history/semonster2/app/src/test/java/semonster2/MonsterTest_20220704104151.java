package semonster2;

import org.junit.Test;

public class MonsterTest {
  @Test
  public void showMonstertest() {
    Monster classMonsterTest = new Monster();
    assertEquals("デュラハン:レア度[0]", classMonsterTest.showMonster());
  }
}
