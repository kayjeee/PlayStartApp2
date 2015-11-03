
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
object index extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[User,Html,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(user: User)(content: Html):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.29*/("""

"""),_display_(Seq[Any](/*3.2*/main(user)/*3.12*/ {_display_(Seq[Any](format.raw/*3.14*/("""


<div class="container-fluid">
    <div class="row-fluid">
        <div class="span2">
            <ul class="breadcrumb">
                <li>
                    <a href=""""),_display_(Seq[Any](/*11.31*/controllers/*11.42*/.account.settings.routes.Password.index)),format.raw/*11.81*/("""">"""),_display_(Seq[Any](/*11.84*/Messages("password"))),format.raw/*11.104*/("""</a>
                </li>
                <li>
                    <a href=""""),_display_(Seq[Any](/*14.31*/controllers/*14.42*/.account.settings.routes.Email.index)),format.raw/*14.78*/("""">"""),_display_(Seq[Any](/*14.81*/Messages("email"))),format.raw/*14.98*/("""</a>
                </li>
            </ul>
        </div>
        <div class="span10">
            """),_display_(Seq[Any](/*19.14*/content)),format.raw/*19.21*/("""
        </div>
    </div>
</div>


""")))})))}
    }
    
    def render(user:User,content:Html): play.api.templates.Html = apply(user)(content)
    
    def f:((User) => (Html) => play.api.templates.Html) = (user) => (content) => apply(user)(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Oct 06 10:58:30 CAT 2015
                    SOURCE: C:/Users/kayjee lahong/PlayStartApp2/app/views/account/settings/index.scala.html
                    HASH: 846fab86da93f06b4af9c8a43dae789e275fe6ab
                    MATRIX: 743->1|847->28|884->31|902->41|941->43|1153->219|1173->230|1234->269|1273->272|1316->292|1430->370|1450->381|1508->417|1547->420|1586->437|1724->539|1753->546
                    LINES: 26->1|29->1|31->3|31->3|31->3|39->11|39->11|39->11|39->11|39->11|42->14|42->14|42->14|42->14|42->14|47->19|47->19
                    -- GENERATED --
                */
            