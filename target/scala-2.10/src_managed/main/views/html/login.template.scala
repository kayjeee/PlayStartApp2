
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
object login extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[Application.Login],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(loginForm: Form[Application.Login]):play.api.templates.Html = {
        _display_ {import helper._

implicit def /*4.2*/implicitFieldConstructor/*4.26*/ = {{ FieldConstructor(twitterBootstrapInput.render) }};
Seq[Any](format.raw/*1.38*/("""

"""),format.raw/*4.80*/("""

<h3>"""),_display_(Seq[Any](/*6.6*/Messages("signin.signin"))),format.raw/*6.31*/("""</h3>

"""),_display_(Seq[Any](/*8.2*/form(routes.Application.authenticate(), 'class -> "form-vertical")/*8.68*/ {_display_(Seq[Any](format.raw/*8.70*/("""

    """),_display_(Seq[Any](/*10.6*/if(loginForm.hasGlobalErrors)/*10.35*/ {_display_(Seq[Any](format.raw/*10.37*/("""
        <p class="error">
            <span class="label important">"""),_display_(Seq[Any](/*12.44*/loginForm/*12.53*/.globalError.message)),format.raw/*12.73*/("""</span>
        </p>
    """)))})),format.raw/*14.6*/("""

    <fieldset>
        """),_display_(Seq[Any](/*17.10*/inputText(
            loginForm("email"),
            'placeholder -> Messages("email"),
            '_label -> null,
            '_help -> Messages("signin.your.email")
        ))),format.raw/*22.10*/("""
        """),_display_(Seq[Any](/*23.10*/inputPassword(
            loginForm("password"),
            '_label -> null,
            'placeholder -> Messages("password"),
            '_help -> Messages("signin.your.password")
        ))),format.raw/*28.10*/("""
    </fieldset>

    <div class="form-actions">
        <input type="submit" class="btn btn-primary" value=""""),_display_(Seq[Any](/*32.62*/Messages("signin.signin"))),format.raw/*32.87*/("""">
        <small><a href=""""),_display_(Seq[Any](/*33.26*/controllers/*33.37*/.account.routes.Reset.ask)),format.raw/*33.62*/("""">"""),_display_(Seq[Any](/*33.65*/Messages("forgot.password"))),format.raw/*33.92*/("""</a></small>
    </div>
""")))})),format.raw/*35.2*/("""
"""))}
    }
    
    def render(loginForm:Form[Application.Login]): play.api.templates.Html = apply(loginForm)
    
    def f:((Form[Application.Login]) => play.api.templates.Html) = (loginForm) => apply(loginForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Oct 06 10:58:29 CAT 2015
                    SOURCE: C:/Users/kayjee lahong/PlayStartApp2/app/views/login.scala.html
                    HASH: bbbc9e52f4029791772d564eca017bb6450ff4fb
                    MATRIX: 740->1|861->57|893->81|977->37|1006->135|1047->142|1093->167|1135->175|1209->241|1248->243|1290->250|1328->279|1368->281|1474->351|1492->360|1534->380|1591->406|1653->432|1855->612|1901->622|2116->815|2262->925|2309->950|2373->978|2393->989|2440->1014|2479->1017|2528->1044|2584->1069
                    LINES: 26->1|29->4|29->4|30->1|32->4|34->6|34->6|36->8|36->8|36->8|38->10|38->10|38->10|40->12|40->12|40->12|42->14|45->17|50->22|51->23|56->28|60->32|60->32|61->33|61->33|61->33|61->33|61->33|63->35
                    -- GENERATED --
                */
            