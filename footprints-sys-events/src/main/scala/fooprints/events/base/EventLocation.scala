package fooprints.events.base

/**
  * Created by tonychan on 2018/4/27.
  */
trait EventLocation {
  def loc_time: Long

  def lng: Double

  def lat: Double

  def province: String

  def city: String

  def distinct: String

  def address: String

}
