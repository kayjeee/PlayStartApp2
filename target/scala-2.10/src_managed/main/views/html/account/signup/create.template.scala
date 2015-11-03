
package views.html.account.signup

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
object create extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[Application.Register],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(signupForm: Form[Application.Register]):play.api.templates.Html = {
        _display_ {
def /*3.2*/scripts/*3.9*/:play.api.templates.Html = {_display_(

Seq[Any](format.raw/*3.13*/("""
    <script src=""""),_display_(Seq[Any](/*4.19*/routes/*4.25*/.Assets.at("javascripts/password.js"))),format.raw/*4.62*/("""" type="text/javascript"></script>
""")))};
Seq[Any](format.raw/*1.42*/("""

"""),format.raw/*5.2*/("""

"""),_display_(Seq[Any](/*7.2*/main(null, scripts)/*7.21*/ {_display_(Seq[Any](format.raw/*7.23*/("""
    <div class="span3">
        &nbsp;
    </div>

    <div class="span12">
        <div class="well">
            """),_display_(Seq[Any](/*14.14*/createFormOnly(signupForm))),format.raw/*14.40*/("""
        </div>
    </div>
""")))})))}
    }
    
    def render(signupForm:Form[Application.Register]): play.api.templates.Html = apply(signupForm)
    
    def f:((Form[Application.Register]) => play.api.templates.Html) = (signupForm) => apply(signupForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Oct 06 10:58:30 CAT 2015
                    SOURCE: C:/Users/kayjee lahong/PlayStartApp2/app/views/account/signup/create.scala.html
                    HASH: 8450aba5a4c044645849720383d1b3f30eaa85ad
                    MATRIX: 759->1|859->44|873->51|940->55|994->74|1008->80|1066->117|1141->41|1169->153|1206->156|1233->175|1272->177|1425->294|1473->320
                    LINES: 26->1|28->3|28->3|30->3|31->4|31->4|31->4|33->1|35->5|37->7|37->7|37->7|44->14|44->14
                    -- GENERATED --
                */
            