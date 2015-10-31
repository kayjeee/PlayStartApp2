
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
object emailValidate extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[User,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(user: User):play.api.templates.Html = {
        _display_ {import helper._


Seq[Any](format.raw/*1.14*/("""

"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/index(user)/*5.13*/ {_display_(Seq[Any](format.raw/*5.15*/("""

    """),_display_(Seq[Any](/*7.6*/wflash())),format.raw/*7.14*/("""

""")))})))}
    }
    
    def render(user:User): play.api.templates.Html = apply(user)
    
    def f:((User) => play.api.templates.Html) = (user) => apply(user)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Oct 06 10:58:30 CAT 2015
                    SOURCE: C:/Users/kayjee lahong/PlayStartApp2/app/views/account/settings/emailValidate.scala.html
                    HASH: 2dd9fa2f7f12a8666f0385e28ed1f5770cdfc387
                    MATRIX: 746->1|851->13|879->32|915->34|934->45|973->47|1014->54|1043->62
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|35->7|35->7
                    -- GENERATED --
                */
            