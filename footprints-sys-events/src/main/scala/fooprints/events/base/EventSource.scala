package fooprints.events.base

import java.util.Date

/**
  * Created by tonychan on 2018/4/27.
  */
trait EventSource {
  //事件主题
  def topic: String

  //事件父id,比如拨打电话，一个应用中可能有多个入口，以事件id区分入口
  def parent_id: Long

  //事件id
  def id: Long

  //状态 0 无效；1 有效
  def status: Int

  //事件中文名称
  def cname: String

  //事件英文名称
  def ename: String

}

