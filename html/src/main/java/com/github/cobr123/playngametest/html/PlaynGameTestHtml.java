package com.github.cobr123.playngametest.html;

import playn.core.PlayN;
import playn.html.HtmlGame;
import playn.html.HtmlPlatform;

import com.github.cobr123.playngametest.core.PlaynGameTest;

public class PlaynGameTestHtml extends HtmlGame {

  @Override
  public void start() {
    HtmlPlatform platform = HtmlPlatform.register();
    platform.assets().setPathPrefix("playngametest/");
    PlayN.run(new PlaynGameTest());
  }
}
