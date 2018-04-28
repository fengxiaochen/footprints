package fooprints.events.base

/**
  * Created by tonychan on 2018/4/27.
  */
trait EventUser {
  //事件主体人
  def event_user_id: Long
}

//abstract class EventUser(event_user_id: Long) extends EventUser