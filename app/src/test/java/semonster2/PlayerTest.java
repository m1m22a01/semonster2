package semonster2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PlayerTest {
  @Test
  public void showDeckTest() {
    Player player = new Player("OIT");
    String expected = "スライム1スライム1スライム1スライム1スライム1";

    assertEquals(expected, player.showDeck());
  }
}
