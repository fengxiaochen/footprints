import javax.servlet.ServletContext

import org.scalatra._
import footprints.{EventSourceServlet, MainServlet}


class ScalatraBootstrap extends LifeCycle {
  override def init(context: ServletContext) {

    // Mount servlets.
    context.mount(new MainServlet, "/*")
    context.mount(new EventSourceServlet, "/source/*")


  }
}
