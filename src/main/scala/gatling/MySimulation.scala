import io.gatling.core.Predef._
import io.gatling.http.Predef._
import scala.concurrent.duration._

class MySimulation extends Simulation {

val httpConfig = http
    .baseUrl("https://jsonplaceholder.typicode.com/posts/1") // A fake online REST API for testing
    .acceptHeader("application/json")

val scn = scenario("Test Scenario") // A scenario is a chain of requests and pauses
    .exec(http("request_1")
      .get("/"))

setUp(scn.inject(atOnceUsers(1))
    .protocols(httpConfig))

}