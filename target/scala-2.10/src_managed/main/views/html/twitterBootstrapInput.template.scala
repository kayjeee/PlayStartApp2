
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
object twitterBootstrapInput extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[helper.FieldElements,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(elements: helper.FieldElements):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.34*/("""

"""),format.raw/*5.4*/("""
<div class="control-group """),_display_(Seq[Any](/*6.28*/if(elements.hasErrors)/*6.50*/ {_display_(Seq[Any](format.raw/*6.52*/("""error""")))})),format.raw/*6.58*/("""">
  <label class="control-label" for=""""),_display_(Seq[Any](/*7.38*/elements/*7.46*/.id)),format.raw/*7.49*/("""">"""),_display_(Seq[Any](/*7.52*/elements/*7.60*/.label)),format.raw/*7.66*/("""</label>
  <div class="controls">
    """),_display_(Seq[Any](/*9.6*/elements/*9.14*/.input)),format.raw/*9.20*/("""
    <p class="help-inline">"""),_display_(Seq[Any](/*10.29*/elements/*10.37*/.infos.mkString(", "))),format.raw/*10.58*/("""</p>
    """),_display_(Seq[Any](/*11.6*/if(elements.hasErrors)/*11.28*/ {_display_(Seq[Any](format.raw/*11.30*/("""
    <p class="help-inline">"""),_display_(Seq[Any](/*12.29*/elements/*12.37*/.errors.mkString(", "))),format.raw/*12.59*/("""</p>
    """)))})),format.raw/*13.6*/("""
  </div>
</div>"""))}
    }
    
    def render(elements:helper.FieldElements): play.api.templates.Html = apply(elements)
    
    def f:((helper.FieldElements) => play.api.templates.Html) = (elements) => apply(elements)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Oct 06 10:58:30 CAT 2015
                    SOURCE: C:/Users/kayjee lahong/PlayStartApp2/app/views/twitterBootstrapInput.scala.html
                    HASH: 171c41c88b174f227bedaa8fd977be5795476572
                    MATRIX: 753->1|862->33|890->98|953->126|983->148|1022->150|1059->156|1134->196|1150->204|1174->207|1212->210|1228->218|1255->224|1328->263|1344->271|1371->277|1436->306|1453->314|1496->335|1541->345|1572->367|1612->369|1677->398|1694->406|1738->428|1779->438
                    LINES: 26->1|29->1|31->5|32->6|32->6|32->6|32->6|33->7|33->7|33->7|33->7|33->7|33->7|35->9|35->9|35->9|36->10|36->10|36->10|37->11|37->11|37->11|38->12|38->12|38->12|39->13
                    -- GENERATED --
                */
            