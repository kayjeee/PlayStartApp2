
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
object ask extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[controllers.account.Reset.AskForm],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(askForm: Form[controllers.account.Reset.AskForm]):play.api.templates.Html = {
        _display_ {import helper._

implicit def /*4.2*/implicitFieldConstructor/*4.26*/ = {{ FieldConstructor(twitterBootstrapInput.render) }};
Seq[Any](format.raw/*1.52*/("""

"""),format.raw/*4.80*/("""


"""),_display_(Seq[Any](/*7.2*/main()/*7.8*/ {_display_(Seq[Any](format.raw/*7.10*/("""

    <h3>"""),_display_(Seq[Any](/*9.10*/Messages("resetpassword"))),format.raw/*9.35*/("""</h3>

    """),_display_(Seq[Any](/*11.6*/wflash())),format.raw/*11.14*/("""

    """),_display_(Seq[Any](/*13.6*/form(controllers.account.routes.Reset.runAsk())/*13.53*/ {_display_(Seq[Any](format.raw/*13.55*/("""

        <fieldset>
            """),_display_(Seq[Any](/*16.14*/inputText(
            askForm("email"),
            'placeholder -> Messages("email"),
            '_label -> null
            ))),format.raw/*20.14*/("""
        </fieldset>

        <div class="form-actions">
            <input type="submit" class="btn btn-primary" value=""""),_display_(Seq[Any](/*24.66*/Messages("reset"))),format.raw/*24.83*/("""">

            <a href=""""),_display_(Seq[Any](/*26.23*/routes/*26.29*/.Application.index)),format.raw/*26.47*/("""" class="btn">"""),_display_(Seq[Any](/*26.62*/Messages("goback"))),format.raw/*26.80*/("""</a>
        </div>
    """)))})),format.raw/*28.6*/("""


""")))})),format.raw/*31.2*/("""
"""))}
    }
    
    def render(askForm:Form[controllers.account.Reset.AskForm]): play.api.templates.Html = apply(askForm)
    
    def f:((Form[controllers.account.Reset.AskForm]) => play.api.templates.Html) = (askForm) => apply(askForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Oct 06 10:58:30 CAT 2015
                    SOURCE: C:/Users/kayjee lahong/PlayStartApp2/app/views/account/reset/ask.scala.html
                    HASH: 3a5cd6472fb5a834523b119b302c8e6ad5131682
                    MATRIX: 768->1|903->71|935->95|1019->51|1048->149|1086->153|1099->159|1138->161|1184->172|1230->197|1277->209|1307->217|1349->224|1405->271|1445->273|1515->307|1666->436|1824->558|1863->575|1925->601|1940->607|1980->625|2031->640|2071->658|2127->683|2162->687
                    LINES: 26->1|29->4|29->4|30->1|32->4|35->7|35->7|35->7|37->9|37->9|39->11|39->11|41->13|41->13|41->13|44->16|48->20|52->24|52->24|54->26|54->26|54->26|54->26|54->26|56->28|59->31
                    -- GENERATED --
                */
            