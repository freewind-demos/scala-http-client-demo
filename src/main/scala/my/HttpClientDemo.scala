package my

import com.softwaremill.sttp._

object HttpClientDemo extends App {

  implicit val backend: SttpBackend[Id, Nothing] = HttpURLConnectionBackend()

  val query = "http language:scala"
  val request = sttp
    .get(uri"https://api.github.com/search/repositories?q=$query")
    .headers(Map("header1" -> "value1"))
  val response = request.send()
  println(response.header("Content-Length"))
  println(response.unsafeBody)

}
