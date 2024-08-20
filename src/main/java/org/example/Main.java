package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
  private static final Integer STRIKE = 10;
  private static final Integer SPARE = 10;
  private static final Integer FINAL_ROUND = 10;

  public static void main(String[] args) {
    String input = "X|7/|9-|X|-8|8/|-6|X|X||X81";
    List<Integer> intList = parseScore(input);
    Integer totalScore = 0;
    Integer round = 0;
    for (int i = 0; i < intList.size() && round < FINAL_ROUND; i++) {
      Integer value = intList.get(i);
      if (FINAL_ROUND == round && STRIKE == value) {
        totalScore += STRIKE;
      } else if (FINAL_ROUND == round && SPARE == value + intList.get(i + 1)) {
        totalScore += value + intList.get(i + 1);
      } else if (STRIKE == value) {
        totalScore += STRIKE + intList.get(i + 1) + intList.get(i + 2);
      } else if (SPARE == value + intList.get(i + 1)) {
        totalScore += value + intList.get(i + 1) + intList.get(i + 2);
        i++;
      } else {
        totalScore += value + intList.get(i + 1);
        i++;
      }
      round++;
    }
    System.out.println(totalScore);
  }

  public static List<Integer> parseScore(String input) {
    List<Integer> intList = new ArrayList<>();
    input = input.replace("||", "|");

    String[] frames = input.split("\\|");

    for (String frame : frames) {
      for (int i = 0; i < frame.length(); i++) {
        char c = frame.charAt(i);

        if (c == 'X') {
          intList.add(10);
        } else if (c == '/') {
          int previousValue = intList.get(intList.size() - 1);
          intList.add(10 - previousValue);
        } else if (c == '-') {
          intList.add(0);
        } else {
          intList.add(Character.getNumericValue(c));
        }
      }
    }
    System.out.println(intList);
    return intList;
  }
}
