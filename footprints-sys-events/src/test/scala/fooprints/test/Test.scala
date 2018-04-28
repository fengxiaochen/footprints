package fooprints.test

import fooprints.events.util.manage.{ EventSources}


/**
  * Created by tonychan on 2018/4/27.
  */

object Test {
  def main(args: Array[String]) {
    print(new EventSources("TEST",1L,0,"TEST","TEST").event_cname)
  }
}
