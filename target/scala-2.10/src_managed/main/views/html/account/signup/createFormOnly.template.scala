
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
object createFormOnly extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[Application.Register],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(signupForm: Form[Application.Register]):play.api.templates.Html = {
        _display_ {import helper._

implicit def /*4.2*/implicitFieldConstructor/*4.26*/ = {{ FieldConstructor(twitterBootstrapInput.render) }};
Seq[Any](format.raw/*1.42*/("""

"""),format.raw/*4.80*/("""



"""),_display_(Seq[Any](/*8.2*/form(controllers.account.routes.Signup.save())/*8.48*/ {_display_(Seq[Any](format.raw/*8.50*/("""

<fieldset>
    """),_display_(Seq[Any](/*11.6*/inputText(
        signupForm("email"),
        'placeholder -> Messages("email"),
        '_label -> null
    ))),format.raw/*15.6*/("""
    """),_display_(Seq[Any](/*16.6*/inputText(
        signupForm("fullname"),
        'placeholder -> Messages("fullname"),
        '_label -> null
    ))),format.raw/*20.6*/("""
    """),_display_(Seq[Any](/*21.6*/inputPassword(
        signupForm("inputPassword"),
        '_label -> null,
        'placeholder -> Messages("password")
    ))),format.raw/*25.6*/("""
    <h6>"""),_display_(Seq[Any](/*26.10*/Messages("signup.generate.password"))),format.raw/*26.46*/("""</h6>
    <input type="text" name="passwordGenerated" />
</fieldset>

<div class="form-actions">
    <input type="submit" class="btn primary" value=""""),_display_(Seq[Any](/*31.54*/Messages("signup.signup"))),format.raw/*31.79*/("""">
</div>
""")))})),format.raw/*33.2*/("""

"""))}
    }
    
    def render(signupForm:Form[Application.Register]): play.api.templates.Html = apply(signupForm)
    
    def f:((Form[Application.Register]) => play.api.templates.Html) = (signupForm) => apply(signupForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Oct 06 11:27:34 CAT 2015
                    SOURCE: C:/Users/kayjee lahong/PlayStartApp2/app/views/account/signup/createFormOnly.scala.html
                    HASH: 4eceb8d08dccbb2cf945b28ab33c56006189f8f0
                    MATRIX: 767->1|892->61|924->85|1008->41|1037->139|1076->144|1130->190|1169->192|1222->210|1355->322|1396->328|1535->446|1576->452|1724->579|1770->589|1828->625|2014->775|2061->800|2103->811
                    LINES: 26->1|29->4|29->4|30->1|32->4|36->8|36->8|36->8|39->11|43->15|44->16|48->20|49->21|53->25|54->26|54->26|59->31|59->31|61->33
                    -- GENERATED --
                */
            