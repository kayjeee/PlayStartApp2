
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
object confirm extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

    /**/
    def apply():play.api.templates.Html = {
        _display_ {

Seq[Any](_display_(Seq[Any](/*1.2*/main()/*1.8*/ {_display_(Seq[Any](format.raw/*1.10*/("""

    <h3>"""),_display_(Seq[Any](/*3.10*/Messages("signup.signup"))),format.raw/*3.35*/(""" - """),_display_(Seq[Any](/*3.39*/Messages("confirmation"))),format.raw/*3.63*/("""</h3>

    """),_display_(Seq[Any](/*5.6*/wflash())),format.raw/*5.14*/("""

    <div class="form-actions">
        <a href=""""),_display_(Seq[Any](/*8.19*/routes/*8.25*/.Application.index)),format.raw/*8.43*/("""" class="btn">"""),_display_(Seq[Any](/*8.58*/Messages("goback"))),format.raw/*8.76*/("""</a>
    </div>
""")))})),format.raw/*10.2*/("""
"""))}
    }
    
    def render(): play.api.templates.Html = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Oct 06 10:58:30 CAT 2015
                    SOURCE: C:/Users/kayjee lahong/PlayStartApp2/app/views/account/signup/confirm.scala.html
                    HASH: be53ff5cca47ef4cb9d37faba943d8b08c72c093
                    MATRIX: 813->1|826->7|865->9|911->20|957->45|996->49|1041->73|1087->85|1116->93|1202->144|1216->150|1255->168|1305->183|1344->201|1392->218
                    LINES: 29->1|29->1|29->1|31->3|31->3|31->3|31->3|33->5|33->5|36->8|36->8|36->8|36->8|36->8|38->10
                    -- GENERATED --
                */
            