package semonster2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MonsterTest {
  @Test
  public void showMonsterTest() {
    Monster classMonsterTest = new Monster();
    assertEquals("デュラハン:レア度[0]", classMonsterTest.showMonster());
  }

  @Test
  public void MonsterConstructorTest() {
    assertEquals("a0", new Monster("a", 0));
  }
}
