
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
object index extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Form[Application.Register],Form[Application.Login],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(signupForm: Form[Application.Register], loginForm: Form[Application.Login]):play.api.templates.Html = {
        _display_ {
def /*3.2*/scripts/*3.9*/:play.api.templates.Html = {_display_(

Seq[Any](format.raw/*3.13*/("""
    <script src=""""),_display_(Seq[Any](/*4.19*/routes/*4.25*/.Assets.at("javascripts/password.js"))),format.raw/*4.62*/("""" type="text/javascript"></script>
""")))};
Seq[Any](format.raw/*1.78*/("""

"""),format.raw/*5.2*/("""

"""),_display_(Seq[Any](/*7.2*/main(null, scripts)/*7.21*/ {_display_(Seq[Any](format.raw/*7.23*/("""

  """),_display_(Seq[Any](/*9.4*/wflash())),format.raw/*9.12*/("""

  <div class="span3">
    
  </div>

  
    
    <div class="well">
      """),_display_(Seq[Any](/*18.8*/account/*18.15*/.signup.createFormOnly(signupForm))),format.raw/*18.49*/("""
    </div>
  </div>
""")))})))}
    }
    
    def render(signupForm:Form[Application.Register],loginForm:Form[Application.Login]): play.api.templates.Html = apply(signupForm,loginForm)
    
    def f:((Form[Application.Register],Form[Application.Login]) => play.api.templates.Html) = (signupForm,loginForm) => apply(signupForm,loginForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Oct 06 11:27:33 CAT 2015
                    SOURCE: C:/Users/kayjee lahong/PlayStartApp2/app/views/index.scala.html
                    HASH: 72e8ad4ccb4b36decfa72dc9d047809ed4d78914
                    MATRIX: 767->1|903->80|917->87|984->91|1038->110|1052->116|1110->153|1185->77|1213->189|1250->192|1277->211|1316->213|1355->218|1384->226|1496->303|1512->310|1568->344
                    LINES: 26->1|28->3|28->3|30->3|31->4|31->4|31->4|33->1|35->5|37->7|37->7|37->7|39->9|39->9|48->18|48->18|48->18
                    -- GENERATED --
                */
            