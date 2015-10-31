
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
object reset extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Form[controllers.account.Reset.ResetForm],String,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(resetForm: Form[controllers.account.Reset.ResetForm], token:String):play.api.templates.Html = {
        _display_ {import helper._

def /*6.2*/scripts/*6.9*/:play.api.templates.Html = {_display_(

Seq[Any](format.raw/*6.13*/("""
    <script src=""""),_display_(Seq[Any](/*7.19*/routes/*7.25*/.Assets.at("javascripts/password.js"))),format.raw/*7.62*/("""" type="text/javascript"></script>
""")))};implicit def /*4.2*/implicitFieldConstructor/*4.26*/ = {{ FieldConstructor(twitterBootstrapInput.render) }};
Seq[Any](format.raw/*1.70*/("""

"""),format.raw/*4.80*/("""

"""),format.raw/*8.2*/("""

"""),_display_(Seq[Any](/*10.2*/main(null, scripts)/*10.21*/ {_display_(Seq[Any](format.raw/*10.23*/("""

    <h3>"""),_display_(Seq[Any](/*12.10*/Messages("signup.reset.password"))),format.raw/*12.43*/("""</h3>

    """),_display_(Seq[Any](/*14.6*/wflash())),format.raw/*14.14*/("""

    """),_display_(Seq[Any](/*16.6*/Messages("resetpassword.new.password"))),format.raw/*16.44*/("""
    """),_display_(Seq[Any](/*17.6*/form(controllers.account.routes.Reset.runReset(token))/*17.60*/ {_display_(Seq[Any](format.raw/*17.62*/("""

        <fieldset>
            """),_display_(Seq[Any](/*20.14*/inputPassword(
                resetForm("inputPassword"),
                'placeholder -> Messages("password"),
                '_label -> null
            ))),format.raw/*24.14*/("""
            <h6>"""),_display_(Seq[Any](/*25.18*/Messages("signup.generate.password"))),format.raw/*25.54*/("""</h6>
            <input type="text" name="passwordGenerated">

        </fieldset>

        <div class="form-actions">
            <input type="submit" class="btn btn-primary" value=""""),_display_(Seq[Any](/*31.66*/Messages("validate"))),format.raw/*31.86*/("""">
            <a href=""""),_display_(Seq[Any](/*32.23*/routes/*32.29*/.Application.index)),format.raw/*32.47*/("""" class="btn">"""),_display_(Seq[Any](/*32.62*/Messages("goback"))),format.raw/*32.80*/("""</a>
        </div>
    """)))})),format.raw/*34.6*/("""
""")))})),format.raw/*35.2*/("""
"""))}
    }
    
    def render(resetForm:Form[controllers.account.Reset.ResetForm],token:String): play.api.templates.Html = apply(resetForm,token)
    
    def f:((Form[controllers.account.Reset.ResetForm],String) => play.api.templates.Html) = (resetForm,token) => apply(resetForm,token)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Oct 06 10:58:30 CAT 2015
                    SOURCE: C:/Users/kayjee lahong/PlayStartApp2/app/views/account/reset/reset.scala.html
                    HASH: 818dd3b6a70681efbffe95b19595cc10a45f8b62
                    MATRIX: 779->1|923->170|937->177|1004->181|1058->200|1072->206|1130->243|1197->89|1229->113|1313->69|1342->167|1370->279|1408->282|1436->301|1476->303|1523->314|1578->347|1625->359|1655->367|1697->374|1757->412|1798->418|1861->472|1901->474|1971->508|2151->666|2205->684|2263->720|2484->905|2526->925|2587->950|2602->956|2642->974|2693->989|2733->1007|2789->1032|2822->1034
                    LINES: 26->1|29->6|29->6|31->6|32->7|32->7|32->7|33->4|33->4|34->1|36->4|38->8|40->10|40->10|40->10|42->12|42->12|44->14|44->14|46->16|46->16|47->17|47->17|47->17|50->20|54->24|55->25|55->25|61->31|61->31|62->32|62->32|62->32|62->32|62->32|64->34|65->35
                    -- GENERATED --
                */
            