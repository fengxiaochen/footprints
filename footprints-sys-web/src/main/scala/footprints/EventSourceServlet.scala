package footprints

import org.scalatra.ScalatraServlet
import org.scalatra.scalate.ScalateSupport
import org.slf4j.LoggerFactory

class EventSourceServlet extends ScalatraServlet with ScalateSupport {
  val logger = LoggerFactory.getLogger(getClass)
  before() {
    contentType = "text/html"
  }
  get("/source/query") {
    print("2222222222222222222222")
    <h1>Hello, world!1111111111</h1>
//    layoutTemplate("/WEB-INF/templates/views/index.ssp")
  }
//  get("/source/add") {
//    layoutTemplate("/WEB-INF/templates/views/index.ssp")
//  }
//  get("/source/del") {
//    layoutTemplate("/WEB-INF/templates/views/index.ssp")
//  }
//  get("/source/update") {
//    layoutTemplate("/WEB-INF/templates/views/index.ssp")
//  }
 
}