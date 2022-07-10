package semonster2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MonsterTest {


  @Test
  public void MonsterConstructorTest() {
    Monster Test = new Monster("a", 0);
    assertEquals("a", Test.name);
    assertEquals(0, Test.rare);
  }

// <<<<<<< game
//   @Test
//   public void showMonsterTest() {
//     Monster monster = new Monster("a", 0);
//   }

// =======
// >>>>>>> main
}
