
package views.html.dashboard

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
object index extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[User,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(user: User):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.14*/("""

"""),_display_(Seq[Any](/*3.2*/main(user)/*3.12*/ {_display_(Seq[Any](format.raw/*3.14*/("""

    DASHBOARD Example

""")))})))}
    }
    
    def render(user:User): play.api.templates.Html = apply(user)
    
    def f:((User) => play.api.templates.Html) = (user) => apply(user)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Oct 06 10:58:30 CAT 2015
                    SOURCE: C:/Users/kayjee lahong/PlayStartApp2/app/views/dashboard/index.scala.html
                    HASH: 82d9e2eb4b432a04236588ea627ec6ff34c9ecfc
                    MATRIX: 731->1|820->13|857->16|875->26|914->28
                    LINES: 26->1|29->1|31->3|31->3|31->3
                    -- GENERATED --
                */
            