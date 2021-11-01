import com.twitter.finagle.Http
import com.twitter.util.Await

import io.finch._
import io.finch.circe._
import io.finch.syntax._
import io.circe.generic.auto._

object Main extends App {
  case class HelloResponse(message: String)

  val hello: Endpoint[HelloResponse] = get("hello") { Ok(HelloResponse("Hello world")) }

  Await.ready(Http.server.serve(":8080", (hello).toService))
}