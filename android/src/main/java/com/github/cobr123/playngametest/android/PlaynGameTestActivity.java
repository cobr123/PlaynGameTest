package com.github.cobr123.playngametest.android;

import playn.android.GameActivity;
import playn.core.PlayN;

import com.github.cobr123.playngametest.core.PlaynGameTest;

public class PlaynGameTestActivity extends GameActivity {

  @Override
  public void main(){
    platform().assets().setPathPrefix("com/github/cobr123/playngametest/resources");
    PlayN.run(new PlaynGameTest());
  }
}
