// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/swatibhat/Documents/SOC TA/SOC-Lab-4-Ebean/Lab-4-Working/Frontend/conf/routes
// @DATE:Thu Feb 06 05:54:52 PST 2020


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
