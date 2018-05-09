package fooprints.events.util.manage

import fooprints.events.base.EventSource


/**
  * Created by tonychan on 2018/4/27.
  */
class EventSources(var event_topic: String, var event_parent_id: Long, var event_id: Long, var event_status: Int,
                   var event_ename: String, var event_cname: String) extends EventSource {
  def getEventId(): Long = {
    System.currentTimeMillis()
  }

  def this(event_topic: String, event_id: Long, event_status: Int,
           event_ename: String, event_cname: String) = {
    this(event_topic, 0L, event_id, event_status, event_ename, event_cname)
  }

//  def this(event_topic: String, event_status: Int,
//           event_ename: String, event_cname: String) = {
//
//    this(event_topic, 0L, getEventId, event_status, event_ename, event_cname)
//
//  }

  //事件主题
  override def topic: String = event_topic

  //事件英文名称
  override def ename: String = event_ename

  //事件父id,比如拨打电话，一个应用中可能有多个入口，以事件id区分入口
  override def parent_id: Long = event_parent_id

  //事件中文名称
  override def cname: String = event_cname

  //状态 0 无效；1 有效
  override def status: Int = event_status

  //事件id
  override def id: Long = event_id
}
