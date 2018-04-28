package fooprints.events.util

import fooprints.events.base.EventSource

/**
  * Created by tonychan on 2018/4/27.
  */
trait FootPrintsEventsManager {
  // register events
  def registerFootPrintsEvents(event:EventSource):Boolean
  // del events
  def delFootPrintsEvents(event:EventSource):Boolean

}
