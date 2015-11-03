
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
object wflash extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

    /**/
    def apply():play.api.templates.Html = {
        _display_ {import helper._

import helper.twitterBootstrap._


Seq[Any](format.raw/*3.1*/("""
"""),_display_(Seq[Any](/*4.2*/flash/*4.7*/.map/*4.11*/ {/*5.5*/case (key, value) =>/*5.25*/ {_display_(Seq[Any](format.raw/*5.27*/("""
        <p class="">
            <span class="badge badge-"""),_display_(Seq[Any](/*7.39*/key)),format.raw/*7.42*/("""">"""),_display_(Seq[Any](/*7.45*/value)),format.raw/*7.50*/("""</span>
        </p>
    """)))}})))}
    }
    
    def render(): play.api.templates.Html = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Oct 06 10:58:30 CAT 2015
                    SOURCE: C:/Users/kayjee lahong/PlayStartApp2/app/views/wflash.scala.html
                    HASH: 0bc331129f5b68e2a2b225e2b33f4086f74572d2
                    MATRIX: 838->51|874->53|886->58|898->62|907->69|935->89|974->91|1069->151|1093->154|1131->157|1157->162
                    LINES: 32->3|33->4|33->4|33->4|33->5|33->5|33->5|35->7|35->7|35->7|35->7
                    -- GENERATED --
                */
            