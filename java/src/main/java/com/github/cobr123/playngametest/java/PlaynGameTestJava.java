package com.github.cobr123.playngametest.java;

import playn.core.PlayN;
import playn.java.JavaPlatform;

import com.github.cobr123.playngametest.core.PlaynGameTest;

public class PlaynGameTestJava {

  public static void main(String[] args) {
    JavaPlatform platform = JavaPlatform.register();
    platform.assets().setPathPrefix("com/github/cobr123/playngametest/resources");
    PlayN.run(new PlaynGameTest());
  }
}
