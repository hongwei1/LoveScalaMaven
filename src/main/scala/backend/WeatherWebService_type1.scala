// Generated by <a href="http://scalaxb.org/">scalaxb</a>.
package backend


case class GetSupportCity(byProvinceName: Option[String] = None)
      


case class GetSupportCityResponse(getSupportCityResult: Option[backend.ArrayOfString] = None)
      


case class ArrayOfString(string: Seq[Option[String]] = Nil)
      


case class GetSupportProvince()
      


case class GetSupportProvinceResponse(getSupportProvinceResult: Option[backend.ArrayOfString] = None)
      


case class GetSupportDataSet()
      


case class GetSupportDataSetResult(schema: scalaxb.DataRecord[Any],
  any: scalaxb.DataRecord[Any])
      


case class GetSupportDataSetResponse(getSupportDataSetResult: Option[backend.GetSupportDataSetResult] = None)
      


case class GetWeatherbyCityName(theCityName: Option[String] = None)
      


case class GetWeatherbyCityNameResponse(getWeatherbyCityNameResult: Option[backend.ArrayOfString] = None)
      


case class GetWeatherbyCityNamePro(theCityName: Option[String] = None,
  theUserID: Option[String] = None)
      


case class GetWeatherbyCityNameProResponse(getWeatherbyCityNameProResult: Option[backend.ArrayOfString] = None)
      


case class DataSet(schema: scalaxb.DataRecord[Any],
  any: scalaxb.DataRecord[Any])
      

