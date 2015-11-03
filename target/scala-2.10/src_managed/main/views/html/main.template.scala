
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object main extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template3[User,Html,Html,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(user: User = null, scripts: Html = Html(""))(content: Html):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.62*/("""

<!DOCTYPE html>

<html>
    <head>
        <title>"""),_display_(Seq[Any](/*7.17*/Messages("title"))),format.raw/*7.34*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*8.54*/routes/*8.60*/.Assets.at("stylesheets/bootstrap.css"))),format.raw/*8.99*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*9.54*/routes/*9.60*/.Assets.at("stylesheets/main.css"))),format.raw/*9.94*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*10.59*/routes/*10.65*/.Assets.at("images/favicon.png"))),format.raw/*10.97*/("""">
        <script src=""""),_display_(Seq[Any](/*11.23*/routes/*11.29*/.Assets.at("javascripts/jquery-1.7.1.min.js"))),format.raw/*11.74*/("""" type="text/javascript"></script>
        <script src=""""),_display_(Seq[Any](/*12.23*/routes/*12.29*/.Assets.at("javascripts/bootstrap.js"))),format.raw/*12.67*/("""" type="text/javascript"></script>
        """),_display_(Seq[Any](/*13.10*/scripts)),format.raw/*13.17*/("""
    </head>
	<body>
        <div class="navbar">
            <div class="navbar-inner">
                <div class="container-fluid">
                    <a class="brand" href=""""),_display_(Seq[Any](/*19.45*/routes/*19.51*/.Application.index())),format.raw/*19.71*/("""">If you reading this,weve succeded on puttin this baby online.please DONT fill in the form</a>
                    """),_display_(Seq[Any](/*20.22*/logged(user))),format.raw/*20.34*/("""
                    <div class="nav-collapse">
                        <ul class="nav">
                            <li class=""><a href=""""),_display_(Seq[Any](/*23.52*/routes/*23.58*/.Application.index())),format.raw/*23.78*/("""">subscribe</a></li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
        <div class="container">
          <div class="row">          
            """),_display_(Seq[Any](/*31.14*/content)),format.raw/*31.21*/("""
          </div>
        <div>
	</body>
</html>
"""))}
    }
    
    def render(user:User,scripts:Html,content:Html): play.api.templates.Html = apply(user,scripts)(content)
    
    def f:((User,Html) => (Html) => play.api.templates.Html) = (user,scripts) => (content) => apply(user,scripts)(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 03 12:54:54 CAT 2015
                    SOURCE: C:/Users/kayjee lahong/PlayStartApp2/app/views/main.scala.html
                    HASH: 0510e2785a49b813e21f0507b7d4750d65a96fac
                    MATRIX: 730->1|867->61|961->120|999->137|1097->200|1111->206|1171->245|1263->302|1277->308|1332->342|1430->404|1445->410|1499->442|1561->468|1576->474|1643->519|1737->577|1752->583|1812->621|1893->666|1922->673|2143->858|2158->864|2200->884|2354->1002|2388->1014|2567->1157|2582->1163|2624->1183|2886->1409|2915->1416
                    LINES: 26->1|29->1|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|41->13|41->13|47->19|47->19|47->19|48->20|48->20|51->23|51->23|51->23|59->31|59->31
                    -- GENERATED --
                */
            