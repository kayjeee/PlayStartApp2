
package views.html.account.reset

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
object runAsk extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

    /**/
    def apply():play.api.templates.Html = {
        _display_ {import helper._

implicit def /*2.2*/implicitFieldConstructor/*2.26*/ = {{ FieldConstructor(twitterBootstrapInput.render) }};
Seq[Any](format.raw/*2.80*/("""


"""),_display_(Seq[Any](/*5.2*/main()/*5.8*/ {_display_(Seq[Any](format.raw/*5.10*/("""

    <h3>"""),_display_(Seq[Any](/*7.10*/Messages("resetpassword"))),format.raw/*7.35*/("""</h3>

    """),_display_(Seq[Any](/*9.6*/wflash())),format.raw/*9.14*/("""

    """),_display_(Seq[Any](/*11.6*/Messages("resetpassword.mailsent"))),format.raw/*11.40*/("""
    <div class="form-actions">
        <a href=""""),_display_(Seq[Any](/*13.19*/routes/*13.25*/.Application.index)),format.raw/*13.43*/("""" class="btn">"""),_display_(Seq[Any](/*13.58*/Messages("goback"))),format.raw/*13.76*/("""</a>
    </div>

""")))})),format.raw/*16.2*/("""
"""))}
    }
    
    def render(): play.api.templates.Html = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Oct 06 10:58:30 CAT 2015
                    SOURCE: C:/Users/kayjee lahong/PlayStartApp2/app/views/account/reset/runAsk.scala.html
                    HASH: bda788dd28cc8801e3ba086226624e266dd3a5c4
                    MATRIX: 811->18|843->42|927->96|965->100|978->106|1017->108|1063->119|1109->144|1155->156|1184->164|1226->171|1282->205|1368->255|1383->261|1423->279|1474->294|1514->312|1563->330
                    LINES: 29->2|29->2|30->2|33->5|33->5|33->5|35->7|35->7|37->9|37->9|39->11|39->11|41->13|41->13|41->13|41->13|41->13|44->16
                    -- GENERATED --
                */
            