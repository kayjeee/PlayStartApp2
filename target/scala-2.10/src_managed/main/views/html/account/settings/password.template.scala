
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
object password extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[User,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(user: User):play.api.templates.Html = {
        _display_ {import helper._


Seq[Any](format.raw/*1.14*/("""

"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/index(user)/*5.13*/ {_display_(Seq[Any](format.raw/*5.15*/("""

    """),_display_(Seq[Any](/*7.6*/Messages("account.settings.password"))),format.raw/*7.43*/("""

    """),_display_(Seq[Any](/*9.6*/wflash())),format.raw/*9.14*/("""

    """),_display_(Seq[Any](/*11.6*/form(controllers.account.settings.routes.Password.runPassword())/*11.70*/ {_display_(Seq[Any](format.raw/*11.72*/("""
        <div class="form-actions">
            <input type="submit" class="btn btn-primary" value=""""),_display_(Seq[Any](/*13.66*/Messages("reset"))),format.raw/*13.83*/("""">
        </div>
    """)))})),format.raw/*15.6*/("""

""")))})))}
    }
    
    def render(user:User): play.api.templates.Html = apply(user)
    
    def f:((User) => play.api.templates.Html) = (user) => apply(user)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Oct 06 10:58:30 CAT 2015
                    SOURCE: C:/Users/kayjee lahong/PlayStartApp2/app/views/account/settings/password.scala.html
                    HASH: a5b1cbe07519148ebfd3c3b45e802788b68125e8
                    MATRIX: 741->1|846->13|874->32|910->34|929->45|968->47|1009->54|1067->91|1108->98|1137->106|1179->113|1252->177|1292->179|1429->280|1468->297|1522->320
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|35->7|35->7|37->9|37->9|39->11|39->11|39->11|41->13|41->13|43->15
                    -- GENERATED --
                */
            