package controllers

import javax.inject._
import play.api._
import play.api.mvc._
import play.api.libs.json.Writes._
import play.api.libs.json._

@Singleton
class HomeController @Inject()(cc: ControllerComponents)
  extends AbstractController(cc) {

  case class HelloResponse(message: String)

  implicit val placeWrites: Writes[HelloResponse] = Json.writes[HelloResponse]

  def helloWorld = Action { implicit request =>
    val json = Json.toJson(HelloResponse("Hello world"))
    Ok(json)
  }

}
