package com.adaptionsoft.games.uglytrivia

import org.scalatest.FlatSpec

class GameSpec extends FlatSpec {

  "An empty Set" should "have size 0" in {
    assert(Set.empty.size == 0)
  }
}
