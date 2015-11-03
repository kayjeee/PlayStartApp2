
package views.html.account.settings

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
object email extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[User,Form[controllers.account.settings.Email.AskForm],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(user: User, askForm: Form[controllers.account.settings.Email.AskForm]):play.api.templates.Html = {
        _display_ {import helper._


Seq[Any](format.raw/*1.73*/("""

"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/index(user)/*5.13*/ {_display_(Seq[Any](format.raw/*5.15*/("""

    """),_display_(Seq[Any](/*7.6*/Messages("account.settings.email"))),format.raw/*7.40*/("""

    """),_display_(Seq[Any](/*9.6*/wflash())),format.raw/*9.14*/("""

    """),_display_(Seq[Any](/*11.6*/form(controllers.account.settings.routes.Email.runEmail())/*11.64*/ {_display_(Seq[Any](format.raw/*11.66*/("""

        <fieldset>
            """),_display_(Seq[Any](/*14.14*/inputText(
            askForm("email"),
            'placeholder -> Messages("email"),
            '_label -> null
            ))),format.raw/*18.14*/("""
        </fieldset>

        <div class="form-actions">
            <input type="submit" class="btn btn-primary" value=""""),_display_(Seq[Any](/*22.66*/Messages("validate"))),format.raw/*22.86*/("""">
        </div>
    """)))})),format.raw/*24.6*/("""

""")))})))}
    }
    
    def render(user:User,askForm:Form[controllers.account.settings.Email.AskForm]): play.api.templates.Html = apply(user,askForm)
    
    def f:((User,Form[controllers.account.settings.Email.AskForm]) => play.api.templates.Html) = (user,askForm) => apply(user,askForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Oct 06 10:58:30 CAT 2015
                    SOURCE: C:/Users/kayjee lahong/PlayStartApp2/app/views/account/settings/email.scala.html
                    HASH: 852fdf1c22f96cf75a40a79a8e9d2ec7c5c621dc
                    MATRIX: 787->1|951->72|979->91|1015->93|1034->104|1073->106|1114->113|1169->147|1210->154|1239->162|1281->169|1348->227|1388->229|1458->263|1609->392|1767->514|1809->534|1863->557
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|35->7|35->7|37->9|37->9|39->11|39->11|39->11|42->14|46->18|50->22|50->22|52->24
                    -- GENERATED --
                */
            