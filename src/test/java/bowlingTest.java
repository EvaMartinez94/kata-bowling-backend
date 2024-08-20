import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;
import org.example.Main;
import org.junit.Test;

public class bowlingTest {

  @Test
  public void testParseScoreStrike() {
    String input = "X|7/|9-|X|-8|8/|-6|X|X|7/8";
    List<Integer> expected = Arrays.asList(10, 7, 3, 9, 0, 10, 0, 8, 8, 2, 0, 6, 10, 10, 7, 3, 8);
    assertEquals(expected, Main.parseScore(input));
  }

  @Test
  public void testParseScoreMisses() {
    String input = "--|--|--|--|--|--|--|--|--|--";
    List<Integer> expected =
        Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
    assertEquals(expected, Main.parseScore(input));
  }

  @Test
  public void testCalculateScore() {
    String input = "X|7/|9-|X|-8|8/|-6|X|X|7/8";
    Integer expectedScore = 167;
    assertEquals(expectedScore, Main.parseScore(input));
  }
}
