package com.tlglearning.fizzbuzz.model;

import static org.junit.jupiter.api.Assertions.*;

import java.util.EnumSet;
import java.util.Set;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.ValueSource;

class AnalysisTest {

  static final Set<State> fizzExpected = EnumSet.of(State.FIZZ);
  static final Set<State> fizzBuzzExpected = EnumSet.of(State.FIZZ, State.BUZZ);
  Analysis analysis = new Analysis();

  @ParameterizedTest
  @ValueSource(ints = {3, 999_999_999})
  void fizzExpected(int value) {
    assertEquals(fizzExpected, analysis.analyze(value));

  }

  @ParameterizedTest
  @ValueSource(ints = {5, 25, 555_555_550})
  void analyze_buzzExpected(int value) {
    Set<State> expected = EnumSet.of(State.BUZZ);
    assertEquals(expected, analysis.analyze(value));

  }

  @ParameterizedTest
  @ValueSource(ints = {0, 15, 15, 999_999_990, 999_999_990})
  void analyze_fizzBuzzExpected(int value) {
    assertEquals(fizzBuzzExpected, analysis.analyze(value));

  }

  @ParameterizedTest
  @CsvFileSource(resources = "neither.csv", numLinesToSkip = 1)
  void analyze_neitherExpected(int value) {
    Set<State> expected = EnumSet.noneOf(State.class);
    assertEquals(expected, analysis.analyze(value));

  }
  @ParameterizedTest
  @ValueSource(ints = {-1,-3,-5,-15})
  void analyze_negative(int value){
    try {
      analysis.analyze(value);
      fail();

  }catch (IllegalArgumentException e){

    }
  }
}