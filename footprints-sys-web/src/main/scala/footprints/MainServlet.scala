package footprints

import org.scalatra.ScalatraServlet
import org.scalatra.scalate.ScalateSupport
import org.slf4j.LoggerFactory

class MainServlet extends ScalatraServlet with ScalateSupport {
  val logger = LoggerFactory.getLogger(getClass)
  before() {
    contentType = "text/html"
  }

  get("/") {
    <html>
      <body>
        <h1>Hello, world!</h1>
        Say
        <a href="hello-scalate">hello to Scalate</a>
      </body>
    </html>
  }
  get("/hello") {
    <p>Hello, world!</p>
  }
  get("/hello1") {
    <p>Hello, world!</p>
  }



}