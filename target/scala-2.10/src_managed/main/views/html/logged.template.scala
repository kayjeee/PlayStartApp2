
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
object logged extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[User,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(user: User):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.14*/("""

"""),_display_(Seq[Any](/*3.2*/if(user != null)/*3.18*/ {_display_(Seq[Any](format.raw/*3.20*/("""
    <div class="btn-group pull-right">
        <a class="btn" href="#"><i class="icon-user"></i> """),_display_(Seq[Any](/*5.60*/user/*5.64*/.fullname)),format.raw/*5.73*/("""</a>
        <a class="btn dropdown-toggle" data-toggle="dropdown" href="#"><span class="caret"></span></a>
        <ul class="dropdown-menu">
            <li><a href=""""),_display_(Seq[Any](/*8.27*/controllers/*8.38*/.account.settings.routes.Index.index())),format.raw/*8.76*/(""""><i class="icon-wrench"></i> """),_display_(Seq[Any](/*8.107*/Messages("settings"))),format.raw/*8.127*/("""</a></li>
            <li class="divider"></li>
            <li><a href=""""),_display_(Seq[Any](/*10.27*/routes/*10.33*/.Application.logout())),format.raw/*10.54*/(""""><i class="icon-off"></i> """),_display_(Seq[Any](/*10.82*/Messages("logout"))),format.raw/*10.100*/("""</a></li>
        </ul>
    </div>
""")))})),format.raw/*13.2*/("""
"""))}
    }
    
    def render(user:User): play.api.templates.Html = apply(user)
    
    def f:((User) => play.api.templates.Html) = (user) => apply(user)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Oct 06 10:58:29 CAT 2015
                    SOURCE: C:/Users/kayjee lahong/PlayStartApp2/app/views/logged.scala.html
                    HASH: e5bc646e85efd0c8d8d28251b9f06762f7915fe2
                    MATRIX: 722->1|811->13|848->16|872->32|911->34|1045->133|1057->137|1087->146|1291->315|1310->326|1369->364|1436->395|1478->415|1588->489|1603->495|1646->516|1710->544|1751->562|1818->598
                    LINES: 26->1|29->1|31->3|31->3|31->3|33->5|33->5|33->5|36->8|36->8|36->8|36->8|36->8|38->10|38->10|38->10|38->10|38->10|41->13
                    -- GENERATED --
                */
            