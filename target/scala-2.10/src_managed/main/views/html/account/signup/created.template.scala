
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
object created extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

    /**/
    def apply():play.api.templates.Html = {
        _display_ {

Seq[Any](_display_(Seq[Any](/*1.2*/main()/*1.8*/ {_display_(Seq[Any](format.raw/*1.10*/("""

    <h3>"""),_display_(Seq[Any](/*3.10*/Messages("signup.successfull"))),format.raw/*3.40*/("""</h3>
    """),_display_(Seq[Any](/*4.6*/Messages("signup.msg.created"))),format.raw/*4.36*/("""

    <div class="form-actions">
        <a href=""""),_display_(Seq[Any](/*7.19*/routes/*7.25*/.Application.index)),format.raw/*7.43*/("""" class="btn">"""),_display_(Seq[Any](/*7.58*/Messages("goback"))),format.raw/*7.76*/("""</a>
    </div>
""")))})))}
    }
    
    def render(): play.api.templates.Html = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Oct 06 10:58:30 CAT 2015
                    SOURCE: C:/Users/kayjee lahong/PlayStartApp2/app/views/account/signup/created.scala.html
                    HASH: 5a1f51be7d57422f50918c6882e4521b9e3accee
                    MATRIX: 813->1|826->7|865->9|911->20|962->50|1007->61|1058->91|1144->142|1158->148|1197->166|1247->181|1286->199
                    LINES: 29->1|29->1|29->1|31->3|31->3|32->4|32->4|35->7|35->7|35->7|35->7|35->7
                    -- GENERATED --
                */
            