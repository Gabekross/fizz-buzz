package com.tlglearning.fizzbuzz.model;

import org.junit.jupiter.api.function.Executable;

public class InvalidInvocation implements Executable {

  private final Analysis analysis;

  public InvalidInvocation(Analysis analysis, int value) {
    this.analysis = analysis;
    this.value = value;
  }

  private final int value;


  @Override
  public void execute() throws Throwable {

    analysis.analyze(value);

  }

}
