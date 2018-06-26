import backend.GetSupportCityResponse

import scala.concurrent.{Await, Future}
import scala.concurrent.duration._

object MyApp extends App
{
  
  println(1232)
  
  val service = (new backend.WeatherWebServiceSoap12Bindings with
    scalaxb.SoapClientsAsync with
    scalaxb.DispatchHttpClientsAsync {}).service
    
  val fresponse: Future[GetSupportCityResponse] = service.getSupportCity(Some("ALL"))
  val response: GetSupportCityResponse = Await.result(fresponse, 10 seconds)
  println(response)
  
}
